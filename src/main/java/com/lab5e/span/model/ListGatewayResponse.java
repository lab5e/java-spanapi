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
import com.lab5e.span.model.Gateway;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Response when listing gateways
 */
@ApiModel(description = "Response when listing gateways")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T09:27:02.556964Z[Etc/UTC]")
public class ListGatewayResponse {
  public static final String SERIALIZED_NAME_GATEWAYS = "gateways";
  @SerializedName(SERIALIZED_NAME_GATEWAYS)
  private List<Gateway> gateways = null;

  public ListGatewayResponse() { 
  }

  public ListGatewayResponse gateways(List<Gateway> gateways) {
    
    this.gateways = gateways;
    return this;
  }

  public ListGatewayResponse addGatewaysItem(Gateway gatewaysItem) {
    if (this.gateways == null) {
      this.gateways = new ArrayList<>();
    }
    this.gateways.add(gatewaysItem);
    return this;
  }

   /**
   * Get gateways
   * @return gateways
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Gateway> getGateways() {
    return gateways;
  }


  public void setGateways(List<Gateway> gateways) {
    this.gateways = gateways;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListGatewayResponse listGatewayResponse = (ListGatewayResponse) o;
    return Objects.equals(this.gateways, listGatewayResponse.gateways);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gateways);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGatewayResponse {\n");
    sb.append("    gateways: ").append(toIndentedString(gateways)).append("\n");
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

