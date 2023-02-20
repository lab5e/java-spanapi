/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.4.0 lean-joline
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
import com.lab5e.span.model.MessageUpstream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Response object when listing upstream messages
 */
@ApiModel(description = "Response object when listing upstream messages")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-20T17:19:07.548218Z[Etc/UTC]")
public class ListUpstreamMessagesResponse {
  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<MessageUpstream> messages = null;

  public ListUpstreamMessagesResponse() { 
  }

  public ListUpstreamMessagesResponse messages(List<MessageUpstream> messages) {
    
    this.messages = messages;
    return this;
  }

  public ListUpstreamMessagesResponse addMessagesItem(MessageUpstream messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MessageUpstream> getMessages() {
    return messages;
  }


  public void setMessages(List<MessageUpstream> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUpstreamMessagesResponse listUpstreamMessagesResponse = (ListUpstreamMessagesResponse) o;
    return Objects.equals(this.messages, listUpstreamMessagesResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUpstreamMessagesResponse {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

