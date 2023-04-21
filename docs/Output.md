

# Output

Output resource. The configuration depends on the kind of output type. There are five outputs: Webhooks, UDP forwarding, IFTTT events, MQTT client and MQTT broker. The MQTT broker output is just used to configure the built-in MQTT broker in Span.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**outputId** | **String** |  |  [optional] |
|**collectionId** | **String** |  |  [optional] |
|**type** | **OutputType** |  |  [optional] |
|**config** | [**OutputConfig**](OutputConfig.md) |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** |  |  [optional] |



