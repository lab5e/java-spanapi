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
 * Gets or Sets GatewayType
 */
@JsonAdapter(GatewayType.Adapter.class)
public enum GatewayType {
  
  UNKNOWN("unknown"),
  
  CIOT("ciot"),
  
  INET("inet"),
  
  LORA("lora"),
  
  OPENTHREAD("openthread"),
  
  ZIGBEE("zigbee"),
  
  MATTER("matter"),
  
  CUSTOM("custom");

  private String value;

  GatewayType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GatewayType fromValue(String value) {
    for (GatewayType b : GatewayType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GatewayType> {
    @Override
    public void write(final JsonWriter jsonWriter, final GatewayType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GatewayType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GatewayType.fromValue(value);
    }
  }
}

