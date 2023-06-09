/*
 * FINBOURNE ConfigurationService API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.433
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The full version of the configuration item
 */
@ApiModel(description = "The full version of the configuration item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationItem {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_AT = "lastModifiedAt";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_AT)
  private OffsetDateTime lastModifiedAt;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

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


  public ConfigurationItem createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt; 
    return this;
  }

   /**
   * The date referring to the creation date of the configuration item
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The date referring to the creation date of the configuration item")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ConfigurationItem createdBy(String createdBy) {
    this.createdBy = createdBy; 
    return this;
  }

   /**
   * Who created the configuration item
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "Who created the configuration item")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public ConfigurationItem lastModifiedAt(OffsetDateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt; 
    return this;
  }

   /**
   * The date referring to the date when the configuration item was last modified
   * @return lastModifiedAt
  **/
  @ApiModelProperty(required = true, value = "The date referring to the date when the configuration item was last modified")
  public OffsetDateTime getLastModifiedAt() {
    return lastModifiedAt;
  }

  public void setLastModifiedAt(OffsetDateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }


  public ConfigurationItem lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy; 
    return this;
  }

   /**
   * Who modified the configuration item most recently
   * @return lastModifiedBy
  **/
  @ApiModelProperty(required = true, value = "Who modified the configuration item most recently")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public ConfigurationItem description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Describes the configuration item
   * @return description
  **/
  @ApiModelProperty(value = "Describes the configuration item")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ConfigurationItem key(String key) {
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


  public ConfigurationItem value(String value) {
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


  public ConfigurationItem valueType(String valueType) {
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


  public ConfigurationItem isSecret(Boolean isSecret) {
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



  public ConfigurationItem links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public ConfigurationItem addLinksItem(Link linksItem) {
   
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
    sb.append("class ConfigurationItem {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
