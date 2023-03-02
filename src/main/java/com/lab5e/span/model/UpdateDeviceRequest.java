/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.4.2 nonviolent-adelbert
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
import com.lab5e.span.model.DeviceConfig;
import com.lab5e.span.model.FirmwareMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Updating the device
 */
@ApiModel(description = "Updating the device")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T10:55:33.745521Z[Etc/UTC]")
public class UpdateDeviceRequest {
  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private FirmwareMetadata firmware;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private DeviceConfig config;

  public UpdateDeviceRequest() { 
  }

  public UpdateDeviceRequest collectionId(String collectionId) {
    
    this.collectionId = collectionId;
    return this;
  }

   /**
   * The collection id for the device. This field is optional and can be omitted if the collection id isn&#39;t changed. When changing to a new collection you must be an owner of the other collection, ie an administrator of the team that owns the new collection.
   * @return collectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The collection id for the device. This field is optional and can be omitted if the collection id isn't changed. When changing to a new collection you must be an owner of the other collection, ie an administrator of the team that owns the new collection.")

  public String getCollectionId() {
    return collectionId;
  }


  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }


  public UpdateDeviceRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateDeviceRequest putTagsItem(String key, String tagsItem) {
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


  public UpdateDeviceRequest firmware(FirmwareMetadata firmware) {
    
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


  public UpdateDeviceRequest config(DeviceConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceConfig getConfig() {
    return config;
  }


  public void setConfig(DeviceConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeviceRequest updateDeviceRequest = (UpdateDeviceRequest) o;
    return Objects.equals(this.collectionId, updateDeviceRequest.collectionId) &&
        Objects.equals(this.tags, updateDeviceRequest.tags) &&
        Objects.equals(this.firmware, updateDeviceRequest.firmware) &&
        Objects.equals(this.config, updateDeviceRequest.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, tags, firmware, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeviceRequest {\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

