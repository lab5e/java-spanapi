

# DeviceConfig

This is the configuration for the device via the various gateways.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ciot** | [**CellularIoTConfig**](CellularIoTConfig.md) |  |  [optional] |
|**inet** | **Object** | This is the configuration for an internet-connected device. There are currently no configuration options for internet devices; the device is identified via the clientcertificate.  This is empty since there&#39;s no configuration required for the internet  gateway |  [optional] |
|**gateway** | [**Map&lt;String, GatewayDeviceConfig&gt;**](GatewayDeviceConfig.md) |  |  [optional] |



