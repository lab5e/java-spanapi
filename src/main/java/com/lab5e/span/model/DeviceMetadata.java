/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.4.0 lean-joline
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
import com.lab5e.span.model.CellularIoTMetadata;
import com.lab5e.span.model.GatewayDeviceMetadata;
import com.lab5e.span.model.InetMetadata;
import com.lab5e.span.model.NetworkOperator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This is the metadata for devices.
 */
@ApiModel(description = "This is the metadata for devices.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-20T17:19:07.548218Z[Etc/UTC]")
public class DeviceMetadata {
  public static final String SERIALIZED_NAME_SIM_OPERATOR = "simOperator";
  @SerializedName(SERIALIZED_NAME_SIM_OPERATOR)
  private NetworkOperator simOperator;

  public static final String SERIALIZED_NAME_CIOT = "ciot";
  @SerializedName(SERIALIZED_NAME_CIOT)
  private CellularIoTMetadata ciot;

  public static final String SERIALIZED_NAME_INET = "inet";
  @SerializedName(SERIALIZED_NAME_INET)
  private InetMetadata inet;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private GatewayDeviceMetadata gateway;

  public DeviceMetadata() { 
  }

  public DeviceMetadata simOperator(NetworkOperator simOperator) {
    
    this.simOperator = simOperator;
    return this;
  }

   /**
   * Get simOperator
   * @return simOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkOperator getSimOperator() {
    return simOperator;
  }


  public void setSimOperator(NetworkOperator simOperator) {
    this.simOperator = simOperator;
  }


  public DeviceMetadata ciot(CellularIoTMetadata ciot) {
    
    this.ciot = ciot;
    return this;
  }

   /**
   * Get ciot
   * @return ciot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CellularIoTMetadata getCiot() {
    return ciot;
  }


  public void setCiot(CellularIoTMetadata ciot) {
    this.ciot = ciot;
  }


  public DeviceMetadata inet(InetMetadata inet) {
    
    this.inet = inet;
    return this;
  }

   /**
   * Get inet
   * @return inet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InetMetadata getInet() {
    return inet;
  }


  public void setInet(InetMetadata inet) {
    this.inet = inet;
  }


  public DeviceMetadata gateway(GatewayDeviceMetadata gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GatewayDeviceMetadata getGateway() {
    return gateway;
  }


  public void setGateway(GatewayDeviceMetadata gateway) {
    this.gateway = gateway;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMetadata deviceMetadata = (DeviceMetadata) o;
    return Objects.equals(this.simOperator, deviceMetadata.simOperator) &&
        Objects.equals(this.ciot, deviceMetadata.ciot) &&
        Objects.equals(this.inet, deviceMetadata.inet) &&
        Objects.equals(this.gateway, deviceMetadata.gateway);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simOperator, ciot, inet, gateway);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMetadata {\n");
    sb.append("    simOperator: ").append(toIndentedString(simOperator)).append("\n");
    sb.append("    ciot: ").append(toIndentedString(ciot)).append("\n");
    sb.append("    inet: ").append(toIndentedString(inet)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
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

