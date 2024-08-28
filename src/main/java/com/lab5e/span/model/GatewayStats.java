/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.1 humorous-jaron
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
 * This is statistics for a single gateway
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-28T14:16:04.138325Z[Etc/UTC]")
public class GatewayStats {
  public static final String SERIALIZED_NAME_MESSAGES_UPSTREAM = "messagesUpstream";
  @SerializedName(SERIALIZED_NAME_MESSAGES_UPSTREAM)
  private String messagesUpstream;

  public static final String SERIALIZED_NAME_MESSAGES_DOWNSTREAM = "messagesDownstream";
  @SerializedName(SERIALIZED_NAME_MESSAGES_DOWNSTREAM)
  private String messagesDownstream;

  public static final String SERIALIZED_NAME_BYTES_UPSTREAM = "bytesUpstream";
  @SerializedName(SERIALIZED_NAME_BYTES_UPSTREAM)
  private String bytesUpstream;

  public static final String SERIALIZED_NAME_BYTES_DOWNSTREAM = "bytesDownstream";
  @SerializedName(SERIALIZED_NAME_BYTES_DOWNSTREAM)
  private String bytesDownstream;

  public GatewayStats() {
  }

  public GatewayStats messagesUpstream(String messagesUpstream) {
    
    this.messagesUpstream = messagesUpstream;
    return this;
  }

   /**
   * Get messagesUpstream
   * @return messagesUpstream
  **/
  @javax.annotation.Nullable

  public String getMessagesUpstream() {
    return messagesUpstream;
  }


  public void setMessagesUpstream(String messagesUpstream) {
    this.messagesUpstream = messagesUpstream;
  }


  public GatewayStats messagesDownstream(String messagesDownstream) {
    
    this.messagesDownstream = messagesDownstream;
    return this;
  }

   /**
   * Get messagesDownstream
   * @return messagesDownstream
  **/
  @javax.annotation.Nullable

  public String getMessagesDownstream() {
    return messagesDownstream;
  }


  public void setMessagesDownstream(String messagesDownstream) {
    this.messagesDownstream = messagesDownstream;
  }


  public GatewayStats bytesUpstream(String bytesUpstream) {
    
    this.bytesUpstream = bytesUpstream;
    return this;
  }

   /**
   * Get bytesUpstream
   * @return bytesUpstream
  **/
  @javax.annotation.Nullable

  public String getBytesUpstream() {
    return bytesUpstream;
  }


  public void setBytesUpstream(String bytesUpstream) {
    this.bytesUpstream = bytesUpstream;
  }


  public GatewayStats bytesDownstream(String bytesDownstream) {
    
    this.bytesDownstream = bytesDownstream;
    return this;
  }

   /**
   * Get bytesDownstream
   * @return bytesDownstream
  **/
  @javax.annotation.Nullable

  public String getBytesDownstream() {
    return bytesDownstream;
  }


  public void setBytesDownstream(String bytesDownstream) {
    this.bytesDownstream = bytesDownstream;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayStats gatewayStats = (GatewayStats) o;
    return Objects.equals(this.messagesUpstream, gatewayStats.messagesUpstream) &&
        Objects.equals(this.messagesDownstream, gatewayStats.messagesDownstream) &&
        Objects.equals(this.bytesUpstream, gatewayStats.bytesUpstream) &&
        Objects.equals(this.bytesDownstream, gatewayStats.bytesDownstream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messagesUpstream, messagesDownstream, bytesUpstream, bytesDownstream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayStats {\n");
    sb.append("    messagesUpstream: ").append(toIndentedString(messagesUpstream)).append("\n");
    sb.append("    messagesDownstream: ").append(toIndentedString(messagesDownstream)).append("\n");
    sb.append("    bytesUpstream: ").append(toIndentedString(bytesUpstream)).append("\n");
    sb.append("    bytesDownstream: ").append(toIndentedString(bytesDownstream)).append("\n");
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
    openapiFields.add("messagesUpstream");
    openapiFields.add("messagesDownstream");
    openapiFields.add("bytesUpstream");
    openapiFields.add("bytesDownstream");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GatewayStats
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GatewayStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayStats is not found in the empty JSON string", GatewayStats.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GatewayStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayStats` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("messagesUpstream") != null && !jsonObj.get("messagesUpstream").isJsonNull()) && !jsonObj.get("messagesUpstream").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messagesUpstream` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messagesUpstream").toString()));
      }
      if ((jsonObj.get("messagesDownstream") != null && !jsonObj.get("messagesDownstream").isJsonNull()) && !jsonObj.get("messagesDownstream").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messagesDownstream` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messagesDownstream").toString()));
      }
      if ((jsonObj.get("bytesUpstream") != null && !jsonObj.get("bytesUpstream").isJsonNull()) && !jsonObj.get("bytesUpstream").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesUpstream` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesUpstream").toString()));
      }
      if ((jsonObj.get("bytesDownstream") != null && !jsonObj.get("bytesDownstream").isJsonNull()) && !jsonObj.get("bytesDownstream").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bytesDownstream` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bytesDownstream").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayStats.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayStats>() {
           @Override
           public void write(JsonWriter out, GatewayStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayStats read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GatewayStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GatewayStats
  * @throws IOException if the JSON string is invalid with respect to GatewayStats
  */
  public static GatewayStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayStats.class);
  }

 /**
  * Convert an instance of GatewayStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

