/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.13 interdependent-karson
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


import com.lab5e.span.model.RpcStatus;
import com.lab5e.span.model.SystemInfoResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemApi {
    private ApiClient localVarApiClient;

    public SystemApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getSystemInfo
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
    public okhttp3.Call getSystemInfoCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/system";

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "APIToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSystemInfoValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSystemInfoCall(_callback);
        return localVarCall;

    }

    /**
     * System information
     * 
     * @return SystemInfoResponse
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
    public SystemInfoResponse getSystemInfo() throws ApiException {
        ApiResponse<SystemInfoResponse> localVarResp = getSystemInfoWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * System information
     * 
     * @return ApiResponse&lt;SystemInfoResponse&gt;
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
    public ApiResponse<SystemInfoResponse> getSystemInfoWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSystemInfoValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<SystemInfoResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * System information (asynchronously)
     * 
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
    public okhttp3.Call getSystemInfoAsync(final ApiCallback<SystemInfoResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSystemInfoValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<SystemInfoResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
