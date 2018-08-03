# ArtisticApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**artisticPainting**](ArtisticApi.md#artisticPainting) | **POST** /image/artistic/painting/{style} | Transform an image into an artistic painting automatically


<a name="artisticPainting"></a>
# **artisticPainting**
> Object artisticPainting(style, imageFile)

Transform an image into an artistic painting automatically

Uses machine learning to automatically transform an image into an artistic painting.  Due to depth of AI processing, depending on image size this operation can take up to 20 seconds.

### Example
```java
// Import classes:
//import com.cloudmersive.client.ArtisticApi;

ArtisticApi apiInstance = new ArtisticApi();
String style = "style_example"; // String | The style of the painting to apply.  To start, try \"udnie\" a modernist\" painting style.  Possible values are: \"udnie\", \"wave\", \"la_muse\", \"rain_princess\".
File imageFile = new File("/path/to/file.txt"); // File | Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
try {
    Object result = apiInstance.artisticPainting(style, imageFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArtisticApi#artisticPainting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **style** | **String**| The style of the painting to apply.  To start, try \&quot;udnie\&quot; a modernist\&quot; painting style.  Possible values are: \&quot;udnie\&quot;, \&quot;wave\&quot;, \&quot;la_muse\&quot;, \&quot;rain_princess\&quot;. |
 **imageFile** | **File**| Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

