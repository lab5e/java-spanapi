# GatewaysApi

All URIs are relative to *https://api.lab5e.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGateway**](GatewaysApi.md#createGateway) | **POST** /span/collections/{collectionId}/gateways | Create gateway
[**deleteGateway**](GatewaysApi.md#deleteGateway) | **DELETE** /span/collections/{collectionId}/gateways/{gatewayId} | Delete gateway
[**gatewayCertificates**](GatewaysApi.md#gatewayCertificates) | **GET** /span/collections/{collectionId}/gateways/{gatewayId}/certs | Get issued certificate(s) for gateway
[**listGateways**](GatewaysApi.md#listGateways) | **GET** /span/collections/{collectionId}/gateways | List gateways
[**retrieveGateway**](GatewaysApi.md#retrieveGateway) | **GET** /span/collections/{collectionId}/gateways/{gatewayId} | Retrieve gateway
[**updateGateway**](GatewaysApi.md#updateGateway) | **PATCH** /span/collections/{existingCollectionId}/gateways/{gatewayId} | Update gateway


<a name="createGateway"></a>
# **createGateway**
> Gateway createGateway(collectionId, body)

Create gateway

Create a new gateway.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    InlineObject body = new InlineObject(); // InlineObject | 
    try {
      Gateway result = apiInstance.createGateway(collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#createGateway");
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
 **body** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**Gateway**](Gateway.md)

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

<a name="deleteGateway"></a>
# **deleteGateway**
> Gateway deleteGateway(collectionId, gatewayId)

Delete gateway

Remove a gateway from Span.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String gatewayId = "gatewayId_example"; // String | 
    try {
      Gateway result = apiInstance.deleteGateway(collectionId, gatewayId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#deleteGateway");
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
 **gatewayId** | **String**|  |

### Return type

[**Gateway**](Gateway.md)

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

<a name="gatewayCertificates"></a>
# **gatewayCertificates**
> GatewayCertificateResponse gatewayCertificates(collectionId, gatewayId)

Get issued certificate(s) for gateway

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String gatewayId = "gatewayId_example"; // String | 
    try {
      GatewayCertificateResponse result = apiInstance.gatewayCertificates(collectionId, gatewayId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#gatewayCertificates");
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
 **gatewayId** | **String**|  |

### Return type

[**GatewayCertificateResponse**](GatewayCertificateResponse.md)

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

<a name="listGateways"></a>
# **listGateways**
> ListGatewayResponse listGateways(collectionId)

List gateways

List the user&#39;s gatways, including built-in gateways.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    try {
      ListGatewayResponse result = apiInstance.listGateways(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#listGateways");
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

[**ListGatewayResponse**](ListGatewayResponse.md)

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

<a name="retrieveGateway"></a>
# **retrieveGateway**
> Gateway retrieveGateway(collectionId, gatewayId)

Retrieve gateway

Get gateway information

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String gatewayId = "gatewayId_example"; // String | 
    try {
      Gateway result = apiInstance.retrieveGateway(collectionId, gatewayId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#retrieveGateway");
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
 **gatewayId** | **String**|  |

### Return type

[**Gateway**](Gateway.md)

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

<a name="updateGateway"></a>
# **updateGateway**
> Gateway updateGateway(existingCollectionId, gatewayId, body)

Update gateway

Update a gateway in Span

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.GatewaysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    GatewaysApi apiInstance = new GatewaysApi(defaultClient);
    String existingCollectionId = "existingCollectionId_example"; // String | 
    String gatewayId = "gatewayId_example"; // String | 
    InlineObject1 body = new InlineObject1(); // InlineObject1 | 
    try {
      Gateway result = apiInstance.updateGateway(existingCollectionId, gatewayId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GatewaysApi#updateGateway");
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
 **gatewayId** | **String**|  |
 **body** | [**InlineObject1**](InlineObject1.md)|  |

### Return type

[**Gateway**](Gateway.md)

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

