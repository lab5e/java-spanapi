/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.18 disgruntled-jerald
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
 * OutputStatusResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-29T12:47:11.492Z[GMT]")
public class OutputStatusResponse {
  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_OUTPUT_ID = "outputId";
  @SerializedName(SERIALIZED_NAME_OUTPUT_ID)
  private String outputId;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_ERROR_COUNT = "errorCount";
  @SerializedName(SERIALIZED_NAME_ERROR_COUNT)
  private Integer errorCount;

  public static final String SERIALIZED_NAME_FORWARDED = "forwarded";
  @SerializedName(SERIALIZED_NAME_FORWARDED)
  private Integer forwarded;

  public static final String SERIALIZED_NAME_RECEIVED = "received";
  @SerializedName(SERIALIZED_NAME_RECEIVED)
  private Integer received;

  public static final String SERIALIZED_NAME_RETRANSMITS = "retransmits";
  @SerializedName(SERIALIZED_NAME_RETRANSMITS)
  private Integer retransmits;


  public OutputStatusResponse collectionId(String collectionId) {
    
    this.collectionId = collectionId;
    return this;
  }

   /**
   * Get collectionId
   * @return collectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCollectionId() {
    return collectionId;
  }


  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }


  public OutputStatusResponse outputId(String outputId) {
    
    this.outputId = outputId;
    return this;
  }

   /**
   * Get outputId
   * @return outputId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutputId() {
    return outputId;
  }


  public void setOutputId(String outputId) {
    this.outputId = outputId;
  }


  public OutputStatusResponse enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public OutputStatusResponse errorCount(Integer errorCount) {
    
    this.errorCount = errorCount;
    return this;
  }

   /**
   * Get errorCount
   * @return errorCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getErrorCount() {
    return errorCount;
  }


  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  public OutputStatusResponse forwarded(Integer forwarded) {
    
    this.forwarded = forwarded;
    return this;
  }

   /**
   * Get forwarded
   * @return forwarded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getForwarded() {
    return forwarded;
  }


  public void setForwarded(Integer forwarded) {
    this.forwarded = forwarded;
  }


  public OutputStatusResponse received(Integer received) {
    
    this.received = received;
    return this;
  }

   /**
   * Get received
   * @return received
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReceived() {
    return received;
  }


  public void setReceived(Integer received) {
    this.received = received;
  }


  public OutputStatusResponse retransmits(Integer retransmits) {
    
    this.retransmits = retransmits;
    return this;
  }

   /**
   * Get retransmits
   * @return retransmits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRetransmits() {
    return retransmits;
  }


  public void setRetransmits(Integer retransmits) {
    this.retransmits = retransmits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputStatusResponse outputStatusResponse = (OutputStatusResponse) o;
    return Objects.equals(this.collectionId, outputStatusResponse.collectionId) &&
        Objects.equals(this.outputId, outputStatusResponse.outputId) &&
        Objects.equals(this.enabled, outputStatusResponse.enabled) &&
        Objects.equals(this.errorCount, outputStatusResponse.errorCount) &&
        Objects.equals(this.forwarded, outputStatusResponse.forwarded) &&
        Objects.equals(this.received, outputStatusResponse.received) &&
        Objects.equals(this.retransmits, outputStatusResponse.retransmits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, outputId, enabled, errorCount, forwarded, received, retransmits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputStatusResponse {\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    forwarded: ").append(toIndentedString(forwarded)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    retransmits: ").append(toIndentedString(retransmits)).append("\n");
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

