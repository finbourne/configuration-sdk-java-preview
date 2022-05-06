

# ConfigurationItem

The full version of the configuration item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | **OffsetDateTime** | The date referring to the creation date of the configuration item | 
**createdBy** | **String** | Who created the configuration item | 
**lastModifiedAt** | **OffsetDateTime** | The date referring to the date when the configuration item was last modified | 
**lastModifiedBy** | **String** | Who modified the configuration item most recently | 
**description** | **String** | Describes the configuration item |  [optional]
**key** | **String** | The key which identifies the configuration item | 
**value** | **String** | The value of the configuration item | 
**valueType** | **String** | The type of the configuration item&#39;s value | 
**isSecret** | **Boolean** | Defines whether or not the value is a secret. | 
**ref** | **String** | The reference to the configuration item |  [readonly]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



