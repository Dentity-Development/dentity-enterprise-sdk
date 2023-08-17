package trinsic.services;

import trinsic.sdk.options.v1.Options;

public class TrinsicService extends ServiceBase {
  private AccessManagementService _accessManagementService;
  private ConnectService _connectService;
  private CredentialService _credentialService;
  private FileManagementService _fileManagementService;
  private TemplateService _TemplateService;
  private ProviderService _providerService;
  private TrustRegistryService _trustRegistryService;
  private WalletService _walletService;

  public TrinsicService() {
    this(null);
  }

  public TrinsicService(Options.TrinsicOptions.Builder options) {
    super(options);
  }

  public AccessManagementService accessManagement() {
    if (_accessManagementService == null)
      _accessManagementService = new AccessManagementService(this.getOptionsBuilder());
    return _accessManagementService;
  }

  public ConnectService connect() {
      if (_connectService == null)
          _connectService = new ConnectService(this.getOptionsBuilder());
      return _connectService;
  }

  public CredentialService credential() {
    if (_credentialService == null)
      _credentialService = new CredentialService(this.getOptionsBuilder());
    return _credentialService;
  }

  public FileManagementService fileManagement() {
    if (_fileManagementService == null)
      _fileManagementService = new FileManagementService(this.getOptionsBuilder());
    return _fileManagementService;
  }

  public TemplateService template() {
    if (_TemplateService == null) _TemplateService = new TemplateService(this.getOptionsBuilder());
    return _TemplateService;
  }

  public ProviderService provider() {
    if (_providerService == null) _providerService = new ProviderService(this.getOptionsBuilder());
    return _providerService;
  }

  public TrustRegistryService trustRegistry() {
    if (_trustRegistryService == null)
      _trustRegistryService = new TrustRegistryService(this.getOptionsBuilder());
    return _trustRegistryService;
  }

  public WalletService wallet() {
    if (_walletService == null) _walletService = new WalletService(this.getOptionsBuilder());
    return _walletService;
  }
}
