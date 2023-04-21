# BlobsApi

All URIs are relative to *https://api.lab5e.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteBlob**](BlobsApi.md#deleteBlob) | **DELETE** /span/collections/{collectionId}/blobs/{blobId} | Remove a blob stored on a collection |
| [**listBlobs**](BlobsApi.md#listBlobs) | **GET** /span/collections/{collectionId}/blobs | List the blobs for a collection |


<a name="deleteBlob"></a>
# **deleteBlob**
> Object deleteBlob(collectionId, blobId)

Remove a blob stored on a collection

Remove a blob stored on the collection.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.BlobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    BlobsApi apiInstance = new BlobsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String blobId = "blobId_example"; // String | 
    try {
      Object result = apiInstance.deleteBlob(collectionId, blobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlobsApi#deleteBlob");
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
| **blobId** | **String**|  | |

### Return type

**Object**

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

<a name="listBlobs"></a>
# **listBlobs**
> ListBlobResponse listBlobs(collectionId, limit)

List the blobs for a collection

Retrieve a list of all the blobs stored on this collection. Blobs are uploaded by the devices through one of the blob endpoints.

### Example
```java
// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.BlobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    BlobsApi apiInstance = new BlobsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListBlobResponse result = apiInstance.listBlobs(collectionId, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlobsApi#listBlobs");
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
| **limit** | **Integer**|  | [optional] |

### Return type

[**ListBlobResponse**](ListBlobResponse.md)

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

