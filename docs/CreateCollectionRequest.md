

# CreateCollectionRequest

Request object when creating a collection. The collect ID is assigned by the service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**teamId** | **String** | The team ID that owns the collection. This field is required. When you create new collections the default is to use your private team ID. |  [optional] |
|**firmware** | [**CollectionFirmware**](CollectionFirmware.md) |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Tags for the collection. Tags are metadata fields that you can assign to the collection. |  [optional] |



