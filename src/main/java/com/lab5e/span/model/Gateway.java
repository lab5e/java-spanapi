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
import com.lab5e.span.model.GatewayConfig;
import com.lab5e.span.model.GatewayStatus;
import com.lab5e.span.model.GatewayType;
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
 * A gateway is a connection between devices and Span
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-07T13:34:32.869263Z[Etc/UTC]")
public class Gateway {
  public static final String SERIALIZED_NAME_GATEWAY_ID = "gatewayId";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ID)
  private String gatewayId;

  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BUILT_IN = "builtIn";
  @SerializedName(SERIALIZED_NAME_BUILT_IN)
  private Boolean builtIn;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private GatewayType type = GatewayType.UNKNOWN;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private GatewayConfig config;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GatewayStatus status = GatewayStatus.UNKNOWN;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public Gateway() {
  }

  public Gateway gatewayId(String gatewayId) {
    
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


  public Gateway collectionId(String collectionId) {
    
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


  public Gateway name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Gateway builtIn(Boolean builtIn) {
    
    this.builtIn = builtIn;
    return this;
  }

   /**
   * Get builtIn
   * @return builtIn
  **/
  @javax.annotation.Nullable

  public Boolean getBuiltIn() {
    return builtIn;
  }


  public void setBuiltIn(Boolean builtIn) {
    this.builtIn = builtIn;
  }


  public Gateway type(GatewayType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public GatewayType getType() {
    return type;
  }


  public void setType(GatewayType type) {
    this.type = type;
  }


  public Gateway config(GatewayConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable

  public GatewayConfig getConfig() {
    return config;
  }


  public void setConfig(GatewayConfig config) {
    this.config = config;
  }


  public Gateway tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Gateway putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public Gateway status(GatewayStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable

  public GatewayStatus getStatus() {
    return status;
  }


  public void setStatus(GatewayStatus status) {
    this.status = status;
  }


  public Gateway enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Gateway gateway = (Gateway) o;
    return Objects.equals(this.gatewayId, gateway.gatewayId) &&
        Objects.equals(this.collectionId, gateway.collectionId) &&
        Objects.equals(this.name, gateway.name) &&
        Objects.equals(this.builtIn, gateway.builtIn) &&
        Objects.equals(this.type, gateway.type) &&
        Objects.equals(this.config, gateway.config) &&
        Objects.equals(this.tags, gateway.tags) &&
        Objects.equals(this.status, gateway.status) &&
        Objects.equals(this.enabled, gateway.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayId, collectionId, name, builtIn, type, config, tags, status, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Gateway {\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    builtIn: ").append(toIndentedString(builtIn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
    openapiFields.add("collectionId");
    openapiFields.add("name");
    openapiFields.add("builtIn");
    openapiFields.add("type");
    openapiFields.add("config");
    openapiFields.add("tags");
    openapiFields.add("status");
    openapiFields.add("enabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Gateway
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Gateway.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Gateway is not found in the empty JSON string", Gateway.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Gateway.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Gateway` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("gatewayId") != null && !jsonObj.get("gatewayId").isJsonNull()) && !jsonObj.get("gatewayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gatewayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gatewayId").toString()));
      }
      if ((jsonObj.get("collectionId") != null && !jsonObj.get("collectionId").isJsonNull()) && !jsonObj.get("collectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectionId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `config`
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonNull()) {
        GatewayConfig.validateJsonObject(jsonObj.getAsJsonObject("config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Gateway.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Gateway' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Gateway> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Gateway.class));

       return (TypeAdapter<T>) new TypeAdapter<Gateway>() {
           @Override
           public void write(JsonWriter out, Gateway value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Gateway read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Gateway given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Gateway
  * @throws IOException if the JSON string is invalid with respect to Gateway
  */
  public static Gateway fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Gateway.class);
  }

 /**
  * Convert an instance of Gateway to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

