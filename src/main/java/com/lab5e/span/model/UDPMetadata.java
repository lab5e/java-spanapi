/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.3 pitch-dark-elza
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
 * UDP metadata for messages receveied through one of the UDP endpoints
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-07T13:34:32.869263Z[Etc/UTC]")
public class UDPMetadata {
  public static final String SERIALIZED_NAME_LOCAL_PORT = "localPort";
  @SerializedName(SERIALIZED_NAME_LOCAL_PORT)
  private Integer localPort;

  public static final String SERIALIZED_NAME_REMOTE_PORT = "remotePort";
  @SerializedName(SERIALIZED_NAME_REMOTE_PORT)
  private Integer remotePort;

  public UDPMetadata() {
  }

  public UDPMetadata localPort(Integer localPort) {
    
    this.localPort = localPort;
    return this;
  }

   /**
   * Get localPort
   * @return localPort
  **/
  @javax.annotation.Nullable

  public Integer getLocalPort() {
    return localPort;
  }


  public void setLocalPort(Integer localPort) {
    this.localPort = localPort;
  }


  public UDPMetadata remotePort(Integer remotePort) {
    
    this.remotePort = remotePort;
    return this;
  }

   /**
   * Get remotePort
   * @return remotePort
  **/
  @javax.annotation.Nullable

  public Integer getRemotePort() {
    return remotePort;
  }


  public void setRemotePort(Integer remotePort) {
    this.remotePort = remotePort;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UDPMetadata udPMetadata = (UDPMetadata) o;
    return Objects.equals(this.localPort, udPMetadata.localPort) &&
        Objects.equals(this.remotePort, udPMetadata.remotePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localPort, remotePort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDPMetadata {\n");
    sb.append("    localPort: ").append(toIndentedString(localPort)).append("\n");
    sb.append("    remotePort: ").append(toIndentedString(remotePort)).append("\n");
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
    openapiFields.add("localPort");
    openapiFields.add("remotePort");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UDPMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UDPMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UDPMetadata is not found in the empty JSON string", UDPMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UDPMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UDPMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UDPMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UDPMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UDPMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UDPMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<UDPMetadata>() {
           @Override
           public void write(JsonWriter out, UDPMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UDPMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UDPMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UDPMetadata
  * @throws IOException if the JSON string is invalid with respect to UDPMetadata
  */
  public static UDPMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UDPMetadata.class);
  }

 /**
  * Convert an instance of UDPMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

