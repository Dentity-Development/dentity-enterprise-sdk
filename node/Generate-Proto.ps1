# Generate protobuf files for JS and TS
param($OutDir = "$PSScriptRoot/src/proto")

# Windows
if ($IsWindows)
{
    $PROTOC_GEN_TS_PATH = Resolve-Path "$PSScriptRoot/node_modules/.bin/protoc-gen-ts.cmd"
}
else
{
    $PROTOC_GEN_TS_PATH = Resolve-Path "$PSScriptRoot/node_modules/.bin/protoc-gen-ts"
}
# For mac, `brew install protobuf`
# for windows, download and install to PATH
# for linux, `apt-get install protobuf`
$GRPC_TOOLS_NODE_PROTOC = "protoc"
$OUTPUT_DIR = $OutDir
$PROTO_DIR = Resolve-Path "$PSScriptRoot/../proto"

if ((Get-Command "$GRPC_TOOLS_NODE_PROTOC" -ErrorAction SilentlyContinue) -eq $null)
{
    Write-Host "Unable to find $GRPC_TOOLS_NODE_PROTOC in your PATH"
    Return
}

foreach ($Item in Get-ChildItem -Path $PROTO_DIR -Include *.proto -Recurse)
{
    $File = $Item.FullName

    # If you want to run in the same powershell window, use this:
    &"$GRPC_TOOLS_NODE_PROTOC" --plugin=protoc-gen-ts=$PROTOC_GEN_TS_PATH --js_out=import_style=commonjs,binary:$OUTPUT_DIR --ts_out=$OUTPUT_DIR -I $PROTO_DIR $File

    # JavaScript code generating
    #    &"$GRPC_TOOLS_NODE_PROTOC" --js_out=import_style=commonjs,binary:$OUTPUT_DIR --grpc_out=grpc_js:$OUTPUT_DIR -I $PROTO_DIR $File

    # TypeScript definitions
    #    &"$GRPC_TOOLS_NODE_PROTOC" --plugin=protoc-gen-ts=$PROTOC_GEN_TS_PATH --ts_out=grpc_js:$OUTPUT_DIR -I $PROTO_DIR $File
}