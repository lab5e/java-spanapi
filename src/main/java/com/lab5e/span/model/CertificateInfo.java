/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.2.3 lower-elian
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
 * Certificate information
 */
@ApiModel(description = "Certificate information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-09T13:09:39.446649Z[Etc/UTC]")
public class CertificateInfo {
  public static final String SERIALIZED_NAME_CERTIFICATE_SERIAL = "certificateSerial";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_SERIAL)
  private String certificateSerial;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private String expires;

  public CertificateInfo() { 
  }

  public CertificateInfo certificateSerial(String certificateSerial) {
    
    this.certificateSerial = certificateSerial;
    return this;
  }

   /**
   * Get certificateSerial
   * @return certificateSerial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateSerial() {
    return certificateSerial;
  }


  public void setCertificateSerial(String certificateSerial) {
    this.certificateSerial = certificateSerial;
  }


  public CertificateInfo expires(String expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpires() {
    return expires;
  }


  public void setExpires(String expires) {
    this.expires = expires;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateInfo certificateInfo = (CertificateInfo) o;
    return Objects.equals(this.certificateSerial, certificateInfo.certificateSerial) &&
        Objects.equals(this.expires, certificateInfo.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateSerial, expires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateInfo {\n");
    sb.append("    certificateSerial: ").append(toIndentedString(certificateSerial)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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

