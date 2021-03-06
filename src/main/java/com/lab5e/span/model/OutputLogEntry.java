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
 * Log entries for outputs
 */
@ApiModel(description = "Log entries for outputs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-30T09:27:02.556964Z[Etc/UTC]")
public class OutputLogEntry {
  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private String time;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REPEATED = "repeated";
  @SerializedName(SERIALIZED_NAME_REPEATED)
  private Integer repeated;

  public OutputLogEntry() { 
  }

  public OutputLogEntry time(String time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTime() {
    return time;
  }


  public void setTime(String time) {
    this.time = time;
  }


  public OutputLogEntry message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public OutputLogEntry repeated(Integer repeated) {
    
    this.repeated = repeated;
    return this;
  }

   /**
   * Get repeated
   * @return repeated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRepeated() {
    return repeated;
  }


  public void setRepeated(Integer repeated) {
    this.repeated = repeated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputLogEntry outputLogEntry = (OutputLogEntry) o;
    return Objects.equals(this.time, outputLogEntry.time) &&
        Objects.equals(this.message, outputLogEntry.message) &&
        Objects.equals(this.repeated, outputLogEntry.repeated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, message, repeated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputLogEntry {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    repeated: ").append(toIndentedString(repeated)).append("\n");
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

