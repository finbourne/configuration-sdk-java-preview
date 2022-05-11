/*
 * FINBOURNE ConfigurationService API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.261
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.configuration.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.configuration.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A single configuration object
 */
@ApiModel(description = "A single configuration object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationItemSummary {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private String valueType;

  public static final String SERIALIZED_NAME_IS_SECRET = "isSecret";
  @SerializedName(SERIALIZED_NAME_IS_SECRET)
  private Boolean isSecret;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public ConfigurationItemSummary key(String key) {
    this.key = key; 
    return this;
  }

   /**
   * The key which identifies the configuration item
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key which identifies the configuration item")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public ConfigurationItemSummary value(String value) {
    this.value = value; 
    return this;
  }

   /**
   * The value of the configuration item
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the configuration item")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public ConfigurationItemSummary valueType(String valueType) {
    this.valueType = valueType; 
    return this;
  }

   /**
   * The type of the configuration item&#39;s value
   * @return valueType
  **/
  @ApiModelProperty(required = true, value = "The type of the configuration item's value")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  public ConfigurationItemSummary isSecret(Boolean isSecret) {
    this.isSecret = isSecret; 
    return this;
  }

   /**
   * Defines whether or not the value is a secret.
   * @return isSecret
  **/
  @ApiModelProperty(required = true, value = "Defines whether or not the value is a secret.")
  public Boolean getIsSecret() {
    return isSecret;
  }

  public void setIsSecret(Boolean isSecret) {
    this.isSecret = isSecret;
  }


   /**
   * The reference to the configuration item
   * @return ref
  **/
  @ApiModelProperty(required = true, value = "The reference to the configuration item")
  public String getRef() {
    return ref;
  }



  public ConfigurationItemSummary links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public ConfigurationItemSummary addLinksItem(Link linksItem) {
   
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationItemSummary {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
