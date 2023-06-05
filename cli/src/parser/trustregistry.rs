use clap::{App, AppSettings, Arg, ArgMatches, SubCommand};

use crate::error::Error;

#[derive(Debug, PartialEq)]
pub enum TrustRegistryCommand {
    Search(SearchArgs),
    RegisterMember(RegisterMemberArgs),
    UnregisterMember(UnregisterMemberArgs),
    GetMembershipStatus(GetMembershipStatusArgs),
    FetchData(FetchDataArgs),
}

#[derive(Debug, PartialEq, Clone)]
pub struct SearchArgs {
    pub query: String,
    pub continuation_token: Option<String>,
}

#[derive(Debug, PartialEq, Default)]
pub struct RegisterMemberArgs {
    pub member_id: MemberId,
    pub framework_id: String,
    pub valid_from: Option<u64>,
    pub valid_to: Option<u64>,
    pub schema_uri: String,
}

#[derive(Debug, PartialEq, Default)]
pub struct UnregisterMemberArgs {
    pub member_id: MemberId,
    pub framework_id: String,
    pub schema_uri: String,
}

#[derive(Debug, PartialEq, Clone)]
pub enum MemberId {
    Email(String),
    WalletId(String),
    DidUri(String),
    None,
}

impl Default for MemberId {
    fn default() -> Self {
        return MemberId::None;
    }
}

#[derive(Debug, PartialEq, Clone)]
pub struct GovernanceFrameworkArgs {
    pub governance_framework_uri: Option<String>,
    pub description: Option<String>,
}

#[derive(Debug, PartialEq, Default)]
pub struct GetMembershipStatusArgs {
    pub did_uri: String,
    pub schema_uri: String,
    pub framework_id: String,
}

#[derive(Debug, PartialEq, Default)]
pub struct FetchDataArgs {}

pub(crate) fn parse(args: &ArgMatches) -> Result<TrustRegistryCommand, Error> {
    if args.subcommand_matches("search").is_some() {
        search(&args.subcommand_matches("search").expect("Error parsing request"))
    } else if args.subcommand_matches("register-member").is_some() {
        register_member(&args.subcommand_matches("register-member").expect("Error parsing request"))
    } else if args.subcommand_matches("unregister-member").is_some() {
        unregister_member(&args.subcommand_matches("unregister-member").expect("Error parsing request"))
    } else if args.subcommand_matches("get-membership-status").is_some() {
        get_status(&args.subcommand_matches("get-membership-status").expect("Error parsing request"))
    } else {
        Err(Error::MissingArguments)
    }
}

fn search(args: &ArgMatches) -> Result<TrustRegistryCommand, Error> {
    Ok(TrustRegistryCommand::Search(SearchArgs {
        query: args
            .value_of("query")
            .map_or("SELECT * FROM _ WHERE _.type = 'FrameworkDefinition'".to_string(), |q| q.to_string()),
        continuation_token: args.value_of("continuation-token").map(|x| x.to_string()),
    }))
}

fn register_member(args: &ArgMatches) -> Result<TrustRegistryCommand, Error> {
    let command = TrustRegistryCommand::RegisterMember(RegisterMemberArgs {
        member_id: parse_member_id(args)?,
        schema_uri: args.value_of("schema").map(|q| q.into()).ok_or(Error::MissingArguments)?,
        framework_id: args.value_of("framework-id").map(|q| q.into()).ok_or(Error::MissingArguments)?,
        ..Default::default()
    });

    Ok(command)
}

fn parse_member_id(args: &ArgMatches) -> Result<MemberId, Error> {
    Ok(if args.is_present("did") {
        MemberId::DidUri(
            args.value_of("did")
                .map(|x| x.into())
                .ok_or(Error::InvalidArgument("invalid did".into()))?,
        )
    } else if args.is_present("email") {
        MemberId::Email(
            args.value_of("email")
                .map(|x| x.into())
                .ok_or(Error::InvalidArgument("invalid email".into()))?,
        )
    } else if args.is_present("wallet") {
        MemberId::WalletId(
            args.value_of("wallet")
                .map(|x| x.into())
                .ok_or(Error::InvalidArgument("invalid wallet".into()))?,
        )
    } else {
        return Err(Error::InvalidArgument("you must specify member using email, did, or wallet".into()));
    })
}

