/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.11 evasive-governor
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
 * Metadata about firmware on devices.
 */
@ApiModel(description = "Metadata about firmware on devices.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-25T13:12:27.979Z[GMT]")
public class FirmwareMetadata {
  public static final String SERIALIZED_NAME_CURRENT_FIRMWARE_ID = "currentFirmwareId";
  @SerializedName(SERIALIZED_NAME_CURRENT_FIRMWARE_ID)
  private String currentFirmwareId;

  public static final String SERIALIZED_NAME_TARGET_FIRMWARE_ID = "targetFirmwareId";
  @SerializedName(SERIALIZED_NAME_TARGET_FIRMWARE_ID)
  private String targetFirmwareId;

  public static final String SERIALIZED_NAME_FIRMWARE_VERSION = "firmwareVersion";
  @SerializedName(SERIALIZED_NAME_FIRMWARE_VERSION)
  private String firmwareVersion;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_MODEL_NUMBER = "modelNumber";
  @SerializedName(SERIALIZED_NAME_MODEL_NUMBER)
  private String modelNumber;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private String manufacturer;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATE_MESSAGE = "stateMessage";
  @SerializedName(SERIALIZED_NAME_STATE_MESSAGE)
  private String stateMessage;


  public FirmwareMetadata currentFirmwareId(String currentFirmwareId) {
    
    this.currentFirmwareId = currentFirmwareId;
    return this;
  }

   /**
   * Get currentFirmwareId
   * @return currentFirmwareId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentFirmwareId() {
    return currentFirmwareId;
  }


  public void setCurrentFirmwareId(String currentFirmwareId) {
    this.currentFirmwareId = currentFirmwareId;
  }


  public FirmwareMetadata targetFirmwareId(String targetFirmwareId) {
    
    this.targetFirmwareId = targetFirmwareId;
    return this;
  }

   /**
   * Get targetFirmwareId
   * @return targetFirmwareId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetFirmwareId() {
    return targetFirmwareId;
  }


  public void setTargetFirmwareId(String targetFirmwareId) {
    this.targetFirmwareId = targetFirmwareId;
  }


  public FirmwareMetadata firmwareVersion(String firmwareVersion) {
    
    this.firmwareVersion = firmwareVersion;
    return this;
  }

   /**
   * Last reported firmware version.
   * @return firmwareVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last reported firmware version.")

  public String getFirmwareVersion() {
    return firmwareVersion;
  }


  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }


  public FirmwareMetadata serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public FirmwareMetadata modelNumber(String modelNumber) {
    
    this.modelNumber = modelNumber;
    return this;
  }

   /**
   * Get modelNumber
   * @return modelNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModelNumber() {
    return modelNumber;
  }


  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }


  public FirmwareMetadata manufacturer(String manufacturer) {
    
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManufacturer() {
    return manufacturer;
  }


  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  public FirmwareMetadata state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of the firmware.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State of the firmware.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public FirmwareMetadata stateMessage(String stateMessage) {
    
    this.stateMessage = stateMessage;
    return this;
  }

   /**
   * Get stateMessage
   * @return stateMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateMessage() {
    return stateMessage;
  }


  public void setStateMessage(String stateMessage) {
    this.stateMessage = stateMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareMetadata firmwareMetadata = (FirmwareMetadata) o;
    return Objects.equals(this.currentFirmwareId, firmwareMetadata.currentFirmwareId) &&
        Objects.equals(this.targetFirmwareId, firmwareMetadata.targetFirmwareId) &&
        Objects.equals(this.firmwareVersion, firmwareMetadata.firmwareVersion) &&
        Objects.equals(this.serialNumber, firmwareMetadata.serialNumber) &&
        Objects.equals(this.modelNumber, firmwareMetadata.modelNumber) &&
        Objects.equals(this.manufacturer, firmwareMetadata.manufacturer) &&
        Objects.equals(this.state, firmwareMetadata.state) &&
        Objects.equals(this.stateMessage, firmwareMetadata.stateMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentFirmwareId, targetFirmwareId, firmwareVersion, serialNumber, modelNumber, manufacturer, state, stateMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareMetadata {\n");
    sb.append("    currentFirmwareId: ").append(toIndentedString(currentFirmwareId)).append("\n");
    sb.append("    targetFirmwareId: ").append(toIndentedString(targetFirmwareId)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    modelNumber: ").append(toIndentedString(modelNumber)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateMessage: ").append(toIndentedString(stateMessage)).append("\n");
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

