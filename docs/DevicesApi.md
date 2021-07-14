# DevicesApi

All URIs are relative to *https://api.lab5e.com/span*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDevice**](DevicesApi.md#createDevice) | **POST** /collections/{collectionId}/devices | Create device
[**deleteDevice**](DevicesApi.md#deleteDevice) | **DELETE** /collections/{collectionId}/devices/{deviceId} | Remove device.
[**listDeviceData**](DevicesApi.md#listDeviceData) | **GET** /collections/{collectionId}/devices/{deviceId}/data | Get payloads
[**listDevices**](DevicesApi.md#listDevices) | **GET** /collections/{collectionId}/devices | List devices in collection.
[**retrieveDevice**](DevicesApi.md#retrieveDevice) | **GET** /collections/{collectionId}/devices/{deviceId} | Retrieve device
[**sendMessage**](DevicesApi.md#sendMessage) | **POST** /collections/{collectionId}/devices/{deviceId}/to | Send message to a device.
[**updateDevice**](DevicesApi.md#updateDevice) | **PATCH** /collections/{existingCollectionId}/devices/{deviceId} | Update device. The device can be moved from one collection to another by setting the collection ID field to the new collection. You must have administrative access to both collections.


<a name="createDevice"></a>
# **createDevice**
> Device createDevice(collectionId, body)

Create device

Create a new device. This will add a device to the collection. You must have write access to the collection.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | This is the containing collection
    Device body = new Device(); // Device | 
    try {
      Device result = apiInstance.createDevice(collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#createDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **String**| This is the containing collection |
 **body** | [**Device**](Device.md)|  |

### Return type

[**Device**](Device.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="deleteDevice"></a>
# **deleteDevice**
> Device deleteDevice(collectionId, deviceId)

Remove device.

Remove device from collection

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String deviceId = "deviceId_example"; // String | 
    try {
      Device result = apiInstance.deleteDevice(collectionId, deviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#deleteDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **String**|  |
 **deviceId** | **String**|  |

### Return type

[**Device**](Device.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="listDeviceData"></a>
# **listDeviceData**
> ListDataResponse listDeviceData(collectionId, deviceId, limit, start, end, offset)

Get payloads

List the data received from the device. Use the query parameters to control what data you retrieve. The maximumnumber of data points is 100.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection ID. This is included in the request path.
    String deviceId = "deviceId_example"; // String | The device ID. This is included in the request path.
    Integer limit = 56; // Integer | Limit the number of payloads to return. The default is 512.
    String start = "start_example"; // String | Start of time range. The default is 24 hours ago. Value is in milliseconds since epoch.
    String end = "end_example"; // String | End of time range. The default is the current time stamp. Value is in milliseconds since epoch.
    String offset = "offset_example"; // String | The message offset based on the message ID. This parameter can't be combined with the start and end parameters. If no parameter is set the first N messages will be returned. If this parameter is set the next N messages (from newest to oldest) with message ID less than the offset will be returned.
    try {
      ListDataResponse result = apiInstance.listDeviceData(collectionId, deviceId, limit, start, end, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#listDeviceData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **String**| The collection ID. This is included in the request path. |
 **deviceId** | **String**| The device ID. This is included in the request path. |
 **limit** | **Integer**| Limit the number of payloads to return. The default is 512. | [optional]
 **start** | **String**| Start of time range. The default is 24 hours ago. Value is in milliseconds since epoch. | [optional]
 **end** | **String**| End of time range. The default is the current time stamp. Value is in milliseconds since epoch. | [optional]
 **offset** | **String**| The message offset based on the message ID. This parameter can&#39;t be combined with the start and end parameters. If no parameter is set the first N messages will be returned. If this parameter is set the next N messages (from newest to oldest) with message ID less than the offset will be returned. | [optional]

### Return type

[**ListDataResponse**](ListDataResponse.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="listDevices"></a>
# **listDevices**
> ListDevicesResponse listDevices(collectionId)

List devices in collection.

List devices in collection

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    try {
      ListDevicesResponse result = apiInstance.listDevices(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#listDevices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **String**|  |

### Return type

[**ListDevicesResponse**](ListDevicesResponse.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="retrieveDevice"></a>
# **retrieveDevice**
> Device retrieveDevice(collectionId, deviceId)

Retrieve device

Retrieve a single device

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String deviceId = "deviceId_example"; // String | 
    try {
      Device result = apiInstance.retrieveDevice(collectionId, deviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#retrieveDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **String**|  |
 **deviceId** | **String**|  |

### Return type

[**Device**](Device.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="sendMessage"></a>
# **sendMessage**
> SendMessageResponse sendMessage(collectionId, deviceId, body)

Send message to a device.

Send a message to the device

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String deviceId = "deviceId_example"; // String | 
    SendMessageRequest body = new SendMessageRequest(); // SendMessageRequest | 
    try {
      SendMessageResponse result = apiInstance.sendMessage(collectionId, deviceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#sendMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectionId** | **String**|  |
 **deviceId** | **String**|  |
 **body** | [**SendMessageRequest**](SendMessageRequest.md)|  |

### Return type

[**SendMessageResponse**](SendMessageResponse.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

<a name="updateDevice"></a>
# **updateDevice**
> Device updateDevice(existingCollectionId, deviceId, body)

Update device. The device can be moved from one collection to another by setting the collection ID field to the new collection. You must have administrative access to both collections.

Update device. The device can be moved from one collection to another by setting the collection ID field to the new collection. You must have administrative access to both collections.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String existingCollectionId = "existingCollectionId_example"; // String | 
    String deviceId = "deviceId_example"; // String | 
    UpdateDeviceRequest body = new UpdateDeviceRequest(); // UpdateDeviceRequest | 
    try {
      Device result = apiInstance.updateDevice(existingCollectionId, deviceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#updateDevice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **existingCollectionId** | **String**|  |
 **deviceId** | **String**|  |
 **body** | [**UpdateDeviceRequest**](UpdateDeviceRequest.md)|  |

### Return type

[**Device**](Device.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**201** | It&#39;s created. |  -  |
**400** | The request has an error. |  -  |
**401** | You can&#39;t touch this |  -  |
**404** | Couldn&#39;t find the resource. |  -  |
**409** | There&#39;s a resource conflict here. |  -  |
**500** | I&#39;m sorry. We are broken |  -  |
**0** | An unexpected error response. |  -  |

