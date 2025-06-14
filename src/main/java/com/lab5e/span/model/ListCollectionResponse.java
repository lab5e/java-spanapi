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
import com.lab5e.span.model.Collection;
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
 * Collection list. The list contains all the collections you have access to.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-11T21:56:14.173008Z[Etc/UTC]")
public class ListCollectionResponse {
  public static final String SERIALIZED_NAME_COLLECTIONS = "collections";
  @SerializedName(SERIALIZED_NAME_COLLECTIONS)
  private List<Collection> collections = new ArrayList<>();

  public ListCollectionResponse() {
  }

  public ListCollectionResponse collections(List<Collection> collections) {
    
    this.collections = collections;
    return this;
  }

  public ListCollectionResponse addCollectionsItem(Collection collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

   /**
   * Get collections
   * @return collections
  **/
  @javax.annotation.Nullable

  public List<Collection> getCollections() {
    return collections;
  }


  public void setCollections(List<Collection> collections) {
    this.collections = collections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCollectionResponse listCollectionResponse = (ListCollectionResponse) o;
    return Objects.equals(this.collections, listCollectionResponse.collections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCollectionResponse {\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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
    openapiFields.add("collections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListCollectionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListCollectionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListCollectionResponse is not found in the empty JSON string", ListCollectionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListCollectionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListCollectionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("collections") != null && !jsonObj.get("collections").isJsonNull()) {
        JsonArray jsonArraycollections = jsonObj.getAsJsonArray("collections");
        if (jsonArraycollections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("collections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `collections` to be an array in the JSON string but got `%s`", jsonObj.get("collections").toString()));
          }

          // validate the optional field `collections` (array)
          for (int i = 0; i < jsonArraycollections.size(); i++) {
            Collection.validateJsonObject(jsonArraycollections.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListCollectionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListCollectionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListCollectionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListCollectionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListCollectionResponse>() {
           @Override
           public void write(JsonWriter out, ListCollectionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListCollectionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListCollectionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListCollectionResponse
  * @throws IOException if the JSON string is invalid with respect to ListCollectionResponse
  */
  public static ListCollectionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListCollectionResponse.class);
  }

 /**
  * Convert an instance of ListCollectionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

