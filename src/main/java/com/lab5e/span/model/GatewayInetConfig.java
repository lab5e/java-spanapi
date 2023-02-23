/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.4.1 busy-janay
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
 * GatewayInetConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T15:35:53.852457Z[Etc/UTC]")
public class GatewayInetConfig {
  public static final String SERIALIZED_NAME_DTLS_ENDPOINT = "dtlsEndpoint";
  @SerializedName(SERIALIZED_NAME_DTLS_ENDPOINT)
  private String dtlsEndpoint;

  public static final String SERIALIZED_NAME_COAP_ENDPOINT = "coapEndpoint";
  @SerializedName(SERIALIZED_NAME_COAP_ENDPOINT)
  private String coapEndpoint;

  public static final String SERIALIZED_NAME_MQTT_ENDPOINT = "mqttEndpoint";
  @SerializedName(SERIALIZED_NAME_MQTT_ENDPOINT)
  private String mqttEndpoint;

  public GatewayInetConfig() { 
  }

  public GatewayInetConfig dtlsEndpoint(String dtlsEndpoint) {
    
    this.dtlsEndpoint = dtlsEndpoint;
    return this;
  }

   /**
   * Get dtlsEndpoint
   * @return dtlsEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDtlsEndpoint() {
    return dtlsEndpoint;
  }


  public void setDtlsEndpoint(String dtlsEndpoint) {
    this.dtlsEndpoint = dtlsEndpoint;
  }


  public GatewayInetConfig coapEndpoint(String coapEndpoint) {
    
    this.coapEndpoint = coapEndpoint;
    return this;
  }

   /**
   * Get coapEndpoint
   * @return coapEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoapEndpoint() {
    return coapEndpoint;
  }


  public void setCoapEndpoint(String coapEndpoint) {
    this.coapEndpoint = coapEndpoint;
  }


  public GatewayInetConfig mqttEndpoint(String mqttEndpoint) {
    
    this.mqttEndpoint = mqttEndpoint;
    return this;
  }

   /**
   * Get mqttEndpoint
   * @return mqttEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMqttEndpoint() {
    return mqttEndpoint;
  }


  public void setMqttEndpoint(String mqttEndpoint) {
    this.mqttEndpoint = mqttEndpoint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayInetConfig gatewayInetConfig = (GatewayInetConfig) o;
    return Objects.equals(this.dtlsEndpoint, gatewayInetConfig.dtlsEndpoint) &&
        Objects.equals(this.coapEndpoint, gatewayInetConfig.coapEndpoint) &&
        Objects.equals(this.mqttEndpoint, gatewayInetConfig.mqttEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dtlsEndpoint, coapEndpoint, mqttEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayInetConfig {\n");
    sb.append("    dtlsEndpoint: ").append(toIndentedString(dtlsEndpoint)).append("\n");
    sb.append("    coapEndpoint: ").append(toIndentedString(coapEndpoint)).append("\n");
    sb.append("    mqttEndpoint: ").append(toIndentedString(mqttEndpoint)).append("\n");
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
