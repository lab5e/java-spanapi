

# SendMessageRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collectionId** | **String** |  |  [optional]
**deviceId** | **String** |  |  [optional]
**port** | **Integer** |  |  [optional]
**payload** | **byte[]** |  |  [optional]
**transport** | **String** | Valid transports are \&quot;udp\&quot;, \&quot;coap\&quot;, \&quot;coap-pull\&quot;, \&quot;udp-pull\&quot;, \&quot;coap-push\&quot;, \&quot;udp-push\&quot;. \&quot;udp\&quot; is equivalent to \&quot;udp-push\&quot; and \&quot;coap\&quot; is equivalent to \&quot;coap-push\&quot;. Push messages are sent unsolicited to the device wheil pull messages are sent whenever the device wither sends data upstream (for UDP) or does a CoAP request to the CoAP service in span. |  [optional]
**coapPath** | **String** |  |  [optional]



