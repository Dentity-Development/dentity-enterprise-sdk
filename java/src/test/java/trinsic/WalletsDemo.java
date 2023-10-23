package trinsic;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.Assertions;
import trinsic.services.TrinsicService;
import trinsic.services.provider.v1.CreateEcosystemRequest;
import trinsic.services.universalwallet.v1.*;

public class WalletsDemo {
  public static void main(String[] args)
      throws IOException, ExecutionException, InterruptedException {
    run();
  }

  public static void run() throws IOException, ExecutionException, InterruptedException {
    // Create ecosystem
    var trinsic = new TrinsicService(TrinsicUtilities.getTrinsicTrinsicOptions());
    var ecosystemResponse =
        trinsic.provider().createEcosystem(CreateEcosystemRequest.getDefaultInstance()).get();
    var ecosystemId = ecosystemResponse.getEcosystem().getId();
    var account =
        trinsic
            .wallet()
            .createWallet(CreateWalletRequest.newBuilder().setEcosystemId(ecosystemId).build())
            .get();
    trinsic.setAuthToken(account.getAuthToken());

    var walletId = account.getWallet().getWalletId();

    var credentialJson =
        "{\"foo\":\"bar\"}"; // Doesn't need to actually be a credential for this test

    // insertItemWallet() {
    var insertResponse =
        trinsic
            .wallet()
            .insertItem(
                InsertItemRequest.newBuilder()
                    .setItemJson(credentialJson)
                    .setItemType("VerifiableCredential")
                    .build())
            .get();
    // }

    var itemId = insertResponse.getItemId();

    // getItem() {
    var getResponse =
        trinsic.wallet().getItem(GetItemRequest.newBuilder().setItemId(itemId).build()).get();
    // }

    // getWalletInfo() {
	var getWalletInfoResponse = trinsic.wallet().getWalletInfo(
        GetWalletInfoRequest.newBuilder().setWalletId(walletId).build()
    ).get();
	// }

	// getWalletFromExternalIdentity() {
    var getWalletFromExternalIdentityResponse = trinsic.wallet().getWalletFromExternalIdentity(
        GetWalletFromExternalIdentityRequest.newBuilder().setIdentity(
            WalletExternalIdentity.newBuilder()
                .setId("test@trinsic.id")
                .setProvider(1)
                .build())
    ).get();
	// }

    // Abuse scope to allow redeclaration of walletItems for docs injection niceness
    {
      // searchWalletBasic() {
      var walletItems = trinsic.wallet().searchWallet().get();
      // }

      Assertions.assertEquals(1, walletItems.getItemsCount());
    }

    // Delete item in-between searches
    // deleteItem() {
    trinsic.wallet().deleteItem(DeleteItemRequest.newBuilder().setItemId(itemId).build()).get();
    // }

    {
      // searchWalletSQL() {
      var walletItems =
          trinsic
              .wallet()
              .search(
                  SearchRequest.newBuilder()
                      .setQuery(
                          "SELECT c.id, c.type, c.data FROM c WHERE c.type ="
                              + " 'VerifiableCredential'")
                      .build())
              .get();
      // }

      Assertions.assertNotNull(walletItems);
      Assertions.assertEquals(0, walletItems.getItemsCount());
    }

    // deleteWallet() {
    trinsic
        .wallet()
        .deleteWallet(DeleteWalletRequest.newBuilder().setWalletId(walletId).build())
        .get();
    // }

    System.out.println("Wallets demo successful");
    trinsic.shutdown();
  }
}
