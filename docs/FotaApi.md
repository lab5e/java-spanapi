# FotaApi

All URIs are relative to *https://api.lab5e.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clearFirmwareError**](FotaApi.md#clearFirmwareError) | **DELETE** /span/collections/{collectionId}/devices/{deviceId}/fwerror | Clear FOTA error |
| [**createFirmware**](FotaApi.md#createFirmware) | **POST** /span/collections/{collectionId}/firmware | Create firmware |
| [**createLabeledFirmware**](FotaApi.md#createLabeledFirmware) | **POST** /span/collections/{collectionId}/firmware/labeled | BETA: Create a labeled firmware image |
| [**deleteFirmware**](FotaApi.md#deleteFirmware) | **DELETE** /span/collections/{collectionId}/firmware/{imageId} | Delete firmware |
| [**firmwareUsage**](FotaApi.md#firmwareUsage) | **GET** /span/collections/{collectionId}/firmware/{imageId}/usage | Firmware usage |
| [**listFirmware**](FotaApi.md#listFirmware) | **GET** /span/collections/{collectionId}/firmware | List firmware |
| [**listLabeledFirmware**](FotaApi.md#listLabeledFirmware) | **GET** /span/collections/{collectionId}/firmware/labeled | BETA: List the labeled firmware images for a collection |
| [**retrieveFirmware**](FotaApi.md#retrieveFirmware) | **GET** /span/collections/{collectionId}/firmware/{imageId} | Retrieve firmware |
| [**retrieveFirmwareStats**](FotaApi.md#retrieveFirmwareStats) | **GET** /span/collections/{collectionId}/firmware/{imageId}/stats | Retrieve firmware statistics |
| [**updateFirmware**](FotaApi.md#updateFirmware) | **PATCH** /span/collections/{existingCollectionId}/firmware/{imageId} | Update firmware |


<a name="clearFirmwareError"></a>
# **clearFirmwareError**
> ClearFirmwareErrorResponse clearFirmwareError(collectionId, deviceId)

Clear FOTA error

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String deviceId = "deviceId_example"; // String | 
    try {
      ClearFirmwareErrorResponse result = apiInstance.clearFirmwareError(collectionId, deviceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#clearFirmwareError");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **String**|  | |
| **deviceId** | **String**|  | |

### Return type

[**ClearFirmwareErrorResponse**](ClearFirmwareErrorResponse.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

<a name="createFirmware"></a>
# **createFirmware**
> Firmware createFirmware(collectionId, body)

Create firmware

Firmware images must have unique version numbers and have an unique checksum. The checksum is calculated when the firmware image is uploaded.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    CreateFirmwareBody body = new CreateFirmwareBody(); // CreateFirmwareBody | 
    try {
      Firmware result = apiInstance.createFirmware(collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#createFirmware");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **String**|  | |
| **body** | [**CreateFirmwareBody**](CreateFirmwareBody.md)|  | |

### Return type

[**Firmware**](Firmware.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

<a name="createLabeledFirmware"></a>
# **createLabeledFirmware**
> CreateLabeledFirmwareResponse createLabeledFirmware(collectionId, version, label, imageRefImageRef, imageRefCreatedAt, imageRefFileName, imageRefLength, imageRefChecksum, imageRefSha256)

BETA: Create a labeled firmware image

Devices might need several different firmware images, depending on their configuration. Low-power devices usually have just a single firmware image but more complex devices might need several firmware images for their  subsystems. The firmware image must be uploaded prior to the call and the  returned data structure is included in the request.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String version = "version_example"; // String | 
    String label = "label_example"; // String | 
    String imageRefImageRef = "imageRefImageRef_example"; // String | 
    String imageRefCreatedAt = "imageRefCreatedAt_example"; // String | 
    String imageRefFileName = "imageRefFileName_example"; // String | 
    String imageRefLength = "imageRefLength_example"; // String | 
    String imageRefChecksum = "imageRefChecksum_example"; // String | 
    String imageRefSha256 = "imageRefSha256_example"; // String | 
    try {
      CreateLabeledFirmwareResponse result = apiInstance.createLabeledFirmware(collectionId, version, label, imageRefImageRef, imageRefCreatedAt, imageRefFileName, imageRefLength, imageRefChecksum, imageRefSha256);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#createLabeledFirmware");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **String**|  | |
| **version** | **String**|  | [optional] |
| **label** | **String**|  | [optional] |
| **imageRefImageRef** | **String**|  | [optional] |
| **imageRefCreatedAt** | **String**|  | [optional] |
| **imageRefFileName** | **String**|  | [optional] |
| **imageRefLength** | **String**|  | [optional] |
| **imageRefChecksum** | **String**|  | [optional] |
| **imageRefSha256** | **String**|  | [optional] |

### Return type

[**CreateLabeledFirmwareResponse**](CreateLabeledFirmwareResponse.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

<a name="deleteFirmware"></a>
# **deleteFirmware**
> Firmware deleteFirmware(collectionId, imageId)

Delete firmware

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String imageId = "imageId_example"; // String | 
    try {
      Firmware result = apiInstance.deleteFirmware(collectionId, imageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#deleteFirmware");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **String**|  | |
| **imageId** | **String**|  | |

### Return type

[**Firmware**](Firmware.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

<a name="firmwareUsage"></a>
# **firmwareUsage**
> FirmwareUsageResponse firmwareUsage(collectionId, imageId)

Firmware usage

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String imageId = "imageId_example"; // String | 
    try {
      FirmwareUsageResponse result = apiInstance.firmwareUsage(collectionId, imageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#firmwareUsage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **String**|  | |
| **imageId** | **String**|  | |

### Return type

[**FirmwareUsageResponse**](FirmwareUsageResponse.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

<a name="listFirmware"></a>
# **listFirmware**
> ListFirmwareResponse listFirmware(collectionId)

List firmware

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    try {
      ListFirmwareResponse result = apiInstance.listFirmware(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#listFirmware");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **String**|  | |

### Return type

[**ListFirmwareResponse**](ListFirmwareResponse.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

<a name="listLabeledFirmware"></a>
# **listLabeledFirmware**
> ListLabeledFirmwareResponse listLabeledFirmware(collectionId)

BETA: List the labeled firmware images for a collection

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    try {
      ListLabeledFirmwareResponse result = apiInstance.listLabeledFirmware(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#listLabeledFirmware");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **String**|  | |

### Return type

[**ListLabeledFirmwareResponse**](ListLabeledFirmwareResponse.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

<a name="retrieveFirmware"></a>
# **retrieveFirmware**
> Firmware retrieveFirmware(collectionId, imageId)

Retrieve firmware

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String imageId = "imageId_example"; // String | 
    try {
      Firmware result = apiInstance.retrieveFirmware(collectionId, imageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#retrieveFirmware");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **String**|  | |
| **imageId** | **String**|  | |

### Return type

[**Firmware**](Firmware.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

<a name="retrieveFirmwareStats"></a>
# **retrieveFirmwareStats**
> FirmwareStats retrieveFirmwareStats(collectionId, imageId)

Retrieve firmware statistics

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String imageId = "imageId_example"; // String | 
    try {
      FirmwareStats result = apiInstance.retrieveFirmwareStats(collectionId, imageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#retrieveFirmwareStats");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **collectionId** | **String**|  | |
| **imageId** | **String**|  | |

### Return type

[**FirmwareStats**](FirmwareStats.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

<a name="updateFirmware"></a>
# **updateFirmware**
> Firmware updateFirmware(existingCollectionId, imageId, body)

Update firmware

Only the version and tags fields can be updated. The other fields will be ignored.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.FotaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    FotaApi apiInstance = new FotaApi(defaultClient);
    String existingCollectionId = "existingCollectionId_example"; // String | 
    String imageId = "imageId_example"; // String | 
    UpdateFirmwareBody body = new UpdateFirmwareBody(); // UpdateFirmwareBody | 
    try {
      Firmware result = apiInstance.updateFirmware(existingCollectionId, imageId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FotaApi#updateFirmware");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **existingCollectionId** | **String**|  | |
| **imageId** | **String**|  | |
| **body** | [**UpdateFirmwareBody**](UpdateFirmwareBody.md)|  | |

### Return type

[**Firmware**](Firmware.md)

### Authorization

[APIToken](../README.md#APIToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **201** | It&#39;s created. |  -  |
| **400** | The request has an error. |  -  |
| **401** | You can&#39;t touch this |  -  |
| **404** | Couldn&#39;t find the resource. |  -  |
| **409** | There&#39;s a resource conflict here. |  -  |
| **500** | I&#39;m sorry. We are broken |  -  |
| **0** | An unexpected error response. |  -  |

