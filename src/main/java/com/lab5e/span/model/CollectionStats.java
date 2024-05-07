/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.9.6 authoritarian-betty
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
import com.lab5e.span.model.BlobStats;
import com.lab5e.span.model.DeviceStats;
import com.lab5e.span.model.FirmwareStats;
import com.lab5e.span.model.GatewayStats;
import com.lab5e.span.model.OutputStats;
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
 * This is statistics for an collection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-07T11:20:00.645212Z[Etc/UTC]")
public class CollectionStats {
  public static final String SERIALIZED_NAME_DEVICE_COUNT = "deviceCount";
  @SerializedName(SERIALIZED_NAME_DEVICE_COUNT)
  private Integer deviceCount;

  public static final String SERIALIZED_NAME_OUTPUT_COUNT = "outputCount";
  @SerializedName(SERIALIZED_NAME_OUTPUT_COUNT)
  private Integer outputCount;

  public static final String SERIALIZED_NAME_FIRMWARE_COUNT = "firmwareCount";
  @SerializedName(SERIALIZED_NAME_FIRMWARE_COUNT)
  private Integer firmwareCount;

  public static final String SERIALIZED_NAME_BLOB_COUNT = "blobCount";
  @SerializedName(SERIALIZED_NAME_BLOB_COUNT)
  private Integer blobCount;

  public static final String SERIALIZED_NAME_GATEWAY_COUNT = "gatewayCount";
  @SerializedName(SERIALIZED_NAME_GATEWAY_COUNT)
  private Integer gatewayCount;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private DeviceStats devices;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private OutputStats outputs;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private FirmwareStats firmware;

  public static final String SERIALIZED_NAME_BLOBS = "blobs";
  @SerializedName(SERIALIZED_NAME_BLOBS)
  private BlobStats blobs;

  public static final String SERIALIZED_NAME_GATEWAYS = "gateways";
  @SerializedName(SERIALIZED_NAME_GATEWAYS)
  private GatewayStats gateways;

  public CollectionStats() {
  }

  public CollectionStats deviceCount(Integer deviceCount) {
    
    this.deviceCount = deviceCount;
    return this;
  }

   /**
   * Get deviceCount
   * @return deviceCount
  **/
  @javax.annotation.Nullable

  public Integer getDeviceCount() {
    return deviceCount;
  }


  public void setDeviceCount(Integer deviceCount) {
    this.deviceCount = deviceCount;
  }


  public CollectionStats outputCount(Integer outputCount) {
    
    this.outputCount = outputCount;
    return this;
  }

   /**
   * Get outputCount
   * @return outputCount
  **/
  @javax.annotation.Nullable

  public Integer getOutputCount() {
    return outputCount;
  }


  public void setOutputCount(Integer outputCount) {
    this.outputCount = outputCount;
  }


  public CollectionStats firmwareCount(Integer firmwareCount) {
    
    this.firmwareCount = firmwareCount;
    return this;
  }

   /**
   * Get firmwareCount
   * @return firmwareCount
  **/
  @javax.annotation.Nullable

  public Integer getFirmwareCount() {
    return firmwareCount;
  }


  public void setFirmwareCount(Integer firmwareCount) {
    this.firmwareCount = firmwareCount;
  }


  public CollectionStats blobCount(Integer blobCount) {
    
    this.blobCount = blobCount;
    return this;
  }

   /**
   * Get blobCount
   * @return blobCount
  **/
  @javax.annotation.Nullable

  public Integer getBlobCount() {
    return blobCount;
  }


  public void setBlobCount(Integer blobCount) {
    this.blobCount = blobCount;
  }


  public CollectionStats gatewayCount(Integer gatewayCount) {
    
    this.gatewayCount = gatewayCount;
    return this;
  }

   /**
   * Get gatewayCount
   * @return gatewayCount
  **/
  @javax.annotation.Nullable

  public Integer getGatewayCount() {
    return gatewayCount;
  }


  public void setGatewayCount(Integer gatewayCount) {
    this.gatewayCount = gatewayCount;
  }


