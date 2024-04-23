/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.9.5 spattered-kelvin
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
 * Response when retrieving a certificate chain
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T15:06:44.382724Z[Etc/UTC]")
public class CertificateChainResponse {
  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private byte[] chain;

  public CertificateChainResponse() {
  }

  public CertificateChainResponse chain(byte[] chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
  @javax.annotation.Nullable

  public byte[] getChain() {
    return chain;
  }


  public void setChain(byte[] chain) {
    this.chain = chain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateChainResponse certificateChainResponse = (CertificateChainResponse) o;
    return Arrays.equals(this.chain, certificateChainResponse.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(chain));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateChainResponse {\n");
    sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
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
    openapiFields.add("chain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificateChainResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CertificateChainResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateChainResponse is not found in the empty JSON string", CertificateChainResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CertificateChainResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateChainResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateChainResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateChainResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateChainResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateChainResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateChainResponse>() {
           @Override
           public void write(JsonWriter out, CertificateChainResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateChainResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CertificateChainResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificateChainResponse
  * @throws IOException if the JSON string is invalid with respect to CertificateChainResponse
  */
  public static CertificateChainResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateChainResponse.class);
  }

 /**
  * Convert an instance of CertificateChainResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

