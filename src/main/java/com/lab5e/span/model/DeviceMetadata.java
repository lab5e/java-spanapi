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
import com.lab5e.span.model.NetworkOperator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DeviceMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-14T18:46:06.793Z[GMT]")
public class DeviceMetadata {
  public static final String SERIALIZED_NAME_SIM_OPERATOR = "simOperator";
  @SerializedName(SERIALIZED_NAME_SIM_OPERATOR)
  private NetworkOperator simOperator;


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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMetadata deviceMetadata = (DeviceMetadata) o;
    return Objects.equals(this.simOperator, deviceMetadata.simOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMetadata {\n");
    sb.append("    simOperator: ").append(toIndentedString(simOperator)).append("\n");
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

