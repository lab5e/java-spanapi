/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.0 convulsive-launa
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
 * Certificate information
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T11:34:08.487808Z[Etc/UTC]")
public class CertificateInfo {
  public static final String SERIALIZED_NAME_CERTIFICATE_SERIAL = "certificateSerial";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_SERIAL)
  private String certificateSerial;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private String expires;

  public CertificateInfo() {
  }

  public CertificateInfo certificateSerial(String certificateSerial) {
    
    this.certificateSerial = certificateSerial;
    return this;
  }

   /**
   * Get certificateSerial
   * @return certificateSerial
  **/
  @javax.annotation.Nullable

  public String getCertificateSerial() {
    return certificateSerial;
  }


  public void setCertificateSerial(String certificateSerial) {
    this.certificateSerial = certificateSerial;
  }


  public CertificateInfo expires(String expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nullable

  public String getExpires() {
    return expires;
  }


  public void setExpires(String expires) {
    this.expires = expires;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateInfo certificateInfo = (CertificateInfo) o;
    return Objects.equals(this.certificateSerial, certificateInfo.certificateSerial) &&
        Objects.equals(this.expires, certificateInfo.expires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateSerial, expires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateInfo {\n");
    sb.append("    certificateSerial: ").append(toIndentedString(certificateSerial)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
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
    openapiFields.add("certificateSerial");
    openapiFields.add("expires");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificateInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CertificateInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateInfo is not found in the empty JSON string", CertificateInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CertificateInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("certificateSerial") != null && !jsonObj.get("certificateSerial").isJsonNull()) && !jsonObj.get("certificateSerial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificateSerial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificateSerial").toString()));
      }
      if ((jsonObj.get("expires") != null && !jsonObj.get("expires").isJsonNull()) && !jsonObj.get("expires").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateInfo>() {
           @Override
           public void write(JsonWriter out, CertificateInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CertificateInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificateInfo
  * @throws IOException if the JSON string is invalid with respect to CertificateInfo
  */
  public static CertificateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateInfo.class);
  }

 /**
  * Convert an instance of CertificateInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

