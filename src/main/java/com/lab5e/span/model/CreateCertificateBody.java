/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.2 subversive-jamila
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
 * Request object to create a new certificate.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-20T13:46:24.103529Z[Etc/UTC]")
public class CreateCertificateBody {
  public static final String SERIALIZED_NAME_GATEWAY_ID = "gatewayId";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ID)
  private String gatewayId;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public CreateCertificateBody() {
  }

  public CreateCertificateBody gatewayId(String gatewayId) {
    
    this.gatewayId = gatewayId;
    return this;
  }

   /**
   * Get gatewayId
   * @return gatewayId
  **/
  @javax.annotation.Nullable

  public String getGatewayId() {
    return gatewayId;
  }


  public void setGatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
  }


  public CreateCertificateBody deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @javax.annotation.Nullable

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCertificateBody createCertificateBody = (CreateCertificateBody) o;
    return Objects.equals(this.gatewayId, createCertificateBody.gatewayId) &&
        Objects.equals(this.deviceId, createCertificateBody.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayId, deviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCertificateBody {\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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
    openapiFields.add("gatewayId");
    openapiFields.add("deviceId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCertificateBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateCertificateBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCertificateBody is not found in the empty JSON string", CreateCertificateBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCertificateBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCertificateBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("gatewayId") != null && !jsonObj.get("gatewayId").isJsonNull()) && !jsonObj.get("gatewayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gatewayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gatewayId").toString()));
      }
      if ((jsonObj.get("deviceId") != null && !jsonObj.get("deviceId").isJsonNull()) && !jsonObj.get("deviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCertificateBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCertificateBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCertificateBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCertificateBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCertificateBody>() {
           @Override
           public void write(JsonWriter out, CreateCertificateBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCertificateBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCertificateBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCertificateBody
  * @throws IOException if the JSON string is invalid with respect to CreateCertificateBody
  */
  public static CreateCertificateBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCertificateBody.class);
  }

 /**
  * Convert an instance of CreateCertificateBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
