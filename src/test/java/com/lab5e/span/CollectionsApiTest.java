/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.10 hulking-betty
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span;

import com.lab5e.ApiException;
import com.lab5e.span.model.BroadcastMessageRequest;
import com.lab5e.span.model.Collection;
import com.lab5e.span.model.ListCollectionResponse;
import com.lab5e.span.model.ListDataResponse;
import com.lab5e.span.model.MultiSendMessageResponse;
import com.lab5e.span.model.RpcStatus;
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
     * Broadcast message
     *
     * Broadcast a message to all devices in the collection. This request will always succeed if the collection exists, even if there are one or more send errors. Individual errors are returned as an array of error messages in the response. Use equivalent to resource for devices to send a message to single device.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void broadcastMessageTest() throws ApiException {
        String collectionId = null;
        BroadcastMessageRequest body = null;
        MultiSendMessageResponse response = api.broadcastMessage(collectionId, body);

        // TODO: test validations
    }
    
    /**
     * Create collection
     *
     * The returned collection is the collection stored in the backend. Defaults have been set. There are no required fields in a collection
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCollectionTest() throws ApiException {
        Collection body = null;
        Collection response = api.createCollection(body);

        // TODO: test validations
    }
    
    /**
     * Delete collection
     *
     * You must have write access to the collection
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
     * Get payloads
     *
     * List the data received from all the devices in the collection.
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
     * You must have write access to the collection, ie. you must administer it
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCollectionTest() throws ApiException {
        String collectionId = null;
        Collection body = null;
        Collection response = api.updateCollection(collectionId, body);

        // TODO: test validations
    }
    
}
