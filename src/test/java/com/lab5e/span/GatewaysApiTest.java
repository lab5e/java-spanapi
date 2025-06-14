/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.5 contented-jamila
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span;

import com.lab5e.ApiException;
import com.lab5e.span.model.CreateGatewayBody;
import com.lab5e.span.model.Gateway;
import com.lab5e.span.model.GatewayCertificateResponse;
import com.lab5e.span.model.GatewayStats;
import com.lab5e.span.model.ListGatewayResponse;
import com.lab5e.span.model.RpcStatus;
import com.lab5e.span.model.UpdateGatewayBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GatewaysApi
 */
@Disabled
public class GatewaysApiTest {

    private final GatewaysApi api = new GatewaysApi();

    /**
     * Create gateway
     *
     * Create a new gateway.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGatewayTest() throws ApiException {
        String collectionId = null;
        CreateGatewayBody body = null;
        Gateway response = api.createGateway(collectionId, body);
        // TODO: test validations
    }

    /**
     * Delete gateway
     *
     * Remove a gateway from Span.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteGatewayTest() throws ApiException {
        String collectionId = null;
        String gatewayId = null;
        Gateway response = api.deleteGateway(collectionId, gatewayId);
        // TODO: test validations
    }

    /**
     * Get issued certificate(s) for gateway
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gatewayCertificatesTest() throws ApiException {
        String collectionId = null;
        String gatewayId = null;
        GatewayCertificateResponse response = api.gatewayCertificates(collectionId, gatewayId);
        // TODO: test validations
    }

    /**
     * List gateways
     *
     * List the user&#39;s gatways, including built-in gateways.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listGatewaysTest() throws ApiException {
        String collectionId = null;
        ListGatewayResponse response = api.listGateways(collectionId);
        // TODO: test validations
    }

    /**
     * Retrieve gateway
     *
     * Get gateway information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveGatewayTest() throws ApiException {
        String collectionId = null;
        String gatewayId = null;
        Gateway response = api.retrieveGateway(collectionId, gatewayId);
        // TODO: test validations
    }

    /**
     * Retrieve gateway statistics
     *
     * Get statistics for gateway
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveGatewayStatsTest() throws ApiException {
        String collectionId = null;
        String gatewayId = null;
        GatewayStats response = api.retrieveGatewayStats(collectionId, gatewayId);
        // TODO: test validations
    }

    /**
     * Update gateway
     *
     * Update configuration for a gateway. If you want to remove or move a gateway from the collection the devices in the collection must not have any gateway configuration. The certificates for the gateway are unchanged when the gateway is moved.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGatewayTest() throws ApiException {
        String existingCollectionId = null;
        String gatewayId = null;
        UpdateGatewayBody body = null;
        Gateway response = api.updateGateway(existingCollectionId, gatewayId, body);
        // TODO: test validations
    }

}
