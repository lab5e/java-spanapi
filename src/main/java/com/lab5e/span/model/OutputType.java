/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.12 infinite-dana
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
 * Gets or Sets OutputType
 */
@JsonAdapter(OutputType.Adapter.class)
public enum OutputType {
  
  UNDEFINED("undefined"),
  
  WEBHOOK("webhook"),
  
  UDP("udp"),
  
  MQTT("mqtt"),
  
  IFTTT("ifttt");

  private String value;

  OutputType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OutputType fromValue(String value) {
    for (OutputType b : OutputType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OutputType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OutputType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OutputType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OutputType.fromValue(value);
    }
  }
}

