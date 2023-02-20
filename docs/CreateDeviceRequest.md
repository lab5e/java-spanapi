

# CreateDeviceRequest

Request object to create new devices

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tags** | **Map&lt;String, String&gt;** | Tags are metadata for the device that you can set. These are just strings. |  [optional]
**firmware** | [**FirmwareMetadata**](FirmwareMetadata.md) |  |  [optional]
**config** | [**DeviceConfig**](DeviceConfig.md) |  |  [optional]
**metadata** | [**DeviceMetadata**](DeviceMetadata.md) |  |  [optional]
**imsi** | **String** | Deprecated: The IMSI is replaced by CellularIoTMetadata |  [optional]
**imei** | **String** | The IMEI number is the unique ID for your hardware as seen by the network. Obviously you might have a completely different view on things. This field is deprecated.  Deprecated: The IMEI is replaced by CellularIoTMetadata |  [optional]
**network** | [**NetworkMetadata**](NetworkMetadata.md) |  |  [optional]



