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
import com.lab5e.span.model.Collection;
import com.lab5e.span.model.DumpedDevice;
import com.lab5e.span.model.Output;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DumpedCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-20T14:19:14.917Z[GMT]")
public class DumpedCollection {
  public static final String SERIALIZED_NAME_COLLECTION = "collection";
  @SerializedName(SERIALIZED_NAME_COLLECTION)
  private Collection collection;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<DumpedDevice> devices = null;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private List<Output> outputs = null;


  public DumpedCollection collection(Collection collection) {
    
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Collection getCollection() {
    return collection;
  }


  public void setCollection(Collection collection) {
    this.collection = collection;
  }


  public DumpedCollection devices(List<DumpedDevice> devices) {
    
    this.devices = devices;
    return this;
  }

  public DumpedCollection addDevicesItem(DumpedDevice devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DumpedDevice> getDevices() {
    return devices;
  }


  public void setDevices(List<DumpedDevice> devices) {
    this.devices = devices;
  }


  public DumpedCollection outputs(List<Output> outputs) {
    
    this.outputs = outputs;
    return this;
  }

  public DumpedCollection addOutputsItem(Output outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Output> getOutputs() {
    return outputs;
  }


  public void setOutputs(List<Output> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DumpedCollection dumpedCollection = (DumpedCollection) o;
    return Objects.equals(this.collection, dumpedCollection.collection) &&
        Objects.equals(this.devices, dumpedCollection.devices) &&
        Objects.equals(this.outputs, dumpedCollection.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, devices, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DumpedCollection {\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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

