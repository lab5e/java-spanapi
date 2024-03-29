# span-java-client

The Span API
- API version: 4.4.2 nonviolent-adelbert
  - Build date: 2023-03-02T10:55:33.745521Z[Etc/UTC]

API for device, collection, output and firmware management

  For more information, please visit [https://lab5e.com](https://lab5e.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.lab5e</groupId>
  <artifactId>span-java-client</artifactId>
  <version>4.4.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'span-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'span-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.lab5e:span-java-client:4.4.2"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/span-java-client-4.4.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.Configuration;
import com.lab5e.auth.*;
import com.lab5e.models.*;
import com.lab5e.span.BlobsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    BlobsApi apiInstance = new BlobsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    String blobId = "blobId_example"; // String | 
    try {
      Object result = apiInstance.deleteBlob(collectionId, blobId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlobsApi#deleteBlob");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.lab5e.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BlobsApi* | [**deleteBlob**](docs/BlobsApi.md#deleteBlob) | **DELETE** /span/collections/{collectionId}/blobs/{blobId} | Remove a blob stored on a collection
*BlobsApi* | [**listBlobs**](docs/BlobsApi.md#listBlobs) | **GET** /span/collections/{collectionId}/blobs | List the blobs for a collection
*CertificatesApi* | [**createCertificate**](docs/CertificatesApi.md#createCertificate) | **POST** /span/collections/{collectionId}/certificates/create | Create certificate
*CertificatesApi* | [**retrieveCertificateChain**](docs/CertificatesApi.md#retrieveCertificateChain) | **GET** /span/collections/{collectionId}/certificates | Get certificate chain
*CertificatesApi* | [**signCertificate**](docs/CertificatesApi.md#signCertificate) | **POST** /span/collections/{collectionId}/certificates/sign | Sign certificate
*CertificatesApi* | [**verifyCertificate**](docs/CertificatesApi.md#verifyCertificate) | **POST** /span/collections/{collectionId}/certificates/verify | Verify certificate
*CollectionsApi* | [**createCollection**](docs/CollectionsApi.md#createCollection) | **POST** /span/collections | Create collection
*CollectionsApi* | [**deleteCollection**](docs/CollectionsApi.md#deleteCollection) | **DELETE** /span/collections/{collectionId} | Delete collection
*CollectionsApi* | [**listCollectionData**](docs/CollectionsApi.md#listCollectionData) | **GET** /span/collections/{collectionId}/data | Retrieve data from devices
*CollectionsApi* | [**listCollections**](docs/CollectionsApi.md#listCollections) | **GET** /span/collections | List collections
*CollectionsApi* | [**retrieveCollection**](docs/CollectionsApi.md#retrieveCollection) | **GET** /span/collections/{collectionId} | Retrieve collection
*CollectionsApi* | [**updateCollection**](docs/CollectionsApi.md#updateCollection) | **PATCH** /span/collections/{collectionId} | Update collection
*DevicesApi* | [**addDownstreamMessage**](docs/DevicesApi.md#addDownstreamMessage) | **POST** /span/collections/{collectionId}/devices/{deviceId}/outbox | Add message to oubox
*DevicesApi* | [**createDevice**](docs/DevicesApi.md#createDevice) | **POST** /span/collections/{collectionId}/devices | Create device
*DevicesApi* | [**deleteDevice**](docs/DevicesApi.md#deleteDevice) | **DELETE** /span/collections/{collectionId}/devices/{deviceId} | Remove device.
*DevicesApi* | [**deleteDownstreamMessage**](docs/DevicesApi.md#deleteDownstreamMessage) | **DELETE** /span/collections/{collectionId}/devices/{deviceId}/outbox/{messageId} | Delete outgoing message
*DevicesApi* | [**deviceCertificate**](docs/DevicesApi.md#deviceCertificate) | **GET** /span/collections/{collectionId}/devices/{deviceId}/certs | Get issued certificate(s) for device
*DevicesApi* | [**listDeviceData**](docs/DevicesApi.md#listDeviceData) | **GET** /span/collections/{collectionId}/devices/{deviceId}/data | Retrieve data from device
*DevicesApi* | [**listDevices**](docs/DevicesApi.md#listDevices) | **GET** /span/collections/{collectionId}/devices | List devices in collection.
*DevicesApi* | [**listDownstreamMessages**](docs/DevicesApi.md#listDownstreamMessages) | **GET** /span/collections/{collectionId}/devices/{deviceId}/outbox | List the messages in the outbox
*DevicesApi* | [**listUpstreamMessages**](docs/DevicesApi.md#listUpstreamMessages) | **GET** /span/collections/{collectionId}/devices/{deviceId}/inbox | List incoming messages
*DevicesApi* | [**retrieveDevice**](docs/DevicesApi.md#retrieveDevice) | **GET** /span/collections/{collectionId}/devices/{deviceId} | Retrieve device
*DevicesApi* | [**updateDevice**](docs/DevicesApi.md#updateDevice) | **PATCH** /span/collections/{existingCollectionId}/devices/{deviceId} | Update device
*FotaApi* | [**clearFirmwareError**](docs/FotaApi.md#clearFirmwareError) | **DELETE** /span/collections/{collectionId}/devices/{deviceId}/fwerror | Clear FOTA error
*FotaApi* | [**createFirmware**](docs/FotaApi.md#createFirmware) | **POST** /span/collections/{collectionId}/firmware | Create firmware
*FotaApi* | [**deleteFirmware**](docs/FotaApi.md#deleteFirmware) | **DELETE** /span/collections/{collectionId}/firmware/{imageId} | Delete firmware
*FotaApi* | [**firmwareUsage**](docs/FotaApi.md#firmwareUsage) | **GET** /span/collections/{collectionId}/firmware/{imageId}/usage | Firmware usage
*FotaApi* | [**listFirmware**](docs/FotaApi.md#listFirmware) | **GET** /span/collections/{collectionId}/firmware | List firmware
*FotaApi* | [**retrieveFirmware**](docs/FotaApi.md#retrieveFirmware) | **GET** /span/collections/{collectionId}/firmware/{imageId} | Retrieve firmware
*FotaApi* | [**updateFirmware**](docs/FotaApi.md#updateFirmware) | **PATCH** /span/collections/{existingCollectionId}/firmware/{imageId} | Update firmware
*GatewaysApi* | [**createGateway**](docs/GatewaysApi.md#createGateway) | **POST** /span/collections/{collectionId}/gateways | Create gateway
*GatewaysApi* | [**deleteGateway**](docs/GatewaysApi.md#deleteGateway) | **DELETE** /span/collections/{collectionId}/gateways/{gatewayId} | Delete gateway
*GatewaysApi* | [**gatewayCertificates**](docs/GatewaysApi.md#gatewayCertificates) | **GET** /span/collections/{collectionId}/gateways/{gatewayId}/certs | Get issued certificate(s) for gateway
*GatewaysApi* | [**listGateways**](docs/GatewaysApi.md#listGateways) | **GET** /span/collections/{collectionId}/gateways | List gateways
*GatewaysApi* | [**retrieveGateway**](docs/GatewaysApi.md#retrieveGateway) | **GET** /span/collections/{collectionId}/gateways/{gatewayId} | Retrieve gateway
*GatewaysApi* | [**updateGateway**](docs/GatewaysApi.md#updateGateway) | **PATCH** /span/collections/{existingCollectionId}/gateways/{gatewayId} | Update gateway
*OutputsApi* | [**createOutput**](docs/OutputsApi.md#createOutput) | **POST** /span/collections/{collectionId}/outputs | Create output
*OutputsApi* | [**deleteOutput**](docs/OutputsApi.md#deleteOutput) | **DELETE** /span/collections/{collectionId}/outputs/{outputId} | Delete output
*OutputsApi* | [**listOutputs**](docs/OutputsApi.md#listOutputs) | **GET** /span/collections/{collectionId}/outputs | List outputs
*OutputsApi* | [**logs**](docs/OutputsApi.md#logs) | **GET** /span/collections/{collectionId}/outputs/{outputId}/logs | Output logs
*OutputsApi* | [**retrieveOutput**](docs/OutputsApi.md#retrieveOutput) | **GET** /span/collections/{collectionId}/outputs/{outputId} | Retrieve output
*OutputsApi* | [**status**](docs/OutputsApi.md#status) | **GET** /span/collections/{collectionId}/outputs/{outputId}/status | Output status
*OutputsApi* | [**updateOutput**](docs/OutputsApi.md#updateOutput) | **PATCH** /span/collections/{existingCollectionId}/outputs/{outputId} | Update output
*SpanApi* | [**getSystemInfo**](docs/SpanApi.md#getSystemInfo) | **GET** /span/system | System information


## Documentation for Models

 - [AddDownstreamMessageRequest](docs/AddDownstreamMessageRequest.md)
 - [Any](docs/Any.md)
 - [Blob](docs/Blob.md)
 - [CellularIoTConfig](docs/CellularIoTConfig.md)
 - [CellularIoTMetadata](docs/CellularIoTMetadata.md)
 - [CertificateChainResponse](docs/CertificateChainResponse.md)
 - [CertificateInfo](docs/CertificateInfo.md)
 - [ClearFirmwareErrorResponse](docs/ClearFirmwareErrorResponse.md)
 - [CoAPMetadata](docs/CoAPMetadata.md)
 - [Collection](docs/Collection.md)
 - [CollectionFirmware](docs/CollectionFirmware.md)
 - [CreateCertificateRequest](docs/CreateCertificateRequest.md)
 - [CreateCertificateResponse](docs/CreateCertificateResponse.md)
 - [CreateCollectionRequest](docs/CreateCollectionRequest.md)
 - [CreateDeviceRequest](docs/CreateDeviceRequest.md)
 - [CreateFirmwareRequest](docs/CreateFirmwareRequest.md)
 - [CreateOutputRequest](docs/CreateOutputRequest.md)
 - [DeleteDownstreamMessageResponse](docs/DeleteDownstreamMessageResponse.md)
 - [Device](docs/Device.md)
 - [DeviceCertificateResponse](docs/DeviceCertificateResponse.md)
 - [DeviceConfig](docs/DeviceConfig.md)
 - [DeviceMetadata](docs/DeviceMetadata.md)
 - [Firmware](docs/Firmware.md)
 - [FirmwareManagement](docs/FirmwareManagement.md)
 - [FirmwareMetadata](docs/FirmwareMetadata.md)
 - [FirmwareUsageResponse](docs/FirmwareUsageResponse.md)
 - [Gateway](docs/Gateway.md)
 - [GatewayCIoTConfig](docs/GatewayCIoTConfig.md)
 - [GatewayCertificateResponse](docs/GatewayCertificateResponse.md)
 - [GatewayConfig](docs/GatewayConfig.md)
 - [GatewayCustomConfig](docs/GatewayCustomConfig.md)
 - [GatewayDeviceConfig](docs/GatewayDeviceConfig.md)
 - [GatewayDeviceMetadata](docs/GatewayDeviceMetadata.md)
 - [GatewayInetConfig](docs/GatewayInetConfig.md)
 - [GatewayMetadata](docs/GatewayMetadata.md)
 - [GatewayStatus](docs/GatewayStatus.md)
 - [GatewayType](docs/GatewayType.md)
 - [InetMetadata](docs/InetMetadata.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [ListBlobResponse](docs/ListBlobResponse.md)
 - [ListCollectionResponse](docs/ListCollectionResponse.md)
 - [ListDataResponse](docs/ListDataResponse.md)
 - [ListDevicesResponse](docs/ListDevicesResponse.md)
 - [ListDownstreamMessagesResponse](docs/ListDownstreamMessagesResponse.md)
 - [ListFirmwareResponse](docs/ListFirmwareResponse.md)
 - [ListGatewayResponse](docs/ListGatewayResponse.md)
 - [ListOutputResponse](docs/ListOutputResponse.md)
 - [ListUpstreamMessagesResponse](docs/ListUpstreamMessagesResponse.md)
 - [MQTTMetadata](docs/MQTTMetadata.md)
 - [MessageDownstream](docs/MessageDownstream.md)
 - [MessageState](docs/MessageState.md)
 - [MessageTransport](docs/MessageTransport.md)
 - [MessageUpstream](docs/MessageUpstream.md)
 - [Output](docs/Output.md)
 - [OutputConfig](docs/OutputConfig.md)
 - [OutputDataMessage](docs/OutputDataMessage.md)
 - [OutputLogEntry](docs/OutputLogEntry.md)
 - [OutputLogResponse](docs/OutputLogResponse.md)
 - [OutputMessageType](docs/OutputMessageType.md)
 - [OutputStatusResponse](docs/OutputStatusResponse.md)
 - [OutputType](docs/OutputType.md)
 - [RetrieveBlobResponse](docs/RetrieveBlobResponse.md)
 - [SignCertificateRequest](docs/SignCertificateRequest.md)
 - [SignCertificateResponse](docs/SignCertificateResponse.md)
 - [Status](docs/Status.md)
 - [SystemInfoResponse](docs/SystemInfoResponse.md)
 - [UDPMetadata](docs/UDPMetadata.md)
 - [UpdateCollectionRequest](docs/UpdateCollectionRequest.md)
 - [UpdateDeviceRequest](docs/UpdateDeviceRequest.md)
 - [UpdateFirmwareRequest](docs/UpdateFirmwareRequest.md)
 - [UpdateOutputRequest](docs/UpdateOutputRequest.md)
 - [VerifyCertificateRequest](docs/VerifyCertificateRequest.md)
 - [VerifyCertificateResponse](docs/VerifyCertificateResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APIToken

- **Type**: API key
- **API key parameter name**: X-API-Token
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

dev@lab5e.com

