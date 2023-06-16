/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.6.1 squirming-codi
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
 * The firmware management settings for a collection can either be \&quot;disabled\&quot;, ie there is no firmware management for this collection, \&quot;collection\&quot;; devices are managed through the settings on the collection or \&quot;device\&quot; where each device is configured individual.
 */
@JsonAdapter(FirmwareManagement.Adapter.class)
public enum FirmwareManagement {
  
  UNSPECIFIED("unspecified"),
  
  DISABLED("disabled"),
  
  COLLECTION("collection"),
  
  DEVICE("device");

  private String value;

  FirmwareManagement(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FirmwareManagement fromValue(String value) {
    for (FirmwareManagement b : FirmwareManagement.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FirmwareManagement> {
    @Override
    public void write(final JsonWriter jsonWriter, final FirmwareManagement enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FirmwareManagement read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FirmwareManagement.fromValue(value);
    }
  }
}

