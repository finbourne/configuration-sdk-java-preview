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
import com.finbourne.configuration.model.ActionId;
import com.finbourne.configuration.model.IdSelectorDefinition;
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
 * AccessControlledAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessControlledAction {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionId action;

  public static final String SERIALIZED_NAME_LIMITED_SET = "limitedSet";
  @SerializedName(SERIALIZED_NAME_LIMITED_SET)
  private List<IdSelectorDefinition> limitedSet = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links = null;


  public AccessControlledAction description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public AccessControlledAction action(ActionId action) {
    this.action = action; 
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  public ActionId getAction() {
    return action;
  }

  public void setAction(ActionId action) {
    this.action = action;
  }


  public AccessControlledAction limitedSet(List<IdSelectorDefinition> limitedSet) {
    this.limitedSet = limitedSet; 
    return this;
  }

  public AccessControlledAction addLimitedSetItem(IdSelectorDefinition limitedSetItem) {
   
    if (this.limitedSet == null) {
      this.limitedSet = new ArrayList<>();
    }
    this.limitedSet.add(limitedSetItem);
    return this;
  }

   /**
   * Get limitedSet
   * @return limitedSet
  **/
  @ApiModelProperty(value = "")
  public List<IdSelectorDefinition> getLimitedSet() {
    return limitedSet;
  }

  public void setLimitedSet(List<IdSelectorDefinition> limitedSet) {
    this.limitedSet = limitedSet;
  }


  public AccessControlledAction links(List<Link> links) {
    this.links = links; 
    return this;
  }

  public AccessControlledAction addLinksItem(Link linksItem) {
   
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
    sb.append("class AccessControlledAction {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    limitedSet: ").append(toIndentedString(limitedSet)).append("\n");
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
