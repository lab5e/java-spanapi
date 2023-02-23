/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.4.1 busy-janay
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span;

import com.lab5e.ApiCallback;
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.ApiResponse;
import com.lab5e.Configuration;
import com.lab5e.Pair;
import com.lab5e.ProgressRequestBody;
import com.lab5e.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.lab5e.span.model.ListBlobResponse;
import com.lab5e.span.model.Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlobsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BlobsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BlobsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for deleteBlob
     * @param collectionId  (required)
     * @param blobId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteBlobCall(String collectionId, String blobId, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/span/collections/{collectionId}/blobs/{blobId}"
            .replaceAll("\\{" + "collectionId" + "\\}", localVarApiClient.escapeString(collectionId.toString()))
            .replaceAll("\\{" + "blobId" + "\\}", localVarApiClient.escapeString(blobId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteBlobValidateBeforeCall(String collectionId, String blobId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new ApiException("Missing the required parameter 'collectionId' when calling deleteBlob(Async)");
        }
        
        // verify the required parameter 'blobId' is set
        if (blobId == null) {
            throw new ApiException("Missing the required parameter 'blobId' when calling deleteBlob(Async)");
        }
        

        okhttp3.Call localVarCall = deleteBlobCall(collectionId, blobId, _callback);
        return localVarCall;

    }

    /**
     * Remove a blob stored on a collection
     * Remove a blob stored on the collection.
     * @param collectionId  (required)
     * @param blobId  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Object deleteBlob(String collectionId, String blobId) throws ApiException {
        ApiResponse<Object> localVarResp = deleteBlobWithHttpInfo(collectionId, blobId);
        return localVarResp.getData();
    }

    /**
     * Remove a blob stored on a collection
     * Remove a blob stored on the collection.
     * @param collectionId  (required)
     * @param blobId  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> deleteBlobWithHttpInfo(String collectionId, String blobId) throws ApiException {
        okhttp3.Call localVarCall = deleteBlobValidateBeforeCall(collectionId, blobId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Remove a blob stored on a collection (asynchronously)
     * Remove a blob stored on the collection.
     * @param collectionId  (required)
     * @param blobId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteBlobAsync(String collectionId, String blobId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteBlobValidateBeforeCall(collectionId, blobId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listBlobs
     * @param collectionId  (required)
     * @param limit  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listBlobsCall(String collectionId, Integer limit, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/span/collections/{collectionId}/blobs"
            .replaceAll("\\{" + "collectionId" + "\\}", localVarApiClient.escapeString(collectionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "APIToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listBlobsValidateBeforeCall(String collectionId, Integer limit, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new ApiException("Missing the required parameter 'collectionId' when calling listBlobs(Async)");
        }
        

        okhttp3.Call localVarCall = listBlobsCall(collectionId, limit, _callback);
        return localVarCall;

    }

    /**
     * List the blobs for a collection
     * Retrieve a list of all the blobs stored on this collection. Blobs are uploaded by the devices through one of the blob endpoints.
     * @param collectionId  (required)
     * @param limit  (optional)
     * @return ListBlobResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ListBlobResponse listBlobs(String collectionId, Integer limit) throws ApiException {
        ApiResponse<ListBlobResponse> localVarResp = listBlobsWithHttpInfo(collectionId, limit);
        return localVarResp.getData();
    }

    /**
     * List the blobs for a collection
     * Retrieve a list of all the blobs stored on this collection. Blobs are uploaded by the devices through one of the blob endpoints.
     * @param collectionId  (required)
     * @param limit  (optional)
     * @return ApiResponse&lt;ListBlobResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListBlobResponse> listBlobsWithHttpInfo(String collectionId, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = listBlobsValidateBeforeCall(collectionId, limit, null);
        Type localVarReturnType = new TypeToken<ListBlobResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List the blobs for a collection (asynchronously)
     * Retrieve a list of all the blobs stored on this collection. Blobs are uploaded by the devices through one of the blob endpoints.
     * @param collectionId  (required)
     * @param limit  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> It&#39;s created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The request has an error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You can&#39;t touch this </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Couldn&#39;t find the resource. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> There&#39;s a resource conflict here. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> I&#39;m sorry. We are broken </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listBlobsAsync(String collectionId, Integer limit, final ApiCallback<ListBlobResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listBlobsValidateBeforeCall(collectionId, limit, _callback);
        Type localVarReturnType = new TypeToken<ListBlobResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
