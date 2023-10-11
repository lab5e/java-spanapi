/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.7.0 actionable-aryanna
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OutputMessageType
 */
@JsonAdapter(OutputMessageType.Adapter.class)
public enum OutputMessageType {
  
  UNKNOWN("unknown"),
  
  KEEPALIVE("keepalive"),
  
  DATA("data");

  private String value;

  OutputMessageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OutputMessageType fromValue(String value) {
    for (OutputMessageType b : OutputMessageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OutputMessageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OutputMessageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OutputMessageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OutputMessageType.fromValue(value);
    }
  }
}

