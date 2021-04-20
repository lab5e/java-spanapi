/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.7 prized-adelbert
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
import com.lab5e.span.model.FieldMask;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SystemInfoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-20T10:21:49.543Z[GMT]")
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

  public static final String SERIALIZED_NAME_DEFAULT_FIELD_MASK = "defaultFieldMask";
  @SerializedName(SERIALIZED_NAME_DEFAULT_FIELD_MASK)
  private FieldMask defaultFieldMask;

  public static final String SERIALIZED_NAME_FORCED_FIELD_MASK = "forcedFieldMask";
  @SerializedName(SERIALIZED_NAME_FORCED_FIELD_MASK)
  private FieldMask forcedFieldMask;


  public SystemInfoResponse version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get buildDate
   * @return buildDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get releaseName
   * @return releaseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseName() {
    return releaseName;
  }


  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }


  public SystemInfoResponse defaultFieldMask(FieldMask defaultFieldMask) {
    
    this.defaultFieldMask = defaultFieldMask;
    return this;
  }

   /**
   * Get defaultFieldMask
   * @return defaultFieldMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldMask getDefaultFieldMask() {
    return defaultFieldMask;
  }


  public void setDefaultFieldMask(FieldMask defaultFieldMask) {
    this.defaultFieldMask = defaultFieldMask;
  }


  public SystemInfoResponse forcedFieldMask(FieldMask forcedFieldMask) {
    
    this.forcedFieldMask = forcedFieldMask;
    return this;
  }

   /**
   * Get forcedFieldMask
   * @return forcedFieldMask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldMask getForcedFieldMask() {
    return forcedFieldMask;
  }


  public void setForcedFieldMask(FieldMask forcedFieldMask) {
    this.forcedFieldMask = forcedFieldMask;
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
        Objects.equals(this.releaseName, systemInfoResponse.releaseName) &&
        Objects.equals(this.defaultFieldMask, systemInfoResponse.defaultFieldMask) &&
        Objects.equals(this.forcedFieldMask, systemInfoResponse.forcedFieldMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, buildDate, releaseName, defaultFieldMask, forcedFieldMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfoResponse {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
    sb.append("    defaultFieldMask: ").append(toIndentedString(defaultFieldMask)).append("\n");
    sb.append("    forcedFieldMask: ").append(toIndentedString(forcedFieldMask)).append("\n");
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

