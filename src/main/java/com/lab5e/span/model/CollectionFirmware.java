/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.5 contented-jamila
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
import com.lab5e.span.model.FirmwareManagement;
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
 * This is the firmware configuration for a collection.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-11T21:56:14.173008Z[Etc/UTC]")
public class CollectionFirmware {
  public static final String SERIALIZED_NAME_CURRENT_FIRMWARE_ID = "currentFirmwareId";
  @SerializedName(SERIALIZED_NAME_CURRENT_FIRMWARE_ID)
  private String currentFirmwareId;

  public static final String SERIALIZED_NAME_TARGET_FIRMWARE_ID = "targetFirmwareId";
  @SerializedName(SERIALIZED_NAME_TARGET_FIRMWARE_ID)
  private String targetFirmwareId;

  public static final String SERIALIZED_NAME_MANAGEMENT = "management";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT)
  private FirmwareManagement management = FirmwareManagement.UNSPECIFIED;

  public CollectionFirmware() {
  }

  public CollectionFirmware currentFirmwareId(String currentFirmwareId) {
    
    this.currentFirmwareId = currentFirmwareId;
    return this;
  }

   /**
   * The current firmware is the firmware that the devices are currently using.
   * @return currentFirmwareId
  **/
  @javax.annotation.Nullable

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

  public String getTargetFirmwareId() {
    return targetFirmwareId;
  }


  public void setTargetFirmwareId(String targetFirmwareId) {
    this.targetFirmwareId = targetFirmwareId;
  }


  public CollectionFirmware management(FirmwareManagement management) {
    
    this.management = management;
    return this;
  }

   /**
   * Get management
   * @return management
  **/
  @javax.annotation.Nullable

  public FirmwareManagement getManagement() {
    return management;
  }


  public void setManagement(FirmwareManagement management) {
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("currentFirmwareId");
    openapiFields.add("targetFirmwareId");
    openapiFields.add("management");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CollectionFirmware
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CollectionFirmware.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CollectionFirmware is not found in the empty JSON string", CollectionFirmware.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CollectionFirmware.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CollectionFirmware` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("currentFirmwareId") != null && !jsonObj.get("currentFirmwareId").isJsonNull()) && !jsonObj.get("currentFirmwareId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentFirmwareId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentFirmwareId").toString()));
      }
      if ((jsonObj.get("targetFirmwareId") != null && !jsonObj.get("targetFirmwareId").isJsonNull()) && !jsonObj.get("targetFirmwareId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetFirmwareId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetFirmwareId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CollectionFirmware.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CollectionFirmware' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CollectionFirmware> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CollectionFirmware.class));

       return (TypeAdapter<T>) new TypeAdapter<CollectionFirmware>() {
           @Override
           public void write(JsonWriter out, CollectionFirmware value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CollectionFirmware read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CollectionFirmware given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CollectionFirmware
  * @throws IOException if the JSON string is invalid with respect to CollectionFirmware
  */
  public static CollectionFirmware fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CollectionFirmware.class);
  }

 /**
  * Convert an instance of CollectionFirmware to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

