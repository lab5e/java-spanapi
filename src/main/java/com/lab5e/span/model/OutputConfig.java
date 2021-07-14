/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.16 spooky-devante
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Output configuration.
 */
@ApiModel(description = "Output configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-14T18:46:06.793Z[GMT]")
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


  public OutputConfig url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "MQTT configuration: Disable certificate checks. Default is off.")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

  public String getTopicName() {
    return topicName;
  }


  public void setTopicName(String topicName) {
    this.topicName = topicName;
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
        Objects.equals(this.topicName, outputConfig.topicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, basicAuthUser, basicAuthPass, customHeaderName, customHeaderValue, host, port, key, eventName, asIsPayload, endpoint, disableCertCheck, username, password, clientId, topicName);
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

}

