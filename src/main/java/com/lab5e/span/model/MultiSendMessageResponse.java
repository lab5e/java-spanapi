/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.7 only-deshaun
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
import com.lab5e.span.model.MessageSendResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Broadcast message result. The errors array contains the list of errors ocurred when sending a message.
 */
@ApiModel(description = "Broadcast message result. The errors array contains the list of errors ocurred when sending a message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-20T14:19:14.917Z[GMT]")
public class MultiSendMessageResponse {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<MessageSendResult> errors = null;

  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  private Integer sent;

  public static final String SERIALIZED_NAME_FAILED = "failed";
  @SerializedName(SERIALIZED_NAME_FAILED)
  private Integer failed;


  public MultiSendMessageResponse errors(List<MessageSendResult> errors) {
    
    this.errors = errors;
    return this;
  }

  public MultiSendMessageResponse addErrorsItem(MessageSendResult errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MessageSendResult> getErrors() {
    return errors;
  }


  public void setErrors(List<MessageSendResult> errors) {
    this.errors = errors;
  }


  public MultiSendMessageResponse sent(Integer sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * Get sent
   * @return sent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSent() {
    return sent;
  }


  public void setSent(Integer sent) {
    this.sent = sent;
  }


  public MultiSendMessageResponse failed(Integer failed) {
    
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFailed() {
    return failed;
  }


  public void setFailed(Integer failed) {
    this.failed = failed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiSendMessageResponse multiSendMessageResponse = (MultiSendMessageResponse) o;
    return Objects.equals(this.errors, multiSendMessageResponse.errors) &&
        Objects.equals(this.sent, multiSendMessageResponse.sent) &&
        Objects.equals(this.failed, multiSendMessageResponse.failed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, sent, failed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiSendMessageResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
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

