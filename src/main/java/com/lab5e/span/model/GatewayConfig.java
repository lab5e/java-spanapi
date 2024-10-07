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
import com.lab5e.span.model.GatewayCIoTConfig;
import com.lab5e.span.model.GatewayCustomConfig;
import com.lab5e.span.model.GatewayInetConfig;
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
 * GatewayConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-07T13:34:32.869263Z[Etc/UTC]")
public class GatewayConfig {
  public static final String SERIALIZED_NAME_CIOT = "ciot";
  @SerializedName(SERIALIZED_NAME_CIOT)
  private GatewayCIoTConfig ciot;

  public static final String SERIALIZED_NAME_INET = "inet";
  @SerializedName(SERIALIZED_NAME_INET)
  private GatewayInetConfig inet;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private GatewayCustomConfig user;

  public GatewayConfig() {
  }

  public GatewayConfig ciot(GatewayCIoTConfig ciot) {
    
    this.ciot = ciot;
    return this;
  }

   /**
   * Get ciot
   * @return ciot
  **/
  @javax.annotation.Nullable

  public GatewayCIoTConfig getCiot() {
    return ciot;
  }


  public void setCiot(GatewayCIoTConfig ciot) {
    this.ciot = ciot;
  }


  public GatewayConfig inet(GatewayInetConfig inet) {
    
    this.inet = inet;
    return this;
  }

   /**
   * Get inet
   * @return inet
  **/
  @javax.annotation.Nullable

  public GatewayInetConfig getInet() {
    return inet;
  }


  public void setInet(GatewayInetConfig inet) {
    this.inet = inet;
  }


  public GatewayConfig user(GatewayCustomConfig user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public GatewayCustomConfig getUser() {
    return user;
  }


  public void setUser(GatewayCustomConfig user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayConfig gatewayConfig = (GatewayConfig) o;
    return Objects.equals(this.ciot, gatewayConfig.ciot) &&
        Objects.equals(this.inet, gatewayConfig.inet) &&
        Objects.equals(this.user, gatewayConfig.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciot, inet, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayConfig {\n");
    sb.append("    ciot: ").append(toIndentedString(ciot)).append("\n");
    sb.append("    inet: ").append(toIndentedString(inet)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("ciot");
    openapiFields.add("inet");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GatewayConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GatewayConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayConfig is not found in the empty JSON string", GatewayConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GatewayConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `ciot`
      if (jsonObj.get("ciot") != null && !jsonObj.get("ciot").isJsonNull()) {
        GatewayCIoTConfig.validateJsonObject(jsonObj.getAsJsonObject("ciot"));
      }
      // validate the optional field `inet`
      if (jsonObj.get("inet") != null && !jsonObj.get("inet").isJsonNull()) {
        GatewayInetConfig.validateJsonObject(jsonObj.getAsJsonObject("inet"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        GatewayCustomConfig.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayConfig>() {
           @Override
           public void write(JsonWriter out, GatewayConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GatewayConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GatewayConfig
  * @throws IOException if the JSON string is invalid with respect to GatewayConfig
  */
  public static GatewayConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayConfig.class);
  }

 /**
  * Convert an instance of GatewayConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

