use crate::parser::trustregistry::*;
use crate::proto::services::common::v1::ResponseStatus;
use crate::{
    grpc_channel, grpc_client_with_auth,
    proto::services::trustregistry::v1::{trust_registry_client::TrustRegistryClient, *},
};

use colored::Colorize;
use tonic::transport::Channel;

use super::config::{DefaultConfig, Error};

pub(crate) fn execute(args: &Command, config: &DefaultConfig) -> Result<(), Error> {
    match args {
        Command::Search(args) => search(args, config),
        Command::RegisterIssuer(args) => register_issuer(args, config),
        Command::RegisterVerifier(args) => register_verifier(args, config),
        Command::UnregisterIssuer(args) => unregister_issuer(args, config),
        Command::UnregisterVerifier(args) => unregister_verifier(args, config),
        Command::CheckIssuer(args) => check_issuer(args, config),
        Command::CheckVerifier(args) => check_verifier(args, config),
        Command::RegisterEgf(args) => add_framework(args, config),
        Command::UnregisterEgf(args) => remove_framework(args, config),
    }
}

#[tokio::main]
async fn search(args: &SearchArgs, config: &DefaultConfig) -> Result<(), Error> {
    let query = args
        .query
        .as_ref()
        .map_or("SELECT * FROM c".to_string(), |q| q.to_owned());

    let mut client = grpc_client_with_auth!(TrustRegistryClient<Channel>, config.to_owned());

    let request = tonic::Request::new(SearchRegistryRequest {
        query: query.clone(),
        ..Default::default()
    });

    let response = client.search_registry(request).await?.into_inner();

    println!("{}", response.items_json);

    Ok(())
}

#[tokio::main]
async fn register_issuer(args: &RegistrationArgs, config: &DefaultConfig) -> Result<(), Error> {
    let mut client = grpc_client_with_auth!(TrustRegistryClient<Channel>, config.to_owned());

    let request = tonic::Request::new(RegisterIssuerRequest {
        authority: Some(register_issuer_request::Authority::DidUri(
            args.did_uri.clone().unwrap(),
        )),
        credential_type_uri: args.type_uri.clone().expect("credential type is required"),
        governance_framework_uri: args
            .governance_framework_uri
            .clone()
            .expect("governance framework is required"),
        ..Default::default()
    });

    let response = client.register_issuer(request).await?.into_inner();

    println!(
        "{}",
        format!(": {:?}", ResponseStatus::from_i32(response.status).unwrap()).bright_yellow()
    );

    Ok(())
}

#[tokio::main]
async fn check_issuer(args: &RegistrationArgs, config: &DefaultConfig) -> Result<(), Error> {
    let mut client = grpc_client_with_auth!(TrustRegistryClient<Channel>, config.to_owned());

    let request = tonic::Request::new(CheckIssuerStatusRequest {
        member: Some(check_issuer_status_request::Member::DidUri(
            args.did_uri.clone().unwrap(),
        )),
        credential_type_uri: args.type_uri.clone().expect("credential type is required"),
        governance_framework_uri: args
            .governance_framework_uri
            .clone()
            .expect("governance framework is required"),
        ..Default::default()
    });

    let response = client.check_issuer_status(request).await?.into_inner();

    println!(
        "{}",
        format!(
            ": {:?}",
            RegistrationStatus::from_i32(response.status).unwrap()
        )
        .bright_yellow()
    );

    Ok(())
}

#[tokio::main]
async fn check_verifier(args: &RegistrationArgs, config: &DefaultConfig) -> Result<(), Error> {
    let mut client = grpc_client_with_auth!(TrustRegistryClient<Channel>, config.to_owned());

    let request = tonic::Request::new(CheckVerifierStatusRequest {
        member: Some(check_verifier_status_request::Member::DidUri(
            args.did_uri.clone().unwrap(),
        )),
        presentation_type_uri: args
            .type_uri
            .clone()
            .expect("presentation type is required"),
        governance_framework_uri: args
            .governance_framework_uri
            .clone()
            .expect("governance framework is required"),
        ..Default::default()
    });

    let response = client.check_verifier_status(request).await?.into_inner();

    println!(
        "{}",
        format!(
            ": {:?}",
            RegistrationStatus::from_i32(response.status).unwrap()
        )
        .bright_yellow()
    );

    Ok(())
}

