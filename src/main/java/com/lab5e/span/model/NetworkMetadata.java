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
 * This is the network metadata for a device.
 */
@ApiModel(description = "This is the network metadata for a device.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T09:27:02.556964Z[Etc/UTC]")
public class NetworkMetadata {
  public static final String SERIALIZED_NAME_ALLOCATED_IP = "allocatedIp";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_IP)
  private String allocatedIp;

  public static final String SERIALIZED_NAME_ALLOCATED_AT = "allocatedAt";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_AT)
  private String allocatedAt;

  public static final String SERIALIZED_NAME_CELL_ID = "cellId";
  @SerializedName(SERIALIZED_NAME_CELL_ID)
  private String cellId;

  public NetworkMetadata() { 
  }

  public NetworkMetadata allocatedIp(String allocatedIp) {
    
    this.allocatedIp = allocatedIp;
    return this;
  }

   /**
   * Allocated IP address.
   * @return allocatedIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allocated IP address.")

  public String getAllocatedIp() {
    return allocatedIp;
  }


  public void setAllocatedIp(String allocatedIp) {
    this.allocatedIp = allocatedIp;
  }


  public NetworkMetadata allocatedAt(String allocatedAt) {
    
    this.allocatedAt = allocatedAt;
    return this;
  }

   /**
   * Get allocatedAt
   * @return allocatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAllocatedAt() {
    return allocatedAt;
  }


  public void setAllocatedAt(String allocatedAt) {
    this.allocatedAt = allocatedAt;
  }


  public NetworkMetadata cellId(String cellId) {
    
    this.cellId = cellId;
    return this;
  }

   /**
   * Cell ID for device. This might not be set, depending on the provider in use.
   * @return cellId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cell ID for device. This might not be set, depending on the provider in use.")

  public String getCellId() {
    return cellId;
  }


  public void setCellId(String cellId) {
    this.cellId = cellId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkMetadata networkMetadata = (NetworkMetadata) o;
    return Objects.equals(this.allocatedIp, networkMetadata.allocatedIp) &&
        Objects.equals(this.allocatedAt, networkMetadata.allocatedAt) &&
        Objects.equals(this.cellId, networkMetadata.cellId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedIp, allocatedAt, cellId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkMetadata {\n");
    sb.append("    allocatedIp: ").append(toIndentedString(allocatedIp)).append("\n");
    sb.append("    allocatedAt: ").append(toIndentedString(allocatedAt)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
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

