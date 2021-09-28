/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.17 enhanced-allie
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
import com.lab5e.span.model.DeviceMetadata;
import com.lab5e.span.model.FirmwareMetadata;
import com.lab5e.span.model.NetworkMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Device
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-28T19:06:00.241Z[GMT]")
public class Device {
  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_IMSI = "imsi";
  @SerializedName(SERIALIZED_NAME_IMSI)
  private String imsi;

  public static final String SERIALIZED_NAME_IMEI = "imei";
  @SerializedName(SERIALIZED_NAME_IMEI)
  private String imei;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private NetworkMetadata network;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private FirmwareMetadata firmware;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private DeviceMetadata metadata;


  public Device deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * The device ID is assigned by the backend.
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The device ID is assigned by the backend.")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public Device collectionId(String collectionId) {
    
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


  public Device imsi(String imsi) {
    
    this.imsi = imsi;
    return this;
  }

   /**
   * The IMSI is the unique ID for the (e|nu|whatever)SIM card on your device. This is the primary identifier for your device on the network.
   * @return imsi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IMSI is the unique ID for the (e|nu|whatever)SIM card on your device. This is the primary identifier for your device on the network.")

  public String getImsi() {
    return imsi;
  }


  public void setImsi(String imsi) {
    this.imsi = imsi;
  }


  public Device imei(String imei) {
    
    this.imei = imei;
    return this;
  }

   /**
   * The IMEI number is the unique ID for your hardware as seen by the network. Obviously you might have a completely different view on things.
   * @return imei
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IMEI number is the unique ID for your hardware as seen by the network. Obviously you might have a completely different view on things.")

  public String getImei() {
    return imei;
  }


  public void setImei(String imei) {
    this.imei = imei;
  }


  public Device tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Device putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Tags are metadata for the device that you can set. These are just strings.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags are metadata for the device that you can set. These are just strings.")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public Device network(NetworkMetadata network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkMetadata getNetwork() {
    return network;
  }


  public void setNetwork(NetworkMetadata network) {
    this.network = network;
  }


  public Device firmware(FirmwareMetadata firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FirmwareMetadata getFirmware() {
    return firmware;
  }


  public void setFirmware(FirmwareMetadata firmware) {
    this.firmware = firmware;
  }


  public Device metadata(DeviceMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(DeviceMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.deviceId, device.deviceId) &&
        Objects.equals(this.collectionId, device.collectionId) &&
        Objects.equals(this.imsi, device.imsi) &&
        Objects.equals(this.imei, device.imei) &&
        Objects.equals(this.tags, device.tags) &&
        Objects.equals(this.network, device.network) &&
        Objects.equals(this.firmware, device.firmware) &&
        Objects.equals(this.metadata, device.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, collectionId, imsi, imei, tags, network, firmware, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

