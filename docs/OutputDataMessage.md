

# OutputDataMessage

The output data message contains payload plus metadata for a payload received from a device.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **OutputMessageType** |  |  [optional]
**device** | [**Device**](Device.md) |  |  [optional]
**payload** | **byte[]** |  |  [optional]
**received** | **String** | Received time for message. Value is ms since epoch. |  [optional]
**transport** | **String** |  |  [optional]
**udpMetaData** | [**UDPMetadata**](UDPMetadata.md) |  |  [optional]
**coapMetaData** | [**CoAPMetadata**](CoAPMetadata.md) |  |  [optional]
**messageId** | **String** |  |  [optional]
**mqttMetaData** | [**MQTTMetadata**](MQTTMetadata.md) |  |  [optional]
**gatewayMetaData** | [**GatewayMetadata**](GatewayMetadata.md) |  |  [optional]
**gatewayId** | **String** |  |  [optional]



