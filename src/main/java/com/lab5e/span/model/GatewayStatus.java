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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets GatewayStatus
 */
@JsonAdapter(GatewayStatus.Adapter.class)
public enum GatewayStatus {
  
  UNKNOWN("unknown"),
  
  OFFLINE("offline"),
  
  ONLINE("online");

  private String value;

  GatewayStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GatewayStatus fromValue(String value) {
    for (GatewayStatus b : GatewayStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GatewayStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final GatewayStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GatewayStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GatewayStatus.fromValue(value);
    }
  }
}

