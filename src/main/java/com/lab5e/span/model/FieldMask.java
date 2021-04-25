/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.11 evasive-governor
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
 * FieldMask
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-25T13:12:27.979Z[GMT]")
public class FieldMask {
  public static final String SERIALIZED_NAME_IMSI = "imsi";
  @SerializedName(SERIALIZED_NAME_IMSI)
  private Boolean imsi;

  public static final String SERIALIZED_NAME_IMEI = "imei";
  @SerializedName(SERIALIZED_NAME_IMEI)
  private Boolean imei;

  public static final String SERIALIZED_NAME_MSISDN = "msisdn";
  @SerializedName(SERIALIZED_NAME_MSISDN)
  private Boolean msisdn;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Boolean location;


  public FieldMask imsi(Boolean imsi) {
    
    this.imsi = imsi;
    return this;
  }

   /**
   * Get imsi
   * @return imsi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getImsi() {
    return imsi;
  }


  public void setImsi(Boolean imsi) {
    this.imsi = imsi;
  }


  public FieldMask imei(Boolean imei) {
    
    this.imei = imei;
    return this;
  }

   /**
   * Get imei
   * @return imei
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getImei() {
    return imei;
  }


  public void setImei(Boolean imei) {
    this.imei = imei;
  }


  public FieldMask msisdn(Boolean msisdn) {
    
    this.msisdn = msisdn;
    return this;
  }

   /**
   * Get msisdn
   * @return msisdn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMsisdn() {
    return msisdn;
  }


  public void setMsisdn(Boolean msisdn) {
    this.msisdn = msisdn;
  }


  public FieldMask location(Boolean location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLocation() {
    return location;
  }


  public void setLocation(Boolean location) {
    this.location = location;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldMask fieldMask = (FieldMask) o;
    return Objects.equals(this.imsi, fieldMask.imsi) &&
        Objects.equals(this.imei, fieldMask.imei) &&
        Objects.equals(this.msisdn, fieldMask.msisdn) &&
        Objects.equals(this.location, fieldMask.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imsi, imei, msisdn, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMask {\n");
    sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

