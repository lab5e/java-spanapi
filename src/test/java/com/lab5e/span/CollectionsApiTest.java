/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.4.0 lean-joline
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span;

import com.lab5e.ApiException;
import com.lab5e.span.model.Collection;
import com.lab5e.span.model.CreateCollectionRequest;
import com.lab5e.span.model.ListCollectionResponse;
import com.lab5e.span.model.ListDataResponse;
import com.lab5e.span.model.Status;
import com.lab5e.span.model.UpdateCollectionRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectionsApi
 */
@Ignore
public class CollectionsApiTest {

    private final CollectionsApi api = new CollectionsApi();

    
    /**
     * Create collection
     *
     * Create a new collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCollectionTest() throws ApiException {
        CreateCollectionRequest body = null;
                Collection response = api.createCollection(body);
        // TODO: test validations
    }
    
    /**
     * Delete collection
     *
     * Remove the collection. Devices, firmware images, outputs and all other related resources must be removed from the collection before it can be deleted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionTest() throws ApiException {
        String collectionId = null;
                Collection response = api.deleteCollection(collectionId);
        // TODO: test validations
    }
    
    /**
     * Retrieve data from devices
     *
     * Retrieve data sent by the devices in the collection. The maximum number of data points is 100.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCollectionDataTest() throws ApiException {
        String collectionId = null;
        Integer limit = null;
        String start = null;
        String end = null;
        String offset = null;
                ListDataResponse response = api.listCollectionData(collectionId, limit, start, end, offset);
        // TODO: test validations
    }
    
    /**
     * List collections
     *
     * Lists all the collections that one of your teams owns.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCollectionsTest() throws ApiException {
                ListCollectionResponse response = api.listCollections();
        // TODO: test validations
    }
    
    /**
     * Retrieve collection
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveCollectionTest() throws ApiException {
        String collectionId = null;
                Collection response = api.retrieveCollection(collectionId);
        // TODO: test validations
    }
    
    /**
     * Update collection
     *
     * Update a collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCollectionTest() throws ApiException {
        String collectionId = null;
        UpdateCollectionRequest body = null;
                Collection response = api.updateCollection(collectionId, body);
        // TODO: test validations
    }
    
}
