/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.5.0 overwrought-dorla
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span;

import com.lab5e.ApiException;
import com.lab5e.span.model.ListBlobResponse;
import com.lab5e.span.model.Status;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlobsApi
 */
@Disabled
public class BlobsApiTest {

    private final BlobsApi api = new BlobsApi();

    /**
     * Remove a blob stored on a collection
     *
     * Remove a blob stored on the collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteBlobTest() throws ApiException {
        String collectionId = null;
        String blobId = null;
        Object response = api.deleteBlob(collectionId, blobId);
        // TODO: test validations
    }

    /**
     * List the blobs for a collection
     *
     * Retrieve a list of all the blobs stored on this collection. Blobs are uploaded by the devices through one of the blob endpoints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBlobsTest() throws ApiException {
        String collectionId = null;
        Integer limit = null;
        ListBlobResponse response = api.listBlobs(collectionId, limit);
        // TODO: test validations
    }

}