#[tokio::main]
async fn unregister_issuer(args: &RegistrationArgs, config: &DefaultConfig) -> Result<(), Error> {
    let mut client = grpc_client_with_auth!(TrustRegistryClient<Channel>, config.to_owned());

    let request = tonic::Request::new(UnregisterIssuerRequest {
        authority: Some(unregister_issuer_request::Authority::DidUri(
            args.did_uri.clone().unwrap(),
        )),
        credential_type_uri: args.type_uri.clone().expect("credential type is required"),
        governance_framework_uri: args
            .governance_framework_uri
            .clone()
            .expect("governance framework is required"),
        ..Default::default()
    });

    let response = client.unregister_issuer(request).await?.into_inner();

    println!(
        "{}",
        format!(": {:?}", ResponseStatus::from_i32(response.status).unwrap()).bright_yellow()
    );

    Ok(())
}

#[tokio::main]
async fn unregister_verifier(args: &RegistrationArgs, config: &DefaultConfig) -> Result<(), Error> {
    let mut client = grpc_client_with_auth!(TrustRegistryClient<Channel>, config.to_owned());

    let request = tonic::Request::new(UnregisterVerifierRequest {
        authority: Some(unregister_verifier_request::Authority::DidUri(
            args.did_uri.clone().unwrap(),
        )),
        presentation_type_uri: args
            .type_uri
            .clone()
            .expect("presentation type is required"),
        governance_framework_uri: args
            .governance_framework_uri
            .clone()
            .expect("governance framework is required"),
        ..Default::default()
    });

    let response = client.unregister_verifier(request).await?.into_inner();

    println!(
        "{}",
        format!(": {:?}", ResponseStatus::from_i32(response.status).unwrap()).bright_yellow()
    );

    Ok(())
}

#[tokio::main]
async fn register_verifier(args: &RegistrationArgs, config: &DefaultConfig) -> Result<(), Error> {
    let mut client = grpc_client_with_auth!(TrustRegistryClient<Channel>, config.to_owned());

    let request = tonic::Request::new(RegisterVerifierRequest {
        authority: Some(register_verifier_request::Authority::DidUri(
            args.did_uri.clone().unwrap(),
        )),
        presentation_type_uri: args
            .type_uri
            .clone()
            .expect("presentation type is required"),
        governance_framework_uri: args
            .governance_framework_uri
            .clone()
            .expect("governance framework is required"),
        ..Default::default()
    });

    let response = client.register_verifier(request).await?.into_inner();

    println!(
        "{}",
        format!(": {:?}", ResponseStatus::from_i32(response.status).unwrap()).bright_yellow()
    );

    Ok(())
}

#[tokio::main]
async fn add_framework(args: &AddFrameworkArgs, config: &DefaultConfig) -> Result<(), Error> {
    let mut client = grpc_client_with_auth!(TrustRegistryClient<Channel>, config.to_owned());

    let request = tonic::Request::new(AddFrameworkRequest {
        governance_framework: Some(GovernanceFramework {
            governance_framework_uri: args.governance_framework_uri.clone(),
            description: args
                .description
                .as_ref()
                .map_or(String::default(), |x| x.clone()),
            ..Default::default()
        }),
    });

    let response = client.add_framework(request).await?.into_inner();

    println!(
        "{}",
        format!(": {:?}", ResponseStatus::from_i32(response.status).unwrap()).bright_yellow()
    );

    Ok(())
}

#[tokio::main]
async fn remove_framework(args: &RemoveFrameworkArgs, config: &DefaultConfig) -> Result<(), Error> {
    let mut client = grpc_client_with_auth!(TrustRegistryClient<Channel>, config.to_owned());

    let request = tonic::Request::new(RemoveFrameworkRequest {
        governance_framework: Some(GovernanceFramework {
            governance_framework_uri: args.governance_framework_uri.clone(),
            ..Default::default()
        }),
    });

    let response = client.remove_framework(request).await?.into_inner();

    println!(
        "{}",
        format!(": {:?}", ResponseStatus::from_i32(response.status).unwrap()).bright_yellow()
    );

    Ok(())
}
