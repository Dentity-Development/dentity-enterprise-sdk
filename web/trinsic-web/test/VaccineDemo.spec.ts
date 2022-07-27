// @ts-ignore
import vaccineCertUnsigned from "../../test/data/vaccination-certificate-unsigned.json";
// @ts-ignore
import vaccineCertFrame from "../../test/data/vaccination-certificate-frame.json";
import { vaccineDemo } from "../../test/VaccineDemoShared";
import { setTestTimeout } from "../../test/env";

describe("Demo: vaccination demo - credential issuance, storing, and verification", () => {
  setTestTimeout();
  it("should run the demo without raising exceptions", async () => {
    let response = await vaccineDemo();
    expect(response.isValid).toBeTruthy();
  });
});