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
import com.lab5e.span.model.MessageState;
import com.lab5e.span.model.MessageTransport;
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
 * Downstream messages are sent from the backend to the devices.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-11T21:56:14.173008Z[Etc/UTC]")
public class MessageDownstream {
  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_GATEWAY_ID = "gatewayId";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ID)
  private String gatewayId;

  public static final String SERIALIZED_NAME_CREATED_TIME = "createdTime";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private String createdTime;

  public static final String SERIALIZED_NAME_SENT_TIME = "sentTime";
  @SerializedName(SERIALIZED_NAME_SENT_TIME)
  private String sentTime;

  public static final String SERIALIZED_NAME_TRANSPORT = "transport";
  @SerializedName(SERIALIZED_NAME_TRANSPORT)
  private MessageTransport transport = MessageTransport.UNSPECIFIED;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private MessageState state = MessageState.UNSPECIFIED;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private byte[] payload;

  public MessageDownstream() {
  }

  public MessageDownstream messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public MessageDownstream collectionId(String collectionId) {
    
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


  public MessageDownstream deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @javax.annotation.Nullable

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public MessageDownstream gatewayId(String gatewayId) {
    
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


  public MessageDownstream createdTime(String createdTime) {
    
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @javax.annotation.Nullable

  public String getCreatedTime() {
    return createdTime;
  }


  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }


  public MessageDownstream sentTime(String sentTime) {
    
    this.sentTime = sentTime;
    return this;
  }

   /**
   * Get sentTime
   * @return sentTime
  **/
  @javax.annotation.Nullable

  public String getSentTime() {
    return sentTime;
  }


  public void setSentTime(String sentTime) {
    this.sentTime = sentTime;
  }


  public MessageDownstream transport(MessageTransport transport) {
    
    this.transport = transport;
    return this;
  }

   /**
   * Get transport
   * @return transport
  **/
  @javax.annotation.Nullable

  public MessageTransport getTransport() {
    return transport;
  }


  public void setTransport(MessageTransport transport) {
    this.transport = transport;
  }


  public MessageDownstream state(MessageState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable

  public MessageState getState() {
    return state;
  }


  public void setState(MessageState state) {
    this.state = state;
  }


  public MessageDownstream payload(byte[] payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable

  public byte[] getPayload() {
    return payload;
  }


  public void setPayload(byte[] payload) {
    this.payload = payload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDownstream messageDownstream = (MessageDownstream) o;
    return Objects.equals(this.messageId, messageDownstream.messageId) &&
        Objects.equals(this.collectionId, messageDownstream.collectionId) &&
        Objects.equals(this.deviceId, messageDownstream.deviceId) &&
        Objects.equals(this.gatewayId, messageDownstream.gatewayId) &&
        Objects.equals(this.createdTime, messageDownstream.createdTime) &&
        Objects.equals(this.sentTime, messageDownstream.sentTime) &&
        Objects.equals(this.transport, messageDownstream.transport) &&
        Objects.equals(this.state, messageDownstream.state) &&
        Arrays.equals(this.payload, messageDownstream.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, collectionId, deviceId, gatewayId, createdTime, sentTime, transport, state, Arrays.hashCode(payload));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDownstream {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    sentTime: ").append(toIndentedString(sentTime)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
    openapiFields.add("messageId");
    openapiFields.add("collectionId");
    openapiFields.add("deviceId");
    openapiFields.add("gatewayId");
    openapiFields.add("createdTime");
    openapiFields.add("sentTime");
    openapiFields.add("transport");
    openapiFields.add("state");
    openapiFields.add("payload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageDownstream
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MessageDownstream.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageDownstream is not found in the empty JSON string", MessageDownstream.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MessageDownstream.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageDownstream` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("messageId") != null && !jsonObj.get("messageId").isJsonNull()) && !jsonObj.get("messageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageId").toString()));
      }
      if ((jsonObj.get("collectionId") != null && !jsonObj.get("collectionId").isJsonNull()) && !jsonObj.get("collectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `collectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("collectionId").toString()));
      }
      if ((jsonObj.get("deviceId") != null && !jsonObj.get("deviceId").isJsonNull()) && !jsonObj.get("deviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceId").toString()));
      }
      if ((jsonObj.get("gatewayId") != null && !jsonObj.get("gatewayId").isJsonNull()) && !jsonObj.get("gatewayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gatewayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gatewayId").toString()));
      }
      if ((jsonObj.get("createdTime") != null && !jsonObj.get("createdTime").isJsonNull()) && !jsonObj.get("createdTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdTime").toString()));
      }
      if ((jsonObj.get("sentTime") != null && !jsonObj.get("sentTime").isJsonNull()) && !jsonObj.get("sentTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sentTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sentTime").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageDownstream.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageDownstream' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageDownstream> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageDownstream.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageDownstream>() {
           @Override
           public void write(JsonWriter out, MessageDownstream value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageDownstream read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageDownstream given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageDownstream
  * @throws IOException if the JSON string is invalid with respect to MessageDownstream
  */
  public static MessageDownstream fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageDownstream.class);
  }

 /**
  * Convert an instance of MessageDownstream to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

