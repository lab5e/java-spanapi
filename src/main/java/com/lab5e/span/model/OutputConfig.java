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
 * Configuration for outputs.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-28T14:16:04.138325Z[Etc/UTC]")
public class OutputConfig {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_BASIC_AUTH_USER = "basicAuthUser";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH_USER)
  private String basicAuthUser;

  public static final String SERIALIZED_NAME_BASIC_AUTH_PASS = "basicAuthPass";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH_PASS)
  private String basicAuthPass;

  public static final String SERIALIZED_NAME_CUSTOM_HEADER_NAME = "customHeaderName";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HEADER_NAME)
  private String customHeaderName;

  public static final String SERIALIZED_NAME_CUSTOM_HEADER_VALUE = "customHeaderValue";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HEADER_VALUE)
  private String customHeaderValue;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_AS_IS_PAYLOAD = "asIsPayload";
  @SerializedName(SERIALIZED_NAME_AS_IS_PAYLOAD)
  private Boolean asIsPayload;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_DISABLE_CERT_CHECK = "disableCertCheck";
  @SerializedName(SERIALIZED_NAME_DISABLE_CERT_CHECK)
  private Boolean disableCertCheck;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_TOPIC_NAME = "topicName";
  @SerializedName(SERIALIZED_NAME_TOPIC_NAME)
  private String topicName;

  public static final String SERIALIZED_NAME_TOPIC_TEMPLATE = "topicTemplate";
  @SerializedName(SERIALIZED_NAME_TOPIC_TEMPLATE)
  private byte[] topicTemplate;

  public static final String SERIALIZED_NAME_PAYLOAD_FORMAT = "payloadFormat";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_FORMAT)
  private String payloadFormat;

  public static final String SERIALIZED_NAME_PAYLOAD_TEMPLATE = "payloadTemplate";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_TEMPLATE)
  private byte[] payloadTemplate;

  public OutputConfig() {
  }

  public OutputConfig url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL for the webhook.
   * @return url
  **/
  @javax.annotation.Nullable

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public OutputConfig basicAuthUser(String basicAuthUser) {
    
    this.basicAuthUser = basicAuthUser;
    return this;
  }

   /**
   * Get basicAuthUser
   * @return basicAuthUser
  **/
  @javax.annotation.Nullable

  public String getBasicAuthUser() {
    return basicAuthUser;
  }


  public void setBasicAuthUser(String basicAuthUser) {
    this.basicAuthUser = basicAuthUser;
  }


  public OutputConfig basicAuthPass(String basicAuthPass) {
    
    this.basicAuthPass = basicAuthPass;
    return this;
  }

   /**
   * Get basicAuthPass
   * @return basicAuthPass
  **/
  @javax.annotation.Nullable

  public String getBasicAuthPass() {
    return basicAuthPass;
  }


  public void setBasicAuthPass(String basicAuthPass) {
    this.basicAuthPass = basicAuthPass;
  }


  public OutputConfig customHeaderName(String customHeaderName) {
    
    this.customHeaderName = customHeaderName;
    return this;
  }

   /**
   * Get customHeaderName
   * @return customHeaderName
  **/
  @javax.annotation.Nullable

  public String getCustomHeaderName() {
    return customHeaderName;
  }


  public void setCustomHeaderName(String customHeaderName) {
    this.customHeaderName = customHeaderName;
  }


  public OutputConfig customHeaderValue(String customHeaderValue) {
    
    this.customHeaderValue = customHeaderValue;
    return this;
  }

   /**
   * Get customHeaderValue
   * @return customHeaderValue
  **/
  @javax.annotation.Nullable

  public String getCustomHeaderValue() {
    return customHeaderValue;
  }


  public void setCustomHeaderValue(String customHeaderValue) {
    this.customHeaderValue = customHeaderValue;
  }


  public OutputConfig host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public OutputConfig port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public OutputConfig key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public OutputConfig eventName(String eventName) {
    
    this.eventName = eventName;
    return this;
  }

   /**
   * Get eventName
   * @return eventName
  **/
  @javax.annotation.Nullable

  public String getEventName() {
    return eventName;
  }


  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public OutputConfig asIsPayload(Boolean asIsPayload) {
    
    this.asIsPayload = asIsPayload;
    return this;
  }

   /**
   * Get asIsPayload
   * @return asIsPayload
  **/
  @javax.annotation.Nullable

  public Boolean getAsIsPayload() {
    return asIsPayload;
  }


  public void setAsIsPayload(Boolean asIsPayload) {
    this.asIsPayload = asIsPayload;
  }


  public OutputConfig endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public OutputConfig disableCertCheck(Boolean disableCertCheck) {
    
    this.disableCertCheck = disableCertCheck;
    return this;
  }

   /**
   * MQTT configuration: Disable certificate checks. Default is off.
   * @return disableCertCheck
  **/
  @javax.annotation.Nullable

  public Boolean getDisableCertCheck() {
    return disableCertCheck;
  }


  public void setDisableCertCheck(Boolean disableCertCheck) {
    this.disableCertCheck = disableCertCheck;
  }


  public OutputConfig username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public OutputConfig password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public OutputConfig clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public OutputConfig topicName(String topicName) {
    
    this.topicName = topicName;
    return this;
  }

   /**
   * Get topicName
   * @return topicName
  **/
  @javax.annotation.Nullable

  public String getTopicName() {
    return topicName;
  }


  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  public OutputConfig topicTemplate(byte[] topicTemplate) {
    
    this.topicTemplate = topicTemplate;
    return this;
  }

   /**
   * Get topicTemplate
   * @return topicTemplate
  **/
  @javax.annotation.Nullable

  public byte[] getTopicTemplate() {
    return topicTemplate;
  }


  public void setTopicTemplate(byte[] topicTemplate) {
    this.topicTemplate = topicTemplate;
  }


  public OutputConfig payloadFormat(String payloadFormat) {
    
    this.payloadFormat = payloadFormat;
    return this;
  }

   /**
   * Get payloadFormat
   * @return payloadFormat
  **/
  @javax.annotation.Nullable

  public String getPayloadFormat() {
    return payloadFormat;
  }


  public void setPayloadFormat(String payloadFormat) {
    this.payloadFormat = payloadFormat;
  }


  public OutputConfig payloadTemplate(byte[] payloadTemplate) {
    
    this.payloadTemplate = payloadTemplate;
    return this;
  }

   /**
   * Get payloadTemplate
   * @return payloadTemplate
  **/
  @javax.annotation.Nullable

  public byte[] getPayloadTemplate() {
    return payloadTemplate;
  }


  public void setPayloadTemplate(byte[] payloadTemplate) {
    this.payloadTemplate = payloadTemplate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputConfig outputConfig = (OutputConfig) o;
    return Objects.equals(this.url, outputConfig.url) &&
        Objects.equals(this.basicAuthUser, outputConfig.basicAuthUser) &&
        Objects.equals(this.basicAuthPass, outputConfig.basicAuthPass) &&
        Objects.equals(this.customHeaderName, outputConfig.customHeaderName) &&
        Objects.equals(this.customHeaderValue, outputConfig.customHeaderValue) &&
        Objects.equals(this.host, outputConfig.host) &&
        Objects.equals(this.port, outputConfig.port) &&
        Objects.equals(this.key, outputConfig.key) &&
        Objects.equals(this.eventName, outputConfig.eventName) &&
        Objects.equals(this.asIsPayload, outputConfig.asIsPayload) &&
        Objects.equals(this.endpoint, outputConfig.endpoint) &&
        Objects.equals(this.disableCertCheck, outputConfig.disableCertCheck) &&
        Objects.equals(this.username, outputConfig.username) &&
        Objects.equals(this.password, outputConfig.password) &&
        Objects.equals(this.clientId, outputConfig.clientId) &&
        Objects.equals(this.topicName, outputConfig.topicName) &&
        Arrays.equals(this.topicTemplate, outputConfig.topicTemplate) &&
        Objects.equals(this.payloadFormat, outputConfig.payloadFormat) &&
        Arrays.equals(this.payloadTemplate, outputConfig.payloadTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, basicAuthUser, basicAuthPass, customHeaderName, customHeaderValue, host, port, key, eventName, asIsPayload, endpoint, disableCertCheck, username, password, clientId, topicName, Arrays.hashCode(topicTemplate), payloadFormat, Arrays.hashCode(payloadTemplate));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputConfig {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    basicAuthUser: ").append(toIndentedString(basicAuthUser)).append("\n");
    sb.append("    basicAuthPass: ").append(toIndentedString(basicAuthPass)).append("\n");
    sb.append("    customHeaderName: ").append(toIndentedString(customHeaderName)).append("\n");
    sb.append("    customHeaderValue: ").append(toIndentedString(customHeaderValue)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    asIsPayload: ").append(toIndentedString(asIsPayload)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    disableCertCheck: ").append(toIndentedString(disableCertCheck)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    topicTemplate: ").append(toIndentedString(topicTemplate)).append("\n");
    sb.append("    payloadFormat: ").append(toIndentedString(payloadFormat)).append("\n");
    sb.append("    payloadTemplate: ").append(toIndentedString(payloadTemplate)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("basicAuthUser");
    openapiFields.add("basicAuthPass");
    openapiFields.add("customHeaderName");
    openapiFields.add("customHeaderValue");
    openapiFields.add("host");
    openapiFields.add("port");
    openapiFields.add("key");
    openapiFields.add("eventName");
    openapiFields.add("asIsPayload");
    openapiFields.add("endpoint");
    openapiFields.add("disableCertCheck");
    openapiFields.add("username");
    openapiFields.add("password");
    openapiFields.add("clientId");
    openapiFields.add("topicName");
    openapiFields.add("topicTemplate");
    openapiFields.add("payloadFormat");
    openapiFields.add("payloadTemplate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OutputConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OutputConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutputConfig is not found in the empty JSON string", OutputConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OutputConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutputConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("basicAuthUser") != null && !jsonObj.get("basicAuthUser").isJsonNull()) && !jsonObj.get("basicAuthUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `basicAuthUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("basicAuthUser").toString()));
      }
      if ((jsonObj.get("basicAuthPass") != null && !jsonObj.get("basicAuthPass").isJsonNull()) && !jsonObj.get("basicAuthPass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `basicAuthPass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("basicAuthPass").toString()));
      }
      if ((jsonObj.get("customHeaderName") != null && !jsonObj.get("customHeaderName").isJsonNull()) && !jsonObj.get("customHeaderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customHeaderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customHeaderName").toString()));
      }
      if ((jsonObj.get("customHeaderValue") != null && !jsonObj.get("customHeaderValue").isJsonNull()) && !jsonObj.get("customHeaderValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customHeaderValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customHeaderValue").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("eventName") != null && !jsonObj.get("eventName").isJsonNull()) && !jsonObj.get("eventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventName").toString()));
      }
      if ((jsonObj.get("endpoint") != null && !jsonObj.get("endpoint").isJsonNull()) && !jsonObj.get("endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      if ((jsonObj.get("topicName") != null && !jsonObj.get("topicName").isJsonNull()) && !jsonObj.get("topicName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topicName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topicName").toString()));
      }
      if ((jsonObj.get("payloadFormat") != null && !jsonObj.get("payloadFormat").isJsonNull()) && !jsonObj.get("payloadFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payloadFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payloadFormat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutputConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutputConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutputConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutputConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<OutputConfig>() {
           @Override
           public void write(JsonWriter out, OutputConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutputConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutputConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutputConfig
  * @throws IOException if the JSON string is invalid with respect to OutputConfig
  */
  public static OutputConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutputConfig.class);
  }

 /**
  * Convert an instance of OutputConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

