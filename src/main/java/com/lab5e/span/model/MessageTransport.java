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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The message transport can be UDP or CoAP.
 */
@JsonAdapter(MessageTransport.Adapter.class)
public enum MessageTransport {
  
  UNSPECIFIED("unspecified"),
  
  UDP("udp"),
  
  COAP("coap"),
  
  MQTT("mqtt"),
  
  GATEWAY("gateway"),
  
  COAPS("coaps"),
  
  DTLS("dtls");

  private String value;

  MessageTransport(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MessageTransport fromValue(String value) {
    for (MessageTransport b : MessageTransport.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MessageTransport> {
    @Override
    public void write(final JsonWriter jsonWriter, final MessageTransport enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MessageTransport read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MessageTransport.fromValue(value);
    }
  }
}

