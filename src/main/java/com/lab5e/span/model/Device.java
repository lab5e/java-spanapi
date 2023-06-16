/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.6.1 squirming-codi
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
import com.lab5e.span.model.DeviceMetadata;
import com.lab5e.span.model.FirmwareMetadata;
import com.lab5e.span.model.MessageTransport;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * This a device
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T10:54:11.293559Z[Etc/UTC]")
public class Device {
  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private FirmwareMetadata firmware;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private DeviceConfig config;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private DeviceMetadata metadata;

  public static final String SERIALIZED_NAME_LAST_GATEWAY_ID = "lastGatewayId";
  @SerializedName(SERIALIZED_NAME_LAST_GATEWAY_ID)
  private String lastGatewayId;

  public static final String SERIALIZED_NAME_LAST_TRANSPORT = "lastTransport";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSPORT)
  private MessageTransport lastTransport = MessageTransport.UNSPECIFIED;

  public static final String SERIALIZED_NAME_LAST_RECEIVED = "lastReceived";
  @SerializedName(SERIALIZED_NAME_LAST_RECEIVED)
  private String lastReceived;

  public static final String SERIALIZED_NAME_LAST_PAYLOAD = "lastPayload";
  @SerializedName(SERIALIZED_NAME_LAST_PAYLOAD)
  private byte[] lastPayload;

  public Device() {
  }

  public Device deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * The device ID is assigned by the backend.
   * @return deviceId
  **/
  @javax.annotation.Nullable

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

  public String getCollectionId() {
    return collectionId;
  }


  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
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

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
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

  public FirmwareMetadata getFirmware() {
    return firmware;
  }


  public void setFirmware(FirmwareMetadata firmware) {
    this.firmware = firmware;
  }


  public Device config(DeviceConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable

  public DeviceConfig getConfig() {
    return config;
  }


  public void setConfig(DeviceConfig config) {
    this.config = config;
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

  public DeviceMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(DeviceMetadata metadata) {
    this.metadata = metadata;
  }


  public Device lastGatewayId(String lastGatewayId) {
    
    this.lastGatewayId = lastGatewayId;
    return this;
  }

   /**
   * Get lastGatewayId
   * @return lastGatewayId
  **/
  @javax.annotation.Nullable

  public String getLastGatewayId() {
    return lastGatewayId;
  }


  public void setLastGatewayId(String lastGatewayId) {
    this.lastGatewayId = lastGatewayId;
  }


  public Device lastTransport(MessageTransport lastTransport) {
    
    this.lastTransport = lastTransport;
    return this;
  }

   /**
   * Get lastTransport
   * @return lastTransport
  **/
  @javax.annotation.Nullable

  public MessageTransport getLastTransport() {
    return lastTransport;
  }


  public void setLastTransport(MessageTransport lastTransport) {
    this.lastTransport = lastTransport;
  }


  public Device lastReceived(String lastReceived) {
    
    this.lastReceived = lastReceived;
    return this;
  }

   /**
   * Get lastReceived
   * @return lastReceived
  **/
  @javax.annotation.Nullable

  public String getLastReceived() {
    return lastReceived;
  }


  public void setLastReceived(String lastReceived) {
    this.lastReceived = lastReceived;
  }


  public Device lastPayload(byte[] lastPayload) {
    
    this.lastPayload = lastPayload;
    return this;
  }

   /**
   * Get lastPayload
   * @return lastPayload
  **/
  @javax.annotation.Nullable

  public byte[] getLastPayload() {
    return lastPayload;
  }


  public void setLastPayload(byte[] lastPayload) {
    this.lastPayload = lastPayload;
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
        Objects.equals(this.tags, device.tags) &&
        Objects.equals(this.firmware, device.firmware) &&
        Objects.equals(this.config, device.config) &&
        Objects.equals(this.metadata, device.metadata) &&
        Objects.equals(this.lastGatewayId, device.lastGatewayId) &&
        Objects.equals(this.lastTransport, device.lastTransport) &&
        Objects.equals(this.lastReceived, device.lastReceived) &&
        Arrays.equals(this.lastPayload, device.lastPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, collectionId, tags, firmware, config, metadata, lastGatewayId, lastTransport, lastReceived, Arrays.hashCode(lastPayload));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    lastGatewayId: ").append(toIndentedString(lastGatewayId)).append("\n");
    sb.append("    lastTransport: ").append(toIndentedString(lastTransport)).append("\n");
    sb.append("    lastReceived: ").append(toIndentedString(lastReceived)).append("\n");
    sb.append("    lastPayload: ").append(toIndentedString(lastPayload)).append("\n");
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
    openapiFields.add("deviceId");
    openapiFields.add("collectionId");
    openapiFields.add("tags");
    openapiFields.add("firmware");
    openapiFields.add("config");
    openapiFields.add("metadata");
    openapiFields.add("lastGatewayId");
    openapiFields.add("lastTransport");
    openapiFields.add("lastReceived");
    openapiFields.add("lastPayload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Device
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Device.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Device is not found in the empty JSON string", Device.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Device.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Device` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("deviceId") != null && !jsonObj.get("deviceId").isJsonNull()) && !jsonObj.get("deviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceId").toString()));
      }
      if ((jsonObj.get("collectionId") != null && !jsonObj.get("collectionId").isJsonNull()) && !jsonObj.get("collectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectionId").toString()));
      }
      // validate the optional field `firmware`
      if (jsonObj.get("firmware") != null && !jsonObj.get("firmware").isJsonNull()) {
        FirmwareMetadata.validateJsonObject(jsonObj.getAsJsonObject("firmware"));
      }
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        DeviceConfig.validateJsonObject(jsonObj.getAsJsonObject("config"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        DeviceMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      if ((jsonObj.get("lastGatewayId") != null && !jsonObj.get("lastGatewayId").isJsonNull()) && !jsonObj.get("lastGatewayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastGatewayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastGatewayId").toString()));
      }
      if ((jsonObj.get("lastReceived") != null && !jsonObj.get("lastReceived").isJsonNull()) && !jsonObj.get("lastReceived").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastReceived` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastReceived").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Device.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Device' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Device> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Device.class));

       return (TypeAdapter<T>) new TypeAdapter<Device>() {
           @Override
           public void write(JsonWriter out, Device value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Device read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Device given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Device
  * @throws IOException if the JSON string is invalid with respect to Device
  */
  public static Device fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Device.class);
  }

 /**
  * Convert an instance of Device to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

