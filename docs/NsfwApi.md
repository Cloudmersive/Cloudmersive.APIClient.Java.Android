# NsfwApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nsfwClassify**](NsfwApi.md#nsfwClassify) | **POST** /image/nsfw/classify | Not safe for work (NSFW) racy content classification


<a name="nsfwClassify"></a>
# **nsfwClassify**
> NsfwResult nsfwClassify(imageFile)

Not safe for work (NSFW) racy content classification

Classify an image into Not Safe For Work (NSFW)/Porn/Racy content and Safe Content.

### Example
```java
// Import classes:
//import com.cloudmersive.client.NsfwApi;

NsfwApi apiInstance = new NsfwApi();
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    NsfwResult result = apiInstance.nsfwClassify(imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NsfwApi#nsfwClassify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

[**NsfwResult**](NsfwResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

