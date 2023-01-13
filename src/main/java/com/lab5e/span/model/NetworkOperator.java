/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.3.0 grouchy-aloysius
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
 * Operator holds information on the network operator. There might be several operators involved; one operator is running the network your devices are connected to and the SIM card in your device belongs to a different operator.  Deprecated: Replaced by CellularIoTMetadata
 */
@ApiModel(description = "Operator holds information on the network operator. There might be several operators involved; one operator is running the network your devices are connected to and the SIM card in your device belongs to a different operator.  Deprecated: Replaced by CellularIoTMetadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-13T11:18:28.250753Z[Etc/UTC]")
public class NetworkOperator {
  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private Integer mcc;

  public static final String SERIALIZED_NAME_MNC = "mnc";
  @SerializedName(SERIALIZED_NAME_MNC)
  private Integer mnc;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public NetworkOperator() { 
  }

  public NetworkOperator mcc(Integer mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * The Mobile Country Code for the operator.
   * @return mcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Mobile Country Code for the operator.")

  public Integer getMcc() {
    return mcc;
  }


  public void setMcc(Integer mcc) {
    this.mcc = mcc;
  }


  public NetworkOperator mnc(Integer mnc) {
    
    this.mnc = mnc;
    return this;
  }

   /**
   * Get mnc
   * @return mnc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMnc() {
    return mnc;
  }


  public void setMnc(Integer mnc) {
    this.mnc = mnc;
  }


  public NetworkOperator country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public NetworkOperator network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public NetworkOperator countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkOperator networkOperator = (NetworkOperator) o;
    return Objects.equals(this.mcc, networkOperator.mcc) &&
        Objects.equals(this.mnc, networkOperator.mnc) &&
        Objects.equals(this.country, networkOperator.country) &&
        Objects.equals(this.network, networkOperator.network) &&
        Objects.equals(this.countryCode, networkOperator.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcc, mnc, country, network, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkOperator {\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

