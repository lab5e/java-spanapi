# span-java-client

The Span API
- API version: 4.1.12 infinite-dana
  - Build date: 2021-04-27T18:27:23.987Z[GMT]

API for device, collection, output and firmware management

  For more information, please visit [https://lab5e.com/span](https://lab5e.com/span)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

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
  <version>4.1.12</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.lab5e:span-java-client:4.1.12"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/span-java-client-4.1.12.jar`
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
import com.lab5e.span.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lab5e.com/span");
    
    // Configure API key authorization: APIToken
    ApiKeyAuth APIToken = (ApiKeyAuth) defaultClient.getAuthentication("APIToken");
    APIToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIToken.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    BroadcastMessageRequest body = new BroadcastMessageRequest(); // BroadcastMessageRequest | 
    try {
      MultiSendMessageResponse result = apiInstance.broadcastMessage(collectionId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#broadcastMessage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.lab5e.com/span*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CollectionsApi* | [**broadcastMessage**](docs/CollectionsApi.md#broadcastMessage) | **POST** /collections/{collectionId}/to | Broadcast message
*CollectionsApi* | [**createCollection**](docs/CollectionsApi.md#createCollection) | **POST** /collections | Create collection
*CollectionsApi* | [**deleteCollection**](docs/CollectionsApi.md#deleteCollection) | **DELETE** /collections/{collectionId} | Delete collection
*CollectionsApi* | [**listCollectionData**](docs/CollectionsApi.md#listCollectionData) | **GET** /collections/{collectionId}/data | Get payloads
*CollectionsApi* | [**listCollections**](docs/CollectionsApi.md#listCollections) | **GET** /collections | List collections
*CollectionsApi* | [**retrieveCollection**](docs/CollectionsApi.md#retrieveCollection) | **GET** /collections/{collectionId} | Retrieve collection
*CollectionsApi* | [**updateCollection**](docs/CollectionsApi.md#updateCollection) | **PATCH** /collections/{collectionId} | Update collection
*DatadumpApi* | [**dataDump**](docs/DatadumpApi.md#dataDump) | **POST** /datadump | Data dump
*DevicesApi* | [**createDevice**](docs/DevicesApi.md#createDevice) | **POST** /collections/{collectionId}/devices | Create device
*DevicesApi* | [**deleteDevice**](docs/DevicesApi.md#deleteDevice) | **DELETE** /collections/{collectionId}/devices/{deviceId} | Remove device
*DevicesApi* | [**listDeviceData**](docs/DevicesApi.md#listDeviceData) | **GET** /collections/{collectionId}/devices/{deviceId}/data | Get payloads
*DevicesApi* | [**listDevices**](docs/DevicesApi.md#listDevices) | **GET** /collections/{collectionId}/devices | List devices
*DevicesApi* | [**retrieveDevice**](docs/DevicesApi.md#retrieveDevice) | **GET** /collections/{collectionId}/devices/{deviceId} | Retrieve device
*DevicesApi* | [**sendMessage**](docs/DevicesApi.md#sendMessage) | **POST** /collections/{collectionId}/devices/{deviceId}/to | Send message
*DevicesApi* | [**updateDevice**](docs/DevicesApi.md#updateDevice) | **PATCH** /collections/{existingCollectionId}/devices/{deviceId} | Update device
*FotaApi* | [**clearFirmwareError**](docs/FotaApi.md#clearFirmwareError) | **DELETE** /collections/{collectionId}/devices/{deviceId}/fwerror | Clear FOTA error
*FotaApi* | [**createFirmware**](docs/FotaApi.md#createFirmware) | **POST** /collections/{collectionId}/firmware | Create firmware
*FotaApi* | [**deleteFirmware**](docs/FotaApi.md#deleteFirmware) | **DELETE** /collections/{collectionId}/firmware/{imageId} | Delete firmware
*FotaApi* | [**firmwareUsage**](docs/FotaApi.md#firmwareUsage) | **PATCH** /collections/{collectionId}/firmware/{imageId}/usage | Firmware usage
*FotaApi* | [**listFirmware**](docs/FotaApi.md#listFirmware) | **GET** /collections/{collectionId}/firmware | List firmware
*FotaApi* | [**retrieveFirmware**](docs/FotaApi.md#retrieveFirmware) | **GET** /collections/{collectionId}/firmware/{imageId} | Retrieve firmware
*FotaApi* | [**updateFirmware**](docs/FotaApi.md#updateFirmware) | **PATCH** /collections/{collectionId}/firmware/{imageId} | Update firmware
*OutputsApi* | [**createOutput**](docs/OutputsApi.md#createOutput) | **POST** /collections/{collectionId}/outputs | Create output
*OutputsApi* | [**deleteOutput**](docs/OutputsApi.md#deleteOutput) | **DELETE** /collections/{collectionId}/outputs/{outputId} | Delete output
*OutputsApi* | [**listOutputs**](docs/OutputsApi.md#listOutputs) | **GET** /collections/{collectionId}/outputs | List outputs
*OutputsApi* | [**logs**](docs/OutputsApi.md#logs) | **GET** /collections/{collectionId}/outputs/{outputId}/logs | Output logs
*OutputsApi* | [**retrieveOutput**](docs/OutputsApi.md#retrieveOutput) | **GET** /collections/{collectionId}/outputs/{outputId} | Retrieve output
*OutputsApi* | [**status**](docs/OutputsApi.md#status) | **GET** /collections/{collectionId}/outputs/{outputId}/status | Output status
*OutputsApi* | [**updateOutput**](docs/OutputsApi.md#updateOutput) | **PATCH** /collections/{collectionId}/outputs/{outputId} | Update output
*SystemApi* | [**getSystemInfo**](docs/SystemApi.md#getSystemInfo) | **GET** /system | System information


## Documentation for Models

 - [BroadcastMessageRequest](docs/BroadcastMessageRequest.md)
 - [ClearFirmwareErrorResponse](docs/ClearFirmwareErrorResponse.md)
 - [CoAPMetadata](docs/CoAPMetadata.md)
 - [Collection](docs/Collection.md)
 - [CollectionFirmware](docs/CollectionFirmware.md)
 - [CollectionFirmwareFirmwareManagement](docs/CollectionFirmwareFirmwareManagement.md)
 - [CreateFirmwareRequest](docs/CreateFirmwareRequest.md)
 - [DataDumpRequest](docs/DataDumpRequest.md)
 - [DataDumpResponse](docs/DataDumpResponse.md)
 - [Device](docs/Device.md)
 - [DumpedCollection](docs/DumpedCollection.md)
 - [DumpedDevice](docs/DumpedDevice.md)
 - [FieldMask](docs/FieldMask.md)
 - [Firmware](docs/Firmware.md)
 - [FirmwareMetadata](docs/FirmwareMetadata.md)
 - [FirmwareUsageResponse](docs/FirmwareUsageResponse.md)
 - [ListCollectionResponse](docs/ListCollectionResponse.md)
 - [ListDataResponse](docs/ListDataResponse.md)
 - [ListDevicesResponse](docs/ListDevicesResponse.md)
 - [ListFirmwareResponse](docs/ListFirmwareResponse.md)
 - [ListOutputResponse](docs/ListOutputResponse.md)
 - [MessageSendResult](docs/MessageSendResult.md)
 - [MultiSendMessageResponse](docs/MultiSendMessageResponse.md)
 - [NetworkMetadata](docs/NetworkMetadata.md)
 - [Output](docs/Output.md)
 - [OutputConfig](docs/OutputConfig.md)
 - [OutputDataMessage](docs/OutputDataMessage.md)
 - [OutputDataMessageOutputMessageType](docs/OutputDataMessageOutputMessageType.md)
 - [OutputLogEntry](docs/OutputLogEntry.md)
 - [OutputLogResponse](docs/OutputLogResponse.md)
 - [OutputStatusResponse](docs/OutputStatusResponse.md)
 - [OutputType](docs/OutputType.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [RpcStatus](docs/RpcStatus.md)
 - [SendMessageRequest](docs/SendMessageRequest.md)
 - [SendMessageResponse](docs/SendMessageResponse.md)
 - [SystemInfoResponse](docs/SystemInfoResponse.md)
 - [UDPMetadata](docs/UDPMetadata.md)
 - [UpdateDeviceRequest](docs/UpdateDeviceRequest.md)


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

