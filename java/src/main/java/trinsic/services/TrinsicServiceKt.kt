package trinsic.services

import trinsic.sdk.options.v1.Options

class TrinsicServiceKt @JvmOverloads constructor(options: Options.TrinsicOptions.Builder? = null) :
    ServiceBase(options) {
  private var _accessManagementService: AccessManagementServiceKt? = null
  private var _connectService: ConnectServiceKt? = null
  private var _credentialService: CredentialServiceKt? = null
  private var _providerService: ProviderServiceKt? = null
  private var _fileManagementService: FileManagementServiceKt? = null
  private var _credentialTemplateService: TemplateServiceKt? = null
  private var _trustRegistryService: TrustRegistryServiceKt? = null
  private var _walletService: WalletServiceKt? = null
  fun accessManagement(): AccessManagementServiceKt {
    if (_accessManagementService == null)
        _accessManagementService = AccessManagementServiceKt(optionsBuilder)
    return _accessManagementService!!
  }

  fun connect(): ConnectServiceKt {
    if (_connectService == null) _connectService = ConnectServiceKt(optionsBuilder)
    return _connectService!!
  }

  fun credential(): CredentialServiceKt {
    if (_credentialService == null) _credentialService = CredentialServiceKt(optionsBuilder)
    return _credentialService!!
  }

  fun fileManagement(): FileManagementServiceKt {
    if (_fileManagementService == null)
        _fileManagementService = FileManagementServiceKt(optionsBuilder)
    return _fileManagementService!!
  }

  fun template(): TemplateServiceKt {
    if (_credentialTemplateService == null)
        _credentialTemplateService = TemplateServiceKt(optionsBuilder)
    return _credentialTemplateService!!
  }

  fun provider(): ProviderServiceKt {
    if (_providerService == null) _providerService = ProviderServiceKt(optionsBuilder)
    return _providerService!!
  }

  fun trustRegistry(): TrustRegistryServiceKt {
    if (_trustRegistryService == null)
        _trustRegistryService = TrustRegistryServiceKt(optionsBuilder)
    return _trustRegistryService!!
  }

  fun wallet(): WalletServiceKt {
    if (_walletService == null) _walletService = WalletServiceKt(optionsBuilder)
    return _walletService!!
  }
}
