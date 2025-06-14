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
import com.lab5e.span.model.Output;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * List outputs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-11T21:56:14.173008Z[Etc/UTC]")
public class ListOutputResponse {
  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private List<Output> outputs = new ArrayList<>();

  public ListOutputResponse() {
  }

  public ListOutputResponse collectionId(String collectionId) {
    
    this.collectionId = collectionId;
    return this;
  }

   /**
   * Get collectionId
   * @return collectionId
  **/
  @javax.annotation.Nullable

  public String getCollectionId() {
    return collectionId;
  }


  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }


  public ListOutputResponse outputs(List<Output> outputs) {
    
    this.outputs = outputs;
    return this;
  }

  public ListOutputResponse addOutputsItem(Output outputsItem) {
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
    ListOutputResponse listOutputResponse = (ListOutputResponse) o;
    return Objects.equals(this.collectionId, listOutputResponse.collectionId) &&
        Objects.equals(this.outputs, listOutputResponse.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOutputResponse {\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("collectionId");
    openapiFields.add("outputs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListOutputResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListOutputResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListOutputResponse is not found in the empty JSON string", ListOutputResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListOutputResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListOutputResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("collectionId") != null && !jsonObj.get("collectionId").isJsonNull()) && !jsonObj.get("collectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectionId").toString()));
      }
      if (jsonObj.get("outputs") != null && !jsonObj.get("outputs").isJsonNull()) {
        JsonArray jsonArrayoutputs = jsonObj.getAsJsonArray("outputs");
        if (jsonArrayoutputs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("outputs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `outputs` to be an array in the JSON string but got `%s`", jsonObj.get("outputs").toString()));
          }

          // validate the optional field `outputs` (array)
          for (int i = 0; i < jsonArrayoutputs.size(); i++) {
            Output.validateJsonObject(jsonArrayoutputs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListOutputResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListOutputResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListOutputResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListOutputResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListOutputResponse>() {
           @Override
           public void write(JsonWriter out, ListOutputResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListOutputResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListOutputResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListOutputResponse
  * @throws IOException if the JSON string is invalid with respect to ListOutputResponse
  */
  public static ListOutputResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListOutputResponse.class);
  }

 /**
  * Convert an instance of ListOutputResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

