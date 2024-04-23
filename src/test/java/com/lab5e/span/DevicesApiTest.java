/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.9.5 spattered-kelvin
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span;

import com.lab5e.ApiException;
import com.lab5e.span.model.AddDownstreamMessageRequest;
import com.lab5e.span.model.CreateDeviceRequest;
import com.lab5e.span.model.DeleteDownstreamMessageResponse;
import com.lab5e.span.model.Device;
import com.lab5e.span.model.DeviceCertificateResponse;
import com.lab5e.span.model.DeviceStats;
import com.lab5e.span.model.ListDataResponse;
import com.lab5e.span.model.ListDevicesResponse;
import com.lab5e.span.model.ListDownstreamMessagesResponse;
import com.lab5e.span.model.ListUpstreamMessagesResponse;
import com.lab5e.span.model.MessageDownstream;
import com.lab5e.span.model.Status;
import com.lab5e.span.model.UpdateDeviceRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesApi
 */
@Disabled
public class DevicesApiTest {

    private final DevicesApi api = new DevicesApi();

    /**
     * Add message to oubox
     *
     * Add a new message in the outgoing queue to the device. If there is other messages in the outbox these messages will be sent first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addDownstreamMessageTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        AddDownstreamMessageRequest body = null;
        MessageDownstream response = api.addDownstreamMessage(collectionId, deviceId, body);
        // TODO: test validations
    }

    /**
     * Create device
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDeviceTest() throws ApiException {
        String collectionId = null;
        CreateDeviceRequest body = null;
        Device response = api.createDevice(collectionId, body);
        // TODO: test validations
    }

    /**
     * Remove device.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDeviceTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        Device response = api.deleteDevice(collectionId, deviceId);
        // TODO: test validations
    }

    /**
     * Delete outgoing message
     *
     * Delete an outgoing (ie downstream) message from the outbox.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDownstreamMessageTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        String messageId = null;
        DeleteDownstreamMessageResponse response = api.deleteDownstreamMessage(collectionId, deviceId, messageId);
        // TODO: test validations
    }

    /**
     * Get issued certificate(s) for device
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deviceCertificateTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        DeviceCertificateResponse response = api.deviceCertificate(collectionId, deviceId);
        // TODO: test validations
    }

    /**
     * Retrieve data from device
     *
     * List the data received from the device. Use the query parameters to control what data you retrieve. The maximum number of data points is 100.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDeviceDataTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        Integer limit = null;
        String start = null;
        String end = null;
        String offset = null;
        ListDataResponse response = api.listDeviceData(collectionId, deviceId, limit, start, end, offset);
        // TODO: test validations
    }

    /**
     * List devices in collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDevicesTest() throws ApiException {
        String collectionId = null;
        ListDevicesResponse response = api.listDevices(collectionId);
        // TODO: test validations
    }

    /**
     * List the messages in the outbox
     *
     * List messages that should be sent to the device when it connects to the service. The messages are sent to the device when it connects to the service and either sends a message (via UDP or CoAP) or requests a message via CoAP GET request.option
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDownstreamMessagesTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        Integer limit = null;
        String start = null;
        String end = null;
        String offset = null;
        ListDownstreamMessagesResponse response = api.listDownstreamMessages(collectionId, deviceId, limit, start, end, offset);
        // TODO: test validations
    }

    /**
     * List incoming messages
     *
     * Retrieve a list of incoming (ie upstream) messages, ie messages sent from the device to the service. These messages are buffered in the service until they expire.  Use the query parameters to limit the number of messages to return. If no limit is specified the default limit of 250 is used.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listUpstreamMessagesTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        Integer limit = null;
        String start = null;
        String end = null;
        String offset = null;
        ListUpstreamMessagesResponse response = api.listUpstreamMessages(collectionId, deviceId, limit, start, end, offset);
        // TODO: test validations
    }

    /**
     * Retrieve device
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveDeviceTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        Device response = api.retrieveDevice(collectionId, deviceId);
        // TODO: test validations
    }

    /**
     * Retrieve device statistics
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveDeviceStatsTest() throws ApiException {
        String collectionId = null;
        String deviceId = null;
        DeviceStats response = api.retrieveDeviceStats(collectionId, deviceId);
        // TODO: test validations
    }

    /**
     * Update device
     *
     * The device can be moved from one collection to another by setting the collection ID field to the new collection. You must have administrative access to both collections. A note on gateway configurations: Empty gateway configuration blocks are deleted. If the configuration block contains a gateway ID it will be updated  with the new values. All values must be submitted in the request. If a device is moved out of the collection and it references a gateway in the configuration the operation will fail. Devices that are moved from one collection to another and references gateway configurations must be updated before they are moved.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDeviceTest() throws ApiException {
        String existingCollectionId = null;
        String deviceId = null;
        UpdateDeviceRequest body = null;
        Device response = api.updateDevice(existingCollectionId, deviceId, body);
        // TODO: test validations
    }

}
