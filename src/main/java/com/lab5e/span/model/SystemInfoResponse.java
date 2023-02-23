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
 * Response object for system information. This contains system-level information.
 */
@ApiModel(description = "Response object for system information. This contains system-level information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T15:35:53.852457Z[Etc/UTC]")
public class SystemInfoResponse {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_BUILD_DATE = "buildDate";
  @SerializedName(SERIALIZED_NAME_BUILD_DATE)
  private String buildDate;

  public static final String SERIALIZED_NAME_RELEASE_NAME = "releaseName";
  @SerializedName(SERIALIZED_NAME_RELEASE_NAME)
  private String releaseName;

  public SystemInfoResponse() { 
  }

  public SystemInfoResponse version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * This is the system version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is the system version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public SystemInfoResponse buildDate(String buildDate) {
    
    this.buildDate = buildDate;
    return this;
  }

   /**
   * The build time for this version.
   * @return buildDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The build time for this version.")

  public String getBuildDate() {
    return buildDate;
  }


  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }


  public SystemInfoResponse releaseName(String releaseName) {
    
    this.releaseName = releaseName;
    return this;
  }

   /**
   * Human-readable code name for this release. This can be easier to remember than the version number.
   * @return releaseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable code name for this release. This can be easier to remember than the version number.")

  public String getReleaseName() {
    return releaseName;
  }


  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfoResponse systemInfoResponse = (SystemInfoResponse) o;
    return Objects.equals(this.version, systemInfoResponse.version) &&
        Objects.equals(this.buildDate, systemInfoResponse.buildDate) &&
        Objects.equals(this.releaseName, systemInfoResponse.releaseName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, buildDate, releaseName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfoResponse {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
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

