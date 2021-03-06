/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.2.4 curable-andres
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
 * UDP metadata for messages receveied through one of the UDP endpoints
 */
@ApiModel(description = "UDP metadata for messages receveied through one of the UDP endpoints")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T09:27:02.556964Z[Etc/UTC]")
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
  @ApiModelProperty(value = "")

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
  @ApiModelProperty(value = "")

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

}

