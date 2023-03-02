/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.4.2 nonviolent-adelbert
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Request object when updating a collection
 */
@ApiModel(description = "Request object when updating a collection")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T10:55:33.745521Z[Etc/UTC]")
public class UpdateCollectionRequest {
  public static final String SERIALIZED_NAME_TEAM_ID = "teamId";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private String teamId;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private CollectionFirmware firmware;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public UpdateCollectionRequest() { 
  }

  public UpdateCollectionRequest teamId(String teamId) {
    
    this.teamId = teamId;
    return this;
  }

   /**
   * The team ID that owns the collection. This field is required. When you create new collections the default is to use your private team ID.
   * @return teamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The team ID that owns the collection. This field is required. When you create new collections the default is to use your private team ID.")

  public String getTeamId() {
    return teamId;
  }


  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  public UpdateCollectionRequest firmware(CollectionFirmware firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CollectionFirmware getFirmware() {
    return firmware;
  }


  public void setFirmware(CollectionFirmware firmware) {
    this.firmware = firmware;
  }


  public UpdateCollectionRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateCollectionRequest putTagsItem(String key, String tagsItem) {
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
  @ApiModelProperty(value = "Tags for the collection. Tags are metadata fields that you can assign to the collection.")

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
    UpdateCollectionRequest updateCollectionRequest = (UpdateCollectionRequest) o;
    return Objects.equals(this.teamId, updateCollectionRequest.teamId) &&
        Objects.equals(this.firmware, updateCollectionRequest.firmware) &&
        Objects.equals(this.tags, updateCollectionRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, firmware, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCollectionRequest {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
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

}

