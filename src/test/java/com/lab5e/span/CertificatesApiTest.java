/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.0 convulsive-launa
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span;

import com.lab5e.ApiException;
import com.lab5e.span.model.CertificateChainResponse;
import com.lab5e.span.model.CreateCertificateBody;
import com.lab5e.span.model.CreateCertificateResponse;
import com.lab5e.span.model.RpcStatus;
import com.lab5e.span.model.SignCertificateBody;
import com.lab5e.span.model.SignCertificateResponse;
import com.lab5e.span.model.VerifyCertificateBody;
import com.lab5e.span.model.VerifyCertificateResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CertificatesApi
 */
@Disabled
public class CertificatesApiTest {

    private final CertificatesApi api = new CertificatesApi();

    /**
     * Create certificate
     *
     * Create a new device or gateway (client) certificate for an internet-connected device. The devices will use this client certificate to authenticate when sending data via the Internet endpoint. This will create a X509 client certificate with an ECC public key. The key is not stored by the service so keep it in a secure place once it is downloaded. The returned certificate will be valid for 14 days. The key for the certificate is your own responsibility. The client certificate is used in both the TLS, DTLS and gRPC service endpoints.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCertificateTest() throws ApiException {
        String collectionId = null;
        CreateCertificateBody body = null;
        CreateCertificateResponse response = api.createCertificate(collectionId, body);
        // TODO: test validations
    }

    /**
     * Get certificate chain
     *
     * Get the certificate chain for the root CA and intermediate certificates used by the device, gateway and server certificates. It is highly recommended to verify the server certificate when sending data to avoid any man-in-the-middle attacks. This chain will contain all required certificates needed to verify the client certificate.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveCertificateChainTest() throws ApiException {
        String collectionId = null;
        String gatewayId = null;
        String deviceId = null;
        CertificateChainResponse response = api.retrieveCertificateChain(collectionId, gatewayId, deviceId);
        // TODO: test validations
    }

    /**
     * Sign certificate
     *
     * Sign a device or gateway (aka client) certificate. The certificate is a X509 Certificate signing request PEM encoded. The certificate will be valid for 14 days and must be renewed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signCertificateTest() throws ApiException {
        String collectionId = null;
        SignCertificateBody body = null;
        SignCertificateResponse response = api.signCertificate(collectionId, body);
        // TODO: test validations
    }

    /**
     * Verify certificate
     *
     * Verify client certificate. If a client certificate fails it can be tricky to pinpoint exactly *why* the certificate isn&#39;t accepted. This resource validates the client certificate and returns the error in plain text.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifyCertificateTest() throws ApiException {
        String collectionId = null;
        VerifyCertificateBody body = null;
        VerifyCertificateResponse response = api.verifyCertificate(collectionId, body);
        // TODO: test validations
    }

}
