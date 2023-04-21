/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.5.0 overwrought-dorla
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
import com.lab5e.span.model.CollectionFirmware;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * This is a collection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-21T19:33:58.273594Z[Etc/UTC]")
public class Collection {
  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_TEAM_ID = "teamId";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private String teamId;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private CollectionFirmware firmware;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public static final String SERIALIZED_NAME_UPSTREAM_TIMESTAMPS = "upstreamTimestamps";
  @SerializedName(SERIALIZED_NAME_UPSTREAM_TIMESTAMPS)
  private List<String> upstreamTimestamps = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOWNSTREAM_TIMESTAMPS = "downstreamTimestamps";
  @SerializedName(SERIALIZED_NAME_DOWNSTREAM_TIMESTAMPS)
  private List<String> downstreamTimestamps = new ArrayList<>();

  public Collection() {
  }

  public Collection collectionId(String collectionId) {
    
    this.collectionId = collectionId;
    return this;
  }

   /**
   * The ID of the collection. This is assigned by the backend.
   * @return collectionId
  **/
  @javax.annotation.Nullable

  public String getCollectionId() {
    return collectionId;
  }


  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }


  public Collection teamId(String teamId) {
    
    this.teamId = teamId;
    return this;
  }

   /**
   * The team ID that owns the collection. This field is required. When you create new collections the default is to use your private team ID.
   * @return teamId
  **/
  @javax.annotation.Nullable

  public String getTeamId() {
    return teamId;
  }


  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  public Collection firmware(CollectionFirmware firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nullable

  public CollectionFirmware getFirmware() {
    return firmware;
  }


  public void setFirmware(CollectionFirmware firmware) {
    this.firmware = firmware;
  }


  public Collection tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Collection putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Tags for the collection. Tags are metadata fields that you can assign to the collection.
   * @return tags
  **/
  @javax.annotation.Nullable

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public Collection upstreamTimestamps(List<String> upstreamTimestamps) {
    
    this.upstreamTimestamps = upstreamTimestamps;
    return this;
  }

  public Collection addUpstreamTimestampsItem(String upstreamTimestampsItem) {
    if (this.upstreamTimestamps == null) {
      this.upstreamTimestamps = new ArrayList<>();
    }
    this.upstreamTimestamps.add(upstreamTimestampsItem);
    return this;
  }

   /**
   * Get upstreamTimestamps
   * @return upstreamTimestamps
  **/
  @javax.annotation.Nullable

  public List<String> getUpstreamTimestamps() {
    return upstreamTimestamps;
  }


  public void setUpstreamTimestamps(List<String> upstreamTimestamps) {
    this.upstreamTimestamps = upstreamTimestamps;
  }


  public Collection downstreamTimestamps(List<String> downstreamTimestamps) {
    
    this.downstreamTimestamps = downstreamTimestamps;
    return this;
  }

  public Collection addDownstreamTimestampsItem(String downstreamTimestampsItem) {
    if (this.downstreamTimestamps == null) {
      this.downstreamTimestamps = new ArrayList<>();
    }
    this.downstreamTimestamps.add(downstreamTimestampsItem);
    return this;
  }

   /**
   * Get downstreamTimestamps
   * @return downstreamTimestamps
  **/
  @javax.annotation.Nullable

  public List<String> getDownstreamTimestamps() {
    return downstreamTimestamps;
  }


  public void setDownstreamTimestamps(List<String> downstreamTimestamps) {
    this.downstreamTimestamps = downstreamTimestamps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Collection collection = (Collection) o;
    return Objects.equals(this.collectionId, collection.collectionId) &&
        Objects.equals(this.teamId, collection.teamId) &&
        Objects.equals(this.firmware, collection.firmware) &&
        Objects.equals(this.tags, collection.tags) &&
        Objects.equals(this.upstreamTimestamps, collection.upstreamTimestamps) &&
        Objects.equals(this.downstreamTimestamps, collection.downstreamTimestamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionId, teamId, firmware, tags, upstreamTimestamps, downstreamTimestamps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Collection {\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    upstreamTimestamps: ").append(toIndentedString(upstreamTimestamps)).append("\n");
    sb.append("    downstreamTimestamps: ").append(toIndentedString(downstreamTimestamps)).append("\n");
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
    openapiFields.add("teamId");
    openapiFields.add("firmware");
    openapiFields.add("tags");
    openapiFields.add("upstreamTimestamps");
    openapiFields.add("downstreamTimestamps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Collection
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Collection.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Collection is not found in the empty JSON string", Collection.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Collection.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Collection` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("collectionId") != null && !jsonObj.get("collectionId").isJsonNull()) && !jsonObj.get("collectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectionId").toString()));
      }
      if ((jsonObj.get("teamId") != null && !jsonObj.get("teamId").isJsonNull()) && !jsonObj.get("teamId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `teamId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("teamId").toString()));
      }
      // validate the optional field `firmware`
      if (jsonObj.get("firmware") != null && !jsonObj.get("firmware").isJsonNull()) {
        CollectionFirmware.validateJsonObject(jsonObj.getAsJsonObject("firmware"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("upstreamTimestamps") != null && !jsonObj.get("upstreamTimestamps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `upstreamTimestamps` to be an array in the JSON string but got `%s`", jsonObj.get("upstreamTimestamps").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("downstreamTimestamps") != null && !jsonObj.get("downstreamTimestamps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `downstreamTimestamps` to be an array in the JSON string but got `%s`", jsonObj.get("downstreamTimestamps").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Collection.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Collection' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Collection> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Collection.class));

       return (TypeAdapter<T>) new TypeAdapter<Collection>() {
           @Override
           public void write(JsonWriter out, Collection value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Collection read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Collection given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Collection
  * @throws IOException if the JSON string is invalid with respect to Collection
  */
  public static Collection fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Collection.class);
  }

 /**
  * Convert an instance of Collection to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

