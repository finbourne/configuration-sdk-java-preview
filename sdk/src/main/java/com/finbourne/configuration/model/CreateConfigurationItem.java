/*
 * FINBOURNE ConfigurationService API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.253
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.configuration.model;

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
 * The information required to create a configuration item
 */
@ApiModel(description = "The information required to create a configuration item")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateConfigurationItem {
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

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public CreateConfigurationItem key(String key) {
    this.key = key; 
    return this;
  }

   /**
   * The key of the new configuration item
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key of the new configuration item")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }


  public CreateConfigurationItem value(String value) {
    this.value = value; 
    return this;
  }

   /**
   * The value of the new configuration item                The maximum size for secrets is 4KB and for text values is 2MB
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the new configuration item                The maximum size for secrets is 4KB and for text values is 2MB")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public CreateConfigurationItem valueType(String valueType) {
    this.valueType = valueType; 
    return this;
  }

   /**
   * The type (text, number, boolean, textCollection, numberCollection) of the new configuration item&#39;s value.  The validation for each type is as follows:  - text: any value  - number: double (e.g. \&quot;5.5\&quot;)  - boolean: true/false  - textCollection: comma separated list (e.g. \&quot;a,b,c\&quot;)  - numberCollection: comma separated list of doubles (e.g. \&quot;1,2,3\&quot;)
   * @return valueType
  **/
  @ApiModelProperty(value = "The type (text, number, boolean, textCollection, numberCollection) of the new configuration item's value.  The validation for each type is as follows:  - text: any value  - number: double (e.g. \"5.5\")  - boolean: true/false  - textCollection: comma separated list (e.g. \"a,b,c\")  - numberCollection: comma separated list of doubles (e.g. \"1,2,3\")")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  public CreateConfigurationItem isSecret(Boolean isSecret) {
    this.isSecret = isSecret; 
    return this;
  }

   /**
   * Defines whether or not the value is a secret
   * @return isSecret
  **/
  @ApiModelProperty(required = true, value = "Defines whether or not the value is a secret")
  public Boolean getIsSecret() {
    return isSecret;
  }

  public void setIsSecret(Boolean isSecret) {
    this.isSecret = isSecret;
  }


  public CreateConfigurationItem description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The description of the new configuration item
   * @return description
  **/
  @ApiModelProperty(value = "The description of the new configuration item")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
    sb.append("class CreateConfigurationItem {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
