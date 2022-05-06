/*
 * FINBOURNE ConfigurationService API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.251
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.configuration.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.configuration.model.ConfigurationItemSummary;
import com.finbourne.configuration.model.Link;
import com.finbourne.configuration.model.ResourceId;
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
 * The full version of the configuration set
 */
@ApiModel(description = "The full version of the configuration set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationSet {
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

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ConfigurationItemSummary> items = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public ConfigurationSet createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt; 
    return this;
  }

   /**
   * The date referring to the creation date of the configuration set
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The date referring to the creation date of the configuration set")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ConfigurationSet createdBy(String createdBy) {
    this.createdBy = createdBy; 
    return this;
  }

   /**
   * Who created the configuration set
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "Who created the configuration set")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public ConfigurationSet lastModifiedAt(OffsetDateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt; 
    return this;
  }

   /**
   * The date referring to the date when the configuration set was last modified
   * @return lastModifiedAt
  **/
  @ApiModelProperty(required = true, value = "The date referring to the date when the configuration set was last modified")
  public OffsetDateTime getLastModifiedAt() {
    return lastModifiedAt;
  }

  public void setLastModifiedAt(OffsetDateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }


  public ConfigurationSet lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy; 
    return this;
  }

   /**
   * Who modified the configuration set most recently
   * @return lastModifiedBy
  **/
  @ApiModelProperty(required = true, value = "Who modified the configuration set most recently")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public ConfigurationSet description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Describes the configuration set
   * @return description
  **/
  @ApiModelProperty(value = "Describes the configuration set")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ConfigurationSet items(List<ConfigurationItemSummary> items) {
    this.items = items; 
    return this;
  }

  public ConfigurationSet addItemsItem(ConfigurationItemSummary itemsItem) {
   
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The collection of the configuration items that this set contains.
   * @return items
  **/
  @ApiModelProperty(value = "The collection of the configuration items that this set contains.")
  public List<ConfigurationItemSummary> getItems() {
    return items;
  }

  public void setItems(List<ConfigurationItemSummary> items) {
    this.items = items;
  }


  public ConfigurationSet id(ResourceId id) {
    this.id = id; 
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getId() {
    return id;
  }

  public void setId(ResourceId id) {
    this.id = id;
  }


  public ConfigurationSet type(String type) {
    this.type = type; 
    return this;
  }

   /**
   * The type (personal or shared) of the configuration set
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type (personal or shared) of the configuration set")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public ConfigurationSet links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public ConfigurationSet addLinksItem(Link linksItem) {
   
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
    sb.append("class ConfigurationSet {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
