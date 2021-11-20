import io.grpc.ManagedChannel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import trinsic.services.common.v1.ProviderOuterClass;

import java.io.IOException;
import java.net.MalformedURLException;

class TrinsicServicesTest {

    @Test
    public void testServiceBaseSetProfile() throws InterruptedException {
        var walletService = new TrinsicWalletService(TrinsicUtilities.getTestServerConfig());

        Assertions.assertThrows(IllegalArgumentException.class, () -> walletService.getMetadata(null));
        walletService.shutdown();
    }

    @Test
    public void testProviderServiceInviteParticipant() throws IOException, DidException {
        var walletService = new TrinsicWalletService(TrinsicUtilities.getTestServerConfig());
        var walletProfile = walletService.createWallet("");
        var providerService = new TrinsicProviderService(TrinsicUtilities.getTestServerConfig());
        providerService.profile = walletProfile;
        var invitation = ProviderOuterClass.InviteRequest.newBuilder()
                .setParticipant(ProviderOuterClass.ParticipantType.participant_type_individual)
                .setDescription("I dunno")
                .setEmail("scott.phillips@trinsic.id")
                .build();
        var response = providerService.inviteParticipant(invitation);
        Assertions.assertNotNull(response);
    }


    @ParameterizedTest
    @ValueSource(strings = {"http://localhost:5000", "https://localhost:5000"})
    public void validUrlsShouldPass(String url) {
        Assertions.assertDoesNotThrow(() -> createAndShutdownChannel(url));
    }

    @ParameterizedTest
    @ValueSource(strings = {"http://localhost", "localhost:5000"})
    public void invalidUrlsShouldFail(String url) {
        Assertions.assertThrows(MalformedURLException.class, () -> createAndShutdownChannel(url));
    }

    private void createAndShutdownChannel(String myAddress) throws MalformedURLException {
        var channel = (ManagedChannel) TrinsicUtilities.getChannel(TrinsicUtilities.getConfigFromUrl(myAddress));
        channel.shutdownNow();
    }

    @Test
    public void testTrinsicServiceDemo() throws IOException, DidException {
        new VaccineDemo().run();
    }
}