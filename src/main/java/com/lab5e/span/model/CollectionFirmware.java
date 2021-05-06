/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.14 oversensitive-deante
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
import com.lab5e.span.model.CollectionFirmwareFirmwareManagement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CollectionFirmware
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-06T19:19:08.467Z[GMT]")
public class CollectionFirmware {
  public static final String SERIALIZED_NAME_CURRENT_FIRMWARE_ID = "currentFirmwareId";
  @SerializedName(SERIALIZED_NAME_CURRENT_FIRMWARE_ID)
  private String currentFirmwareId;

  public static final String SERIALIZED_NAME_TARGET_FIRMWARE_ID = "targetFirmwareId";
  @SerializedName(SERIALIZED_NAME_TARGET_FIRMWARE_ID)
  private String targetFirmwareId;

  public static final String SERIALIZED_NAME_MANAGEMENT = "management";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT)
  private CollectionFirmwareFirmwareManagement management = CollectionFirmwareFirmwareManagement.UNSPECIFIED;


  public CollectionFirmware currentFirmwareId(String currentFirmwareId) {
    
    this.currentFirmwareId = currentFirmwareId;
    return this;
  }

   /**
   * The current firmware is the firmware that the devices are currently using.
   * @return currentFirmwareId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current firmware is the firmware that the devices are currently using.")

  public String getCurrentFirmwareId() {
    return currentFirmwareId;
  }


  public void setCurrentFirmwareId(String currentFirmwareId) {
    this.currentFirmwareId = currentFirmwareId;
  }


  public CollectionFirmware targetFirmwareId(String targetFirmwareId) {
    
    this.targetFirmwareId = targetFirmwareId;
    return this;
  }

   /**
   * The target firmware is set to the desired firmware image for the devices in this collection. If the management is set to \&quot;device\&quot; this will only be used if the target firmware isn&#39;t set on the device itself.
   * @return targetFirmwareId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target firmware is set to the desired firmware image for the devices in this collection. If the management is set to \"device\" this will only be used if the target firmware isn't set on the device itself.")

  public String getTargetFirmwareId() {
    return targetFirmwareId;
  }


  public void setTargetFirmwareId(String targetFirmwareId) {
    this.targetFirmwareId = targetFirmwareId;
  }


  public CollectionFirmware management(CollectionFirmwareFirmwareManagement management) {
    
    this.management = management;
    return this;
  }

   /**
   * Get management
   * @return management
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CollectionFirmwareFirmwareManagement getManagement() {
    return management;
  }


  public void setManagement(CollectionFirmwareFirmwareManagement management) {
    this.management = management;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionFirmware collectionFirmware = (CollectionFirmware) o;
    return Objects.equals(this.currentFirmwareId, collectionFirmware.currentFirmwareId) &&
        Objects.equals(this.targetFirmwareId, collectionFirmware.targetFirmwareId) &&
        Objects.equals(this.management, collectionFirmware.management);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentFirmwareId, targetFirmwareId, management);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionFirmware {\n");
    sb.append("    currentFirmwareId: ").append(toIndentedString(currentFirmwareId)).append("\n");
    sb.append("    targetFirmwareId: ").append(toIndentedString(targetFirmwareId)).append("\n");
    sb.append("    management: ").append(toIndentedString(management)).append("\n");
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

