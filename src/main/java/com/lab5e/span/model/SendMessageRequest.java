/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.12 infinite-dana
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SendMessageRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-27T18:27:23.987Z[GMT]")
public class SendMessageRequest {
  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private byte[] payload;

  public static final String SERIALIZED_NAME_TRANSPORT = "transport";
  @SerializedName(SERIALIZED_NAME_TRANSPORT)
  private String transport;

  public static final String SERIALIZED_NAME_COAP_PATH = "coapPath";
  @SerializedName(SERIALIZED_NAME_COAP_PATH)
  private String coapPath;


  public SendMessageRequest collectionId(String collectionId) {
    
    this.collectionId = collectionId;
    return this;
  }

   /**
   * Get collectionId
   * @return collectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCollectionId() {
    return collectionId;
  }


  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }


  public SendMessageRequest deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public SendMessageRequest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public SendMessageRequest payload(byte[] payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getPayload() {
    return payload;
  }


  public void setPayload(byte[] payload) {
    this.payload = payload;
  }


  public SendMessageRequest transport(String transport) {
    
    this.transport = transport;
    return this;
  }

   /**
   * Valid transports are \&quot;udp\&quot;, \&quot;coap\&quot;, \&quot;coap-pull\&quot;, \&quot;udp-pull\&quot;, \&quot;coap-push\&quot;, \&quot;udp-push\&quot;. \&quot;udp\&quot; is equivalent to \&quot;udp-push\&quot; and \&quot;coap\&quot; is equivalent to \&quot;coap-push\&quot;. Push messages are sent unsolicited to the device wheil pull messages are sent whenever the device wither sends data upstream (for UDP) or does a CoAP request to the CoAP service in span.
   * @return transport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Valid transports are \"udp\", \"coap\", \"coap-pull\", \"udp-pull\", \"coap-push\", \"udp-push\". \"udp\" is equivalent to \"udp-push\" and \"coap\" is equivalent to \"coap-push\". Push messages are sent unsolicited to the device wheil pull messages are sent whenever the device wither sends data upstream (for UDP) or does a CoAP request to the CoAP service in span.")

  public String getTransport() {
    return transport;
  }


  public void setTransport(String transport) {
    this.transport = transport;
  }


  public SendMessageRequest coapPath(String coapPath) {
    
    this.coapPath = coapPath;
    return this;
  }

   /**
   * Get coapPath
   * @return coapPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoapPath() {
    return coapPath;
  }


  public void setCoapPath(String coapPath) {
    this.coapPath = coapPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMessageRequest sendMessageRequest = (SendMessageRequest) o;
    return Objects.equals(this.collectionId, sendMessageRequest.collectionId) &&
        Objects.equals(this.deviceId, sendMessageRequest.deviceId) &&
        Objects.equals(this.port, sendMessageRequest.port) &&
        Arrays.equals(this.payload, sendMessageRequest.payload) &&
        Objects.equals(this.transport, sendMessageRequest.transport) &&
        Objects.equals(this.coapPath, sendMessageRequest.coapPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, deviceId, port, Arrays.hashCode(payload), transport, coapPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMessageRequest {\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    coapPath: ").append(toIndentedString(coapPath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

