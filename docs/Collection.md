

# Collection

This is a collection

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collectionId** | **String** | The ID of the collection. This is assigned by the backend. |  [optional] |
|**teamId** | **String** | The team ID that owns the collection. This field is required. When you create new collections the default is to use your private team ID. |  [optional] |
|**firmware** | [**CollectionFirmware**](CollectionFirmware.md) |  |  [optional] |
|**tags** | **Map&lt;String, String&gt;** | Tags for the collection. Tags are metadata fields that you can assign to the collection. |  [optional] |
|**upstreamTimestamps** | **List&lt;String&gt;** |  |  [optional] |
|**downstreamTimestamps** | **List&lt;String&gt;** |  |  [optional] |
|**enabled** | **Boolean** | Disabled flag for collection. If the collection is disabled it is in effect read only and inactive. You can&#39;t update a disabled collection. |  [optional] |



