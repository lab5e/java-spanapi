/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.11 evasive-governor
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span;

import com.lab5e.ApiException;
import com.lab5e.span.model.ListOutputResponse;
import com.lab5e.span.model.Output;
import com.lab5e.span.model.OutputLogResponse;
import com.lab5e.span.model.OutputStatusResponse;
import com.lab5e.span.model.RpcStatus;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OutputsApi
 */
@Ignore
public class OutputsApiTest {

    private final OutputsApi api = new OutputsApi();

    
    /**
     * Create output
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOutputTest() throws ApiException {
        String collectionId = null;
        Output body = null;
        Output response = api.createOutput(collectionId, body);

        // TODO: test validations
    }
    
    /**
     * Delete output
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOutputTest() throws ApiException {
        String collectionId = null;
        String outputId = null;
        Output response = api.deleteOutput(collectionId, outputId);

        // TODO: test validations
    }
    
    /**
     * List outputs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOutputsTest() throws ApiException {
        String collectionId = null;
        ListOutputResponse response = api.listOutputs(collectionId);

        // TODO: test validations
    }
    
    /**
     * Output logs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logsTest() throws ApiException {
        String collectionId = null;
        String outputId = null;
        OutputLogResponse response = api.logs(collectionId, outputId);

        // TODO: test validations
    }
    
    /**
     * Retrieve output
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOutputTest() throws ApiException {
        String collectionId = null;
        String outputId = null;
        Output response = api.retrieveOutput(collectionId, outputId);

        // TODO: test validations
    }
    
    /**
     * Output status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusTest() throws ApiException {
        String collectionId = null;
        String outputId = null;
        OutputStatusResponse response = api.status(collectionId, outputId);

        // TODO: test validations
    }
    
    /**
     * Update output
     *
     * Running outputs will be restarted if required. Note that the collection ID can&#39;t be changed on an existing output.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOutputTest() throws ApiException {
        String collectionId = null;
        String outputId = null;
        Output body = null;
        Output response = api.updateOutput(collectionId, outputId, body);

        // TODO: test validations
    }
    
}
