import {
  AccountService,
  CreateProofRequest,
  CredentialService,
  InsertItemRequest,
  IssueRequest,
  VerifyProofRequest,
  WalletService,
} from "../src";
import { options } from "./env";
import "jasmine"
// @ts-ignore
import vaccineCertUnsignedPath from "./data/vaccination-certificate-unsigned.json";
// @ts-ignore
import vaccineCertFramePath from "./data/vaccination-certificate-frame.json";

async function vaccineDemo() {
  // createAccountService() {
  const accountService = new AccountService(options);
  // }

  // setupActors() {
  // Create 3 different profiles for each participant in the scenario
  const allison = await accountService.signIn();
  const clinic = await accountService.signIn();
  const airline = await accountService.signIn();
  // }

  accountService.options.authToken = clinic;
  const info = await accountService.info();
  console.log(`Account info=${info}`);

  // createService() {
  const walletService = new WalletService(options);
  const credentialService = new CredentialService(options);
  // }

  // issueCredential() {
  // Sign a credential as the clinic and send it to Allison
  const issueResponse = await credentialService.issueCredential(
    IssueRequest.fromPartial({ documentJson: JSON.stringify(vaccineCertUnsignedPath) })
  );
  // }
  console.log(`Credential=${issueResponse}`);

  // storeCredential() {
  // Alice stores the credential in her cloud wallet.
  walletService.options.authToken = allison;
  const insertResponse = await walletService.insertItem(
    InsertItemRequest.fromPartial({
      itemJson: issueResponse.signedDocumentJson,
    })
  );
  // }
  console.log(`Item id=${insertResponse.itemId}`);

  // shareCredential() {
  // Allison shares the credential with the venue.
  // The venue has communicated with Allison the details of the credential
  // that they require expressed as a JSON-LD frame.
  credentialService.options.authToken = allison;
  const proofResponse = await credentialService.createProof(
    CreateProofRequest.fromPartial({
      itemId: insertResponse.itemId,
      revealDocumentJson: JSON.stringify(vaccineCertFramePath),
    })
  );
  // }
  console.log(`Proof=${proofResponse.proofDocumentJson}`);

  // verifyCredential() {
  // The airline verifies the credential
  credentialService.options.authToken = airline;
  const verifyResponse = await credentialService.verifyProof(
    VerifyProofRequest.fromPartial({
      proofDocumentJson: proofResponse.proofDocumentJson,
    })
  );
  // }
  console.log(`Verification result=${verifyResponse.isValid}`);

  if (!verifyResponse.isValid) throw new Error("Verification should be true!");
}

describe("Demo: vaccination demo - credential issuance, storing, and verification", () => {
  it("should run the demo without raising exceptions", async () => {
    expect(async () => {
      await vaccineDemo();
    }).not.toThrow();
  });
});
