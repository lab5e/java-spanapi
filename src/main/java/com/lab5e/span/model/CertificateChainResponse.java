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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Response when retrieving a certificate chain
 */
@ApiModel(description = "Response when retrieving a certificate chain")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-02T10:55:33.745521Z[Etc/UTC]")
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

}

