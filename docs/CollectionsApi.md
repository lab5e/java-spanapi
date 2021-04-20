# CollectionsApi

All URIs are relative to *https://api.lab5e.com/span*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spanBroadcastMessage**](CollectionsApi.md#spanBroadcastMessage) | **POST** /collections/{collectionId}/to | Broadcast message
[**spanCreateCollection**](CollectionsApi.md#spanCreateCollection) | **POST** /collections | Create collection
[**spanDeleteCollection**](CollectionsApi.md#spanDeleteCollection) | **DELETE** /collections/{collectionId} | Delete collection
[**spanListCollectionData**](CollectionsApi.md#spanListCollectionData) | **GET** /collections/{collectionId}/data | Get payloads
[**spanListCollections**](CollectionsApi.md#spanListCollections) | **GET** /collections | List collections
[**spanRetrieveCollection**](CollectionsApi.md#spanRetrieveCollection) | **GET** /collections/{collectionId} | Retrieve collection
[**spanUpdateCollection**](CollectionsApi.md#spanUpdateCollection) | **PATCH** /collections/{collectionId} | Update collection


<a name="spanBroadcastMessage"></a>
# **spanBroadcastMessage**
> MultiSendMessageResponse spanBroadcastMessage(collectionId, body)

Broadcast message

Broadcast a message to all devices in the collection. This request will always succeed if the collection exists, even if there are one or more send errors. Individual errors are returned as an array of error messages in the response. Use equivalent to resource for devices to send a message to single device.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    BroadcastMessageRequest body = new BroadcastMessageRequest(); // BroadcastMessageRequest | 
    try {
      MultiSendMessageResponse result = apiInstance.spanBroadcastMessage(collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#spanBroadcastMessage");
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
 **body** | [**BroadcastMessageRequest**](BroadcastMessageRequest.md)|  |

### Return type

[**MultiSendMessageResponse**](MultiSendMessageResponse.md)

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

<a name="spanCreateCollection"></a>
# **spanCreateCollection**
> Collection spanCreateCollection(body)

Create collection

The returned collection is the collection stored in the backend. Defaults have been set. There are no required fields in a collection

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Collection body = new Collection(); // Collection | 
    try {
      Collection result = apiInstance.spanCreateCollection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#spanCreateCollection");
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
 **body** | [**Collection**](Collection.md)|  |

### Return type

[**Collection**](Collection.md)

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

<a name="spanDeleteCollection"></a>
# **spanDeleteCollection**
> Collection spanDeleteCollection(collectionId)

Delete collection

You must have write access to the collection

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The ID of the collection you want to delete
    try {
      Collection result = apiInstance.spanDeleteCollection(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#spanDeleteCollection");
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
 **collectionId** | **String**| The ID of the collection you want to delete |

### Return type

[**Collection**](Collection.md)

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

<a name="spanListCollectionData"></a>
# **spanListCollectionData**
> ListDataResponse spanListCollectionData(collectionId, limit, start, end, offset)

Get payloads

List the data received from all the devices in the collection.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection ID requested. This is included in the request path.
    Integer limit = 56; // Integer | Limit the number of payloads to return. The default is 512.
    String start = "start_example"; // String | Start of time range. The default is 24 hours ago. Value is in milliseconds since epoch.
    String end = "end_example"; // String | End of time range. The default is the current time stamp. Value is in milliseconds since epoch.
    String offset = "offset_example"; // String | The message offset based on the message ID. This parameter can't be combined with the start and end parameters. If no parameter is set the first N messages will be returned. If this parameter is set the next N messages (from newest to oldest) with message ID less than the offset will be returned.
    try {
      ListDataResponse result = apiInstance.spanListCollectionData(collectionId, limit, start, end, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#spanListCollectionData");
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
 **collectionId** | **String**| The collection ID requested. This is included in the request path. |
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

<a name="spanListCollections"></a>
# **spanListCollections**
> ListCollectionResponse spanListCollections()

List collections

Lists all the collections that one of your teams owns.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    try {
      ListCollectionResponse result = apiInstance.spanListCollections();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#spanListCollections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListCollectionResponse**](ListCollectionResponse.md)

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

<a name="spanRetrieveCollection"></a>
# **spanRetrieveCollection**
> Collection spanRetrieveCollection(collectionId)

Retrieve collection

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The collection ID of the collection you are requesting
    try {
      Collection result = apiInstance.spanRetrieveCollection(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#spanRetrieveCollection");
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
 **collectionId** | **String**| The collection ID of the collection you are requesting |

### Return type

[**Collection**](Collection.md)

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

<a name="spanUpdateCollection"></a>
# **spanUpdateCollection**
> Collection spanUpdateCollection(collectionId, body)

Update collection

You must have write access to the collection, ie. you must administer it

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | The ID of the collection. This is assigned by the backend.
    Collection body = new Collection(); // Collection | 
    try {
      Collection result = apiInstance.spanUpdateCollection(collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#spanUpdateCollection");
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
 **collectionId** | **String**| The ID of the collection. This is assigned by the backend. |
 **body** | [**Collection**](Collection.md)|  |

### Return type

[**Collection**](Collection.md)

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

