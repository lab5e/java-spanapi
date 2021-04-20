

# Firmware

Firmware images aren't served back out through the API, only the metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**imageId** | **String** |  |  [optional]
**version** | **String** | Make sure that the firmware image reports this version. If the version reported by this image is different the FOTA process won&#39;t be reported as successful since the device will report a version different from this. |  [optional]
**filename** | **String** | This is just for internal house keeping, making it potentially easier to identify the firmware image. |  [optional]
**sha256** | **String** | To ensure each image is unique the SHA-256 hash for all images in a collection must be unqique |  [optional]
**length** | **Integer** |  |  [optional]
**collectionId** | **String** | Collection ID for the collection owning the firmware image. |  [optional]
**created** | **String** |  |  [optional]
**tags** | **Map&lt;String, String&gt;** | Tags for firmware image. |  [optional]



