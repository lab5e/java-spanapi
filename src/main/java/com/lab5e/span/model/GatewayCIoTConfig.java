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
 * GatewayCIoTConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T11:34:08.487808Z[Etc/UTC]")
public class GatewayCIoTConfig {
  public static final String SERIALIZED_NAME_APN = "apn";
  @SerializedName(SERIALIZED_NAME_APN)
  private String apn;

  public static final String SERIALIZED_NAME_UDP_ENDPOINT = "udpEndpoint";
  @SerializedName(SERIALIZED_NAME_UDP_ENDPOINT)
  private String udpEndpoint;

  public static final String SERIALIZED_NAME_COAP_ENDPOINT = "coapEndpoint";
  @SerializedName(SERIALIZED_NAME_COAP_ENDPOINT)
  private String coapEndpoint;

  public GatewayCIoTConfig() {
  }

  public GatewayCIoTConfig apn(String apn) {
    
    this.apn = apn;
    return this;
  }

   /**
   * Get apn
   * @return apn
  **/
  @javax.annotation.Nullable

  public String getApn() {
    return apn;
  }


  public void setApn(String apn) {
    this.apn = apn;
  }


  public GatewayCIoTConfig udpEndpoint(String udpEndpoint) {
    
    this.udpEndpoint = udpEndpoint;
    return this;
  }

   /**
   * Get udpEndpoint
   * @return udpEndpoint
  **/
  @javax.annotation.Nullable

  public String getUdpEndpoint() {
    return udpEndpoint;
  }


  public void setUdpEndpoint(String udpEndpoint) {
    this.udpEndpoint = udpEndpoint;
  }


  public GatewayCIoTConfig coapEndpoint(String coapEndpoint) {
    
    this.coapEndpoint = coapEndpoint;
    return this;
  }

   /**
   * Get coapEndpoint
   * @return coapEndpoint
  **/
  @javax.annotation.Nullable

  public String getCoapEndpoint() {
    return coapEndpoint;
  }


  public void setCoapEndpoint(String coapEndpoint) {
    this.coapEndpoint = coapEndpoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayCIoTConfig gatewayCIoTConfig = (GatewayCIoTConfig) o;
    return Objects.equals(this.apn, gatewayCIoTConfig.apn) &&
        Objects.equals(this.udpEndpoint, gatewayCIoTConfig.udpEndpoint) &&
        Objects.equals(this.coapEndpoint, gatewayCIoTConfig.coapEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apn, udpEndpoint, coapEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayCIoTConfig {\n");
    sb.append("    apn: ").append(toIndentedString(apn)).append("\n");
    sb.append("    udpEndpoint: ").append(toIndentedString(udpEndpoint)).append("\n");
    sb.append("    coapEndpoint: ").append(toIndentedString(coapEndpoint)).append("\n");
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
    openapiFields.add("apn");
    openapiFields.add("udpEndpoint");
    openapiFields.add("coapEndpoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GatewayCIoTConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GatewayCIoTConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayCIoTConfig is not found in the empty JSON string", GatewayCIoTConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GatewayCIoTConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayCIoTConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apn") != null && !jsonObj.get("apn").isJsonNull()) && !jsonObj.get("apn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apn").toString()));
      }
      if ((jsonObj.get("udpEndpoint") != null && !jsonObj.get("udpEndpoint").isJsonNull()) && !jsonObj.get("udpEndpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `udpEndpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("udpEndpoint").toString()));
      }
      if ((jsonObj.get("coapEndpoint") != null && !jsonObj.get("coapEndpoint").isJsonNull()) && !jsonObj.get("coapEndpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coapEndpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coapEndpoint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayCIoTConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayCIoTConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayCIoTConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayCIoTConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayCIoTConfig>() {
           @Override
           public void write(JsonWriter out, GatewayCIoTConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayCIoTConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GatewayCIoTConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GatewayCIoTConfig
  * @throws IOException if the JSON string is invalid with respect to GatewayCIoTConfig
  */
  public static GatewayCIoTConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayCIoTConfig.class);
  }

 /**
  * Convert an instance of GatewayCIoTConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

