

# Device

This a device

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceId** | **String** | The device ID is assigned by the backend. |  [optional]
**collectionId** | **String** |  |  [optional]
**tags** | **Map&lt;String, String&gt;** | Tags are metadata for the device that you can set. These are just strings. |  [optional]
**firmware** | [**FirmwareMetadata**](FirmwareMetadata.md) |  |  [optional]
**config** | [**DeviceConfig**](DeviceConfig.md) |  |  [optional]
**metadata** | [**DeviceMetadata**](DeviceMetadata.md) |  |  [optional]
**imsi** | **String** | The IMSI is the unique ID for the (e|nu|whatever)SIM card on your device. This is the primary identifier for your device on the network.  Deprecated: The IMSI is replaced by CellularIoTMetadata |  [optional]
**imei** | **String** | The IMEI number is the unique ID for your hardware as seen by the network. Obviously you might have a completely different view on things.  Deprecated: The IMEI is replaced by CellularIoTMetadata |  [optional]
**network** | [**NetworkMetadata**](NetworkMetadata.md) |  |  [optional]



