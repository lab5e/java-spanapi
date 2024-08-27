/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.0 convulsive-launa
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
import java.util.ArrayList;
import java.util.List;

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
 * Firmware usage report
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T11:34:08.487808Z[Etc/UTC]")
public class FirmwareUsageResponse {
  public static final String SERIALIZED_NAME_IMAGE_ID = "imageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_TARGETED = "targeted";
  @SerializedName(SERIALIZED_NAME_TARGETED)
  private List<String> targeted = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private List<String> current = new ArrayList<>();

  public FirmwareUsageResponse() {
  }

  public FirmwareUsageResponse imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @javax.annotation.Nullable

  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public FirmwareUsageResponse targeted(List<String> targeted) {
    
    this.targeted = targeted;
    return this;
  }

  public FirmwareUsageResponse addTargetedItem(String targetedItem) {
    if (this.targeted == null) {
      this.targeted = new ArrayList<>();
    }
    this.targeted.add(targetedItem);
    return this;
  }

   /**
   * Get targeted
   * @return targeted
  **/
  @javax.annotation.Nullable

  public List<String> getTargeted() {
    return targeted;
  }


  public void setTargeted(List<String> targeted) {
    this.targeted = targeted;
  }


  public FirmwareUsageResponse current(List<String> current) {
    
    this.current = current;
    return this;
  }

  public FirmwareUsageResponse addCurrentItem(String currentItem) {
    if (this.current == null) {
      this.current = new ArrayList<>();
    }
    this.current.add(currentItem);
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nullable

  public List<String> getCurrent() {
    return current;
  }


  public void setCurrent(List<String> current) {
    this.current = current;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareUsageResponse firmwareUsageResponse = (FirmwareUsageResponse) o;
    return Objects.equals(this.imageId, firmwareUsageResponse.imageId) &&
        Objects.equals(this.targeted, firmwareUsageResponse.targeted) &&
        Objects.equals(this.current, firmwareUsageResponse.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, targeted, current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareUsageResponse {\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    targeted: ").append(toIndentedString(targeted)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
    openapiFields.add("imageId");
    openapiFields.add("targeted");
    openapiFields.add("current");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FirmwareUsageResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FirmwareUsageResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirmwareUsageResponse is not found in the empty JSON string", FirmwareUsageResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FirmwareUsageResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirmwareUsageResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("imageId") != null && !jsonObj.get("imageId").isJsonNull()) && !jsonObj.get("imageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("targeted") != null && !jsonObj.get("targeted").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `targeted` to be an array in the JSON string but got `%s`", jsonObj.get("targeted").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("current") != null && !jsonObj.get("current").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `current` to be an array in the JSON string but got `%s`", jsonObj.get("current").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirmwareUsageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirmwareUsageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirmwareUsageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirmwareUsageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FirmwareUsageResponse>() {
           @Override
           public void write(JsonWriter out, FirmwareUsageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirmwareUsageResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirmwareUsageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirmwareUsageResponse
  * @throws IOException if the JSON string is invalid with respect to FirmwareUsageResponse
  */
  public static FirmwareUsageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirmwareUsageResponse.class);
  }

 /**
  * Convert an instance of FirmwareUsageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

