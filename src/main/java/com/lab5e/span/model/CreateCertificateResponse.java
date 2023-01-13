/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.3.0 grouchy-aloysius
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response when creating a new certificate
 */
@ApiModel(description = "Response when creating a new certificate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-13T11:18:28.250753Z[Etc/UTC]")
public class CreateCertificateResponse {
  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private byte[] certificate;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "privateKey";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private byte[] privateKey;

  public static final String SERIALIZED_NAME_CHAIN = "chain";
  @SerializedName(SERIALIZED_NAME_CHAIN)
  private byte[] chain;

  public CreateCertificateResponse() { 
  }

  public CreateCertificateResponse certificate(byte[] certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getCertificate() {
    return certificate;
  }


  public void setCertificate(byte[] certificate) {
    this.certificate = certificate;
  }


  public CreateCertificateResponse privateKey(byte[] privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(byte[] privateKey) {
    this.privateKey = privateKey;
  }


  public CreateCertificateResponse chain(byte[] chain) {
    
    this.chain = chain;
    return this;
  }

   /**
   * Get chain
   * @return chain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    CreateCertificateResponse createCertificateResponse = (CreateCertificateResponse) o;
    return Arrays.equals(this.certificate, createCertificateResponse.certificate) &&
        Arrays.equals(this.privateKey, createCertificateResponse.privateKey) &&
        Arrays.equals(this.chain, createCertificateResponse.chain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(certificate), Arrays.hashCode(privateKey), Arrays.hashCode(chain));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCertificateResponse {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

}

