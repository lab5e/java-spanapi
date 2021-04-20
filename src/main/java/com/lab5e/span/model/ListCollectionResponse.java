/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.8 adopted-kali
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Collection list. The list contains all the collections you have access to.
 */
@ApiModel(description = "Collection list. The list contains all the collections you have access to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-20T19:10:59.488Z[GMT]")
public class ListCollectionResponse {
  public static final String SERIALIZED_NAME_COLLECTIONS = "collections";
  @SerializedName(SERIALIZED_NAME_COLLECTIONS)
  private List<Collection> collections = null;


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
  @ApiModelProperty(value = "")

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

}