  public CollectionStats devices(DeviceStats devices) {
    
    this.devices = devices;
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable

  public DeviceStats getDevices() {
    return devices;
  }


  public void setDevices(DeviceStats devices) {
    this.devices = devices;
  }


  public CollectionStats outputs(OutputStats outputs) {
    
    this.outputs = outputs;
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable

  public OutputStats getOutputs() {
    return outputs;
  }


  public void setOutputs(OutputStats outputs) {
    this.outputs = outputs;
  }


  public CollectionStats firmware(FirmwareStats firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nullable

  public FirmwareStats getFirmware() {
    return firmware;
  }


  public void setFirmware(FirmwareStats firmware) {
    this.firmware = firmware;
  }


  public CollectionStats blobs(BlobStats blobs) {
    
    this.blobs = blobs;
    return this;
  }

   /**
   * Get blobs
   * @return blobs
  **/
  @javax.annotation.Nullable

  public BlobStats getBlobs() {
    return blobs;
  }


  public void setBlobs(BlobStats blobs) {
    this.blobs = blobs;
  }


  public CollectionStats gateways(GatewayStats gateways) {
    
    this.gateways = gateways;
    return this;
  }

   /**
   * Get gateways
   * @return gateways
  **/
  @javax.annotation.Nullable

  public GatewayStats getGateways() {
    return gateways;
  }


  public void setGateways(GatewayStats gateways) {
    this.gateways = gateways;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionStats collectionStats = (CollectionStats) o;
    return Objects.equals(this.deviceCount, collectionStats.deviceCount) &&
        Objects.equals(this.outputCount, collectionStats.outputCount) &&
        Objects.equals(this.firmwareCount, collectionStats.firmwareCount) &&
        Objects.equals(this.blobCount, collectionStats.blobCount) &&
        Objects.equals(this.gatewayCount, collectionStats.gatewayCount) &&
        Objects.equals(this.devices, collectionStats.devices) &&
        Objects.equals(this.outputs, collectionStats.outputs) &&
        Objects.equals(this.firmware, collectionStats.firmware) &&
        Objects.equals(this.blobs, collectionStats.blobs) &&
        Objects.equals(this.gateways, collectionStats.gateways);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceCount, outputCount, firmwareCount, blobCount, gatewayCount, devices, outputs, firmware, blobs, gateways);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionStats {\n");
    sb.append("    deviceCount: ").append(toIndentedString(deviceCount)).append("\n");
    sb.append("    outputCount: ").append(toIndentedString(outputCount)).append("\n");
    sb.append("    firmwareCount: ").append(toIndentedString(firmwareCount)).append("\n");
    sb.append("    blobCount: ").append(toIndentedString(blobCount)).append("\n");
    sb.append("    gatewayCount: ").append(toIndentedString(gatewayCount)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    blobs: ").append(toIndentedString(blobs)).append("\n");
    sb.append("    gateways: ").append(toIndentedString(gateways)).append("\n");
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
    openapiFields.add("deviceCount");
    openapiFields.add("outputCount");
    openapiFields.add("firmwareCount");
    openapiFields.add("blobCount");
    openapiFields.add("gatewayCount");
    openapiFields.add("devices");
    openapiFields.add("outputs");
    openapiFields.add("firmware");
    openapiFields.add("blobs");
    openapiFields.add("gateways");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CollectionStats
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CollectionStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollectionStats is not found in the empty JSON string", CollectionStats.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CollectionStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CollectionStats` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `devices`
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        DeviceStats.validateJsonObject(jsonObj.getAsJsonObject("devices"));
      }
      // validate the optional field `outputs`
      if (jsonObj.get("outputs") != null && !jsonObj.get("outputs").isJsonNull()) {
        OutputStats.validateJsonObject(jsonObj.getAsJsonObject("outputs"));
      }
      // validate the optional field `firmware`
      if (jsonObj.get("firmware") != null && !jsonObj.get("firmware").isJsonNull()) {
        FirmwareStats.validateJsonObject(jsonObj.getAsJsonObject("firmware"));
      }
      // validate the optional field `blobs`
      if (jsonObj.get("blobs") != null && !jsonObj.get("blobs").isJsonNull()) {
        BlobStats.validateJsonObject(jsonObj.getAsJsonObject("blobs"));
      }
      // validate the optional field `gateways`
      if (jsonObj.get("gateways") != null && !jsonObj.get("gateways").isJsonNull()) {
        GatewayStats.validateJsonObject(jsonObj.getAsJsonObject("gateways"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollectionStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollectionStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollectionStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollectionStats.class));

       return (TypeAdapter<T>) new TypeAdapter<CollectionStats>() {
           @Override
           public void write(JsonWriter out, CollectionStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CollectionStats read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CollectionStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CollectionStats
  * @throws IOException if the JSON string is invalid with respect to CollectionStats
  */
  public static CollectionStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollectionStats.class);
  }

 /**
  * Convert an instance of CollectionStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

