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

import com.lab5e.ApiException;
import com.lab5e.span.model.DataDumpRequest;
import com.lab5e.span.model.DataDumpResponse;
import com.lab5e.span.model.RpcStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DatadumpApi
 */
@Ignore
public class DatadumpApiTest {

    private final DatadumpApi api = new DatadumpApi();

    
    /**
     * Data dump
     *
     * Do a complete data dump of your data, devices, outputs and collections.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataDumpTest() throws ApiException {
        DataDumpRequest body = null;
        DataDumpResponse response = api.dataDump(body);

        // TODO: test validations
    }
    
}
