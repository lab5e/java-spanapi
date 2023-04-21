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
import com.lab5e.span.model.ClearFirmwareErrorResponse;
import com.lab5e.span.model.CreateFirmwareRequest;
import com.lab5e.span.model.Firmware;
import com.lab5e.span.model.FirmwareUsageResponse;
import com.lab5e.span.model.ListFirmwareResponse;
import com.lab5e.span.model.Status;
import com.lab5e.span.model.UpdateFirmwareRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FotaApi
 */
@Disabled
public class FotaApiTest {

    private final FotaApi api = new FotaApi();

    /**
     * Clear FOTA error
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void clearFirmwareErrorTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        ClearFirmwareErrorResponse response = api.clearFirmwareError(collectionId, deviceId);
        // TODO: test validations
    }

    /**
     * Create firmware
     *
     * Firmware images must have unique version numbers and have an unique checksum. The checksum is calculated when the firmware image is uploaded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFirmwareTest() throws ApiException {
        String collectionId = null;
        CreateFirmwareRequest body = null;
        Firmware response = api.createFirmware(collectionId, body);
        // TODO: test validations
    }

    /**
     * Delete firmware
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteFirmwareTest() throws ApiException {
        String collectionId = null;
        String imageId = null;
        Firmware response = api.deleteFirmware(collectionId, imageId);
        // TODO: test validations
    }

    /**
     * Firmware usage
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void firmwareUsageTest() throws ApiException {
        String collectionId = null;
        String imageId = null;
        FirmwareUsageResponse response = api.firmwareUsage(collectionId, imageId);
        // TODO: test validations
    }

    /**
     * List firmware
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listFirmwareTest() throws ApiException {
        String collectionId = null;
        ListFirmwareResponse response = api.listFirmware(collectionId);
        // TODO: test validations
    }

    /**
     * Retrieve firmware
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveFirmwareTest() throws ApiException {
        String collectionId = null;
        String imageId = null;
        Firmware response = api.retrieveFirmware(collectionId, imageId);
        // TODO: test validations
    }

    /**
     * Update firmware
     *
     * Only the version and tags fields can be updated. The other fields will be ignored.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateFirmwareTest() throws ApiException {
        String existingCollectionId = null;
        String imageId = null;
        UpdateFirmwareRequest body = null;
        Firmware response = api.updateFirmware(existingCollectionId, imageId, body);
        // TODO: test validations
    }

}