fn unregister_member(args: &ArgMatches) -> Result<TrustRegistryCommand, Error> {
    Ok(TrustRegistryCommand::UnregisterMember(UnregisterMemberArgs {
        member_id: parse_member_id(args)?,
        framework_id: args.value_of("framework-id").map(|q| q.into()).ok_or(Error::MissingArguments)?,
        schema_uri: args.value_of("schema").map(|q| q.into()).ok_or(Error::MissingArguments)?,
    }))
}

fn get_status(args: &ArgMatches) -> Result<TrustRegistryCommand, Error> {
    Ok(TrustRegistryCommand::GetMembershipStatus(GetMembershipStatusArgs {
        did_uri: args.value_of("did").map(|q| q.into()).ok_or(Error::MissingArguments)?,
        schema_uri: args.value_of("schema").map(|q| q.into()).ok_or(Error::MissingArguments)?,
        framework_id: args.value_of("framework-id").map(|q| q.into()).ok_or(Error::MissingArguments)?,
    }))
}

pub(crate) fn subcommand<'a, 'b>() -> App<'a> {
    SubCommand::with_name("trust-registry")
        .about("Manage Trust Registry membership and governance")
        .setting(AppSettings::SubcommandRequiredElseHelp)
        .subcommand(
            SubCommand::with_name("register-member")
            .setting(AppSettings::ArgRequiredElseHelp)
            .about("Register member as authoritative with a schema in a governance framework")
            .after_help("EXAMPLES:\r\n\ttrinsic trust-registry register-member --did <DID_URI> --schema 'https://schema.org/ExampleCredential' --framework-id 'urn:egf:example'")
            .arg(Arg::from_usage("-s --schema <SCHEMA_URI> 'Sets the schema URI'").required(true))
            .arg(Arg::from_usage("-f --framework-id <FRAMEWORK_ID> 'Sets the framework ID'").required(true))
            .arg(Arg::from_usage("-e --email <EMAIL> 'Sets the member using their email'").required(false))
            .arg(Arg::from_usage("-w --wallet <WALLET_ID> 'Sets the member using their wallet ID'").required(false))
            .arg(Arg::from_usage("-d --did <EMAIL> 'Sets the member using their public DID'").required(false)),
        )
        .subcommand(
            SubCommand::with_name("unregister-member")
            .setting(AppSettings::ArgRequiredElseHelp)
            .about("Unregister member as authoritative with a schema in a governance framework")
            .after_help("EXAMPLES:\r\n\ttrinsic trust-registry unregister-member --did <DID_URI> --schema 'https://schema.org/ExampleCredential' --framework-id 'urn:egf:example'")
            .arg(Arg::from_usage("-s --schema <SCHEMA_URI> 'Sets the schema URI'").required(true))
            .arg(Arg::from_usage("-f --framework-id <FRAMEWORK_ID> 'Sets the framework ID'").required(true))
            .arg(Arg::from_usage("-e --email <EMAIL> 'Sets the member using their email'").required(false))
            .arg(Arg::from_usage("-w --wallet <WALLET_ID> 'Sets the member using their wallet ID'").required(false))
            .arg(Arg::from_usage("-d --did <EMAIL> 'Sets the member using their public DID'").required(false)),
        )
        .subcommand(
            SubCommand::with_name("search")
                .about("Search trust registry")
                .arg(Arg::from_usage("-q --query <SQL> 'Sets custom query to use'").required(false))
                .arg(Arg::from_usage("-t --continuation-token <TOKEN> 'Sets the continuation token of a previous result set'").required(false)),
        )
        .subcommand(
            SubCommand::with_name("get-membership-status")
            .setting(AppSettings::ArgRequiredElseHelp)
            .about("Get the membership status of a given DID in a given EGF")
            .arg(Arg::from_usage("-d --did <DID> 'The DID of the member'"))
            .arg(Arg::from_usage("-s --schema <SCHEMA_URI> 'The schema URI'"))
            .arg(Arg::from_usage("-f --framework-id <FRAMEWORK_ID> 'The ecosystem governance framework ID, in the `urn:egf:` format'"))
        )
}
