/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.5 contented-jamila
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
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.lab5e.JSON;

/**
 * This is the metadata for a Cellular IoT device connected via an APN.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-11T21:56:14.173008Z[Etc/UTC]")
public class CellularIoTMetadata {
  public static final String SERIALIZED_NAME_GATEWAY_ID = "gatewayId";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ID)
  private String gatewayId;

  public static final String SERIALIZED_NAME_ALLOCATED_IP = "allocatedIp";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_IP)
  private String allocatedIp;

  public static final String SERIALIZED_NAME_ALLOCATED_AT = "allocatedAt";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_AT)
  private String allocatedAt;

  public static final String SERIALIZED_NAME_CELL_ID = "cellId";
  @SerializedName(SERIALIZED_NAME_CELL_ID)
  private String cellId;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private Integer mcc;

  public static final String SERIALIZED_NAME_MNC = "mnc";
  @SerializedName(SERIALIZED_NAME_MNC)
  private Integer mnc;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private String lastUpdate;

  public static final String SERIALIZED_NAME_LAST_IMSI = "lastImsi";
  @SerializedName(SERIALIZED_NAME_LAST_IMSI)
  private String lastImsi;

  public static final String SERIALIZED_NAME_LAST_IMEI = "lastImei";
  @SerializedName(SERIALIZED_NAME_LAST_IMEI)
  private String lastImei;

  public CellularIoTMetadata() {
  }

  public CellularIoTMetadata gatewayId(String gatewayId) {
    
    this.gatewayId = gatewayId;
    return this;
  }

   /**
   * Get gatewayId
   * @return gatewayId
  **/
  @javax.annotation.Nullable

  public String getGatewayId() {
    return gatewayId;
  }


  public void setGatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
  }


  public CellularIoTMetadata allocatedIp(String allocatedIp) {
    
    this.allocatedIp = allocatedIp;
    return this;
  }

   /**
   * Allocated IP address.
   * @return allocatedIp
  **/
  @javax.annotation.Nullable

  public String getAllocatedIp() {
    return allocatedIp;
  }


  public void setAllocatedIp(String allocatedIp) {
    this.allocatedIp = allocatedIp;
  }


  public CellularIoTMetadata allocatedAt(String allocatedAt) {
    
    this.allocatedAt = allocatedAt;
    return this;
  }

   /**
   * Get allocatedAt
   * @return allocatedAt
  **/
  @javax.annotation.Nullable

  public String getAllocatedAt() {
    return allocatedAt;
  }


  public void setAllocatedAt(String allocatedAt) {
    this.allocatedAt = allocatedAt;
  }


  public CellularIoTMetadata cellId(String cellId) {
    
    this.cellId = cellId;
    return this;
  }

   /**
   * Get cellId
   * @return cellId
  **/
  @javax.annotation.Nullable

  public String getCellId() {
    return cellId;
  }


  public void setCellId(String cellId) {
    this.cellId = cellId;
  }


  public CellularIoTMetadata mcc(Integer mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * the provider in use.  The Mobile Country Code for the operator.
   * @return mcc
  **/
  @javax.annotation.Nullable

  public Integer getMcc() {
    return mcc;
  }


  public void setMcc(Integer mcc) {
    this.mcc = mcc;
  }


  public CellularIoTMetadata mnc(Integer mnc) {
    
    this.mnc = mnc;
    return this;
  }

   /**
   * Get mnc
   * @return mnc
  **/
  @javax.annotation.Nullable

  public Integer getMnc() {
    return mnc;
  }


  public void setMnc(Integer mnc) {
    this.mnc = mnc;
  }


  public CellularIoTMetadata country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public CellularIoTMetadata network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public CellularIoTMetadata countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public CellularIoTMetadata lastUpdate(String lastUpdate) {
    
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @javax.annotation.Nullable

  public String getLastUpdate() {
    return lastUpdate;
  }


  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public CellularIoTMetadata lastImsi(String lastImsi) {
    
    this.lastImsi = lastImsi;
    return this;
  }

   /**
   * Get lastImsi
   * @return lastImsi
  **/
  @javax.annotation.Nullable

  public String getLastImsi() {
    return lastImsi;
  }


  public void setLastImsi(String lastImsi) {
    this.lastImsi = lastImsi;
  }


  public CellularIoTMetadata lastImei(String lastImei) {
    
    this.lastImei = lastImei;
    return this;
  }

   /**
   * Get lastImei
   * @return lastImei
  **/
  @javax.annotation.Nullable

  public String getLastImei() {
    return lastImei;
  }


  public void setLastImei(String lastImei) {
    this.lastImei = lastImei;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellularIoTMetadata cellularIoTMetadata = (CellularIoTMetadata) o;
    return Objects.equals(this.gatewayId, cellularIoTMetadata.gatewayId) &&
        Objects.equals(this.allocatedIp, cellularIoTMetadata.allocatedIp) &&
        Objects.equals(this.allocatedAt, cellularIoTMetadata.allocatedAt) &&
        Objects.equals(this.cellId, cellularIoTMetadata.cellId) &&
        Objects.equals(this.mcc, cellularIoTMetadata.mcc) &&
        Objects.equals(this.mnc, cellularIoTMetadata.mnc) &&
        Objects.equals(this.country, cellularIoTMetadata.country) &&
        Objects.equals(this.network, cellularIoTMetadata.network) &&
        Objects.equals(this.countryCode, cellularIoTMetadata.countryCode) &&
        Objects.equals(this.lastUpdate, cellularIoTMetadata.lastUpdate) &&
        Objects.equals(this.lastImsi, cellularIoTMetadata.lastImsi) &&
        Objects.equals(this.lastImei, cellularIoTMetadata.lastImei);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayId, allocatedIp, allocatedAt, cellId, mcc, mnc, country, network, countryCode, lastUpdate, lastImsi, lastImei);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellularIoTMetadata {\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
    sb.append("    allocatedIp: ").append(toIndentedString(allocatedIp)).append("\n");
    sb.append("    allocatedAt: ").append(toIndentedString(allocatedAt)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    mnc: ").append(toIndentedString(mnc)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lastImsi: ").append(toIndentedString(lastImsi)).append("\n");
    sb.append("    lastImei: ").append(toIndentedString(lastImei)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("gatewayId");
    openapiFields.add("allocatedIp");
    openapiFields.add("allocatedAt");
    openapiFields.add("cellId");
    openapiFields.add("mcc");
    openapiFields.add("mnc");
    openapiFields.add("country");
    openapiFields.add("network");
    openapiFields.add("countryCode");
    openapiFields.add("lastUpdate");
    openapiFields.add("lastImsi");
    openapiFields.add("lastImei");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CellularIoTMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CellularIoTMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CellularIoTMetadata is not found in the empty JSON string", CellularIoTMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CellularIoTMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CellularIoTMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("gatewayId") != null && !jsonObj.get("gatewayId").isJsonNull()) && !jsonObj.get("gatewayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gatewayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gatewayId").toString()));
      }
      if ((jsonObj.get("allocatedIp") != null && !jsonObj.get("allocatedIp").isJsonNull()) && !jsonObj.get("allocatedIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allocatedIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allocatedIp").toString()));
      }
      if ((jsonObj.get("allocatedAt") != null && !jsonObj.get("allocatedAt").isJsonNull()) && !jsonObj.get("allocatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `allocatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allocatedAt").toString()));
      }
      if ((jsonObj.get("cellId") != null && !jsonObj.get("cellId").isJsonNull()) && !jsonObj.get("cellId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cellId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cellId").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) && !jsonObj.get("network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("network").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("lastUpdate") != null && !jsonObj.get("lastUpdate").isJsonNull()) && !jsonObj.get("lastUpdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdate").toString()));
      }
      if ((jsonObj.get("lastImsi") != null && !jsonObj.get("lastImsi").isJsonNull()) && !jsonObj.get("lastImsi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastImsi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastImsi").toString()));
      }
      if ((jsonObj.get("lastImei") != null && !jsonObj.get("lastImei").isJsonNull()) && !jsonObj.get("lastImei").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastImei` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastImei").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CellularIoTMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CellularIoTMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CellularIoTMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CellularIoTMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<CellularIoTMetadata>() {
           @Override
           public void write(JsonWriter out, CellularIoTMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CellularIoTMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CellularIoTMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CellularIoTMetadata
  * @throws IOException if the JSON string is invalid with respect to CellularIoTMetadata
  */
  public static CellularIoTMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CellularIoTMetadata.class);
  }

 /**
  * Convert an instance of CellularIoTMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

