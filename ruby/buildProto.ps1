grpc_tools_ruby_protoc --proto_path=../proto `
                       --ruby_out=./lib/trinsic `
                       --grpc_out=./lib/trinsic `
                       ../proto/CoreService.proto `
                       ../proto/DebugService.proto `
                       ../proto/IssuerService.proto `
                       ../proto/ProviderService.proto `
                       ../proto/WalletService.proto `  # no PBMSE because it's duplicated from okapi
                       ../proto/models/Attributes.proto `
                       ../proto/models/Credentials.proto `
                       ../proto/models/CredentialTemplates.proto `
                       ../proto/models/Organizations.proto `
                       ../proto/models/Presentations.proto `
                       ../proto/models/PresentationTemplates.proto