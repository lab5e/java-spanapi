/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.6.0 truthful-holli
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
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lab5e.JSON;

/**
 * Metadata about firmware on devices.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T16:11:05.104214Z[Etc/UTC]")
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

  public FirmwareMetadata() {
  }

  public FirmwareMetadata currentFirmwareId(String currentFirmwareId) {
    
    this.currentFirmwareId = currentFirmwareId;
    return this;
  }

   /**
   * Get currentFirmwareId
   * @return currentFirmwareId
  **/
  @javax.annotation.Nullable

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
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("currentFirmwareId");
    openapiFields.add("targetFirmwareId");
    openapiFields.add("firmwareVersion");
    openapiFields.add("serialNumber");
    openapiFields.add("modelNumber");
    openapiFields.add("manufacturer");
    openapiFields.add("state");
    openapiFields.add("stateMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FirmwareMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FirmwareMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirmwareMetadata is not found in the empty JSON string", FirmwareMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FirmwareMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirmwareMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("currentFirmwareId") != null && !jsonObj.get("currentFirmwareId").isJsonNull()) && !jsonObj.get("currentFirmwareId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentFirmwareId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentFirmwareId").toString()));
      }
      if ((jsonObj.get("targetFirmwareId") != null && !jsonObj.get("targetFirmwareId").isJsonNull()) && !jsonObj.get("targetFirmwareId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetFirmwareId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetFirmwareId").toString()));
      }
      if ((jsonObj.get("firmwareVersion") != null && !jsonObj.get("firmwareVersion").isJsonNull()) && !jsonObj.get("firmwareVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firmwareVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firmwareVersion").toString()));
      }
      if ((jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonNull()) && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
      if ((jsonObj.get("modelNumber") != null && !jsonObj.get("modelNumber").isJsonNull()) && !jsonObj.get("modelNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modelNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modelNumber").toString()));
      }
      if ((jsonObj.get("manufacturer") != null && !jsonObj.get("manufacturer").isJsonNull()) && !jsonObj.get("manufacturer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturer").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("stateMessage") != null && !jsonObj.get("stateMessage").isJsonNull()) && !jsonObj.get("stateMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirmwareMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirmwareMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirmwareMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirmwareMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<FirmwareMetadata>() {
           @Override
           public void write(JsonWriter out, FirmwareMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirmwareMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirmwareMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirmwareMetadata
  * @throws IOException if the JSON string is invalid with respect to FirmwareMetadata
  */
  public static FirmwareMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirmwareMetadata.class);
  }

 /**
  * Convert an instance of FirmwareMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

