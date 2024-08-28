/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 5.0.1 humorous-jaron
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
import java.util.HashMap;
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
 * Create a new firmware image
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-28T14:16:04.138325Z[Etc/UTC]")
public class CreateFirmwareBody {
  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private byte[] image;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = new HashMap<>();

  public CreateFirmwareBody() {
  }

  public CreateFirmwareBody image(byte[] image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable

  public byte[] getImage() {
    return image;
  }


  public void setImage(byte[] image) {
    this.image = image;
  }


  public CreateFirmwareBody version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public CreateFirmwareBody filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @javax.annotation.Nullable

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public CreateFirmwareBody tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public CreateFirmwareBody putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFirmwareBody createFirmwareBody = (CreateFirmwareBody) o;
    return Arrays.equals(this.image, createFirmwareBody.image) &&
        Objects.equals(this.version, createFirmwareBody.version) &&
        Objects.equals(this.filename, createFirmwareBody.filename) &&
        Objects.equals(this.tags, createFirmwareBody.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(image), version, filename, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFirmwareBody {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("image");
    openapiFields.add("version");
    openapiFields.add("filename");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateFirmwareBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateFirmwareBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateFirmwareBody is not found in the empty JSON string", CreateFirmwareBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateFirmwareBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateFirmwareBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateFirmwareBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateFirmwareBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateFirmwareBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateFirmwareBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateFirmwareBody>() {
           @Override
           public void write(JsonWriter out, CreateFirmwareBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateFirmwareBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateFirmwareBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateFirmwareBody
  * @throws IOException if the JSON string is invalid with respect to CreateFirmwareBody
  */
  public static CreateFirmwareBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateFirmwareBody.class);
  }

 /**
  * Convert an instance of CreateFirmwareBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

