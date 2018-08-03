# ConvertWebApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertWebHtmlToPdf**](ConvertWebApi.md#convertWebHtmlToPdf) | **POST** /convert/web/html/to/pdf | Convert HTML string to PDF
[**convertWebMdToHtml**](ConvertWebApi.md#convertWebMdToHtml) | **POST** /convert/web/md/to/html | Convert Markdown to HTML
[**convertWebUrlToPdf**](ConvertWebApi.md#convertWebUrlToPdf) | **POST** /convert/web/url/to/pdf | Convert a URL to PDF
[**convertWebUrlToScreenshot**](ConvertWebApi.md#convertWebUrlToScreenshot) | **POST** /convert/web/url/to/screenshot | Take screenshot of URL


<a name="convertWebHtmlToPdf"></a>
# **convertWebHtmlToPdf**
> Object convertWebHtmlToPdf(input)

Convert HTML string to PDF

Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.ConvertWebApi;

ConvertWebApi apiInstance = new ConvertWebApi();
HtmlToPdfRequest input = new HtmlToPdfRequest(); // HtmlToPdfRequest | HTML to PDF request parameters
try {
    Object result = apiInstance.convertWebHtmlToPdf(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebHtmlToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**HtmlToPdfRequest**](HtmlToPdfRequest.md)| HTML to PDF request parameters |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertWebMdToHtml"></a>
# **convertWebMdToHtml**
> HtmlMdResult convertWebMdToHtml(inputFile)

Convert Markdown to HTML

Convert a markdown file (.md) to HTML

### Example
```java
// Import classes:
//import com.cloudmersive.client.ConvertWebApi;

ConvertWebApi apiInstance = new ConvertWebApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    HtmlMdResult result = apiInstance.convertWebMdToHtml(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebMdToHtml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**HtmlMdResult**](HtmlMdResult.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="convertWebUrlToPdf"></a>
# **convertWebUrlToPdf**
> byte[] convertWebUrlToPdf(input)

Convert a URL to PDF

Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.ConvertWebApi;

ConvertWebApi apiInstance = new ConvertWebApi();
ScreenshotRequest input = new ScreenshotRequest(); // ScreenshotRequest | URL to PDF request parameters
try {
    byte[] result = apiInstance.convertWebUrlToPdf(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebUrlToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ScreenshotRequest**](ScreenshotRequest.md)| URL to PDF request parameters |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertWebUrlToScreenshot"></a>
# **convertWebUrlToScreenshot**
> byte[] convertWebUrlToScreenshot(input)

Take screenshot of URL

Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.

### Example
```java
// Import classes:
//import com.cloudmersive.client.ConvertWebApi;

ConvertWebApi apiInstance = new ConvertWebApi();
ScreenshotRequest input = new ScreenshotRequest(); // ScreenshotRequest | Screenshot request parameters
try {
    byte[] result = apiInstance.convertWebUrlToScreenshot(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertWebApi#convertWebUrlToScreenshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**ScreenshotRequest**](ScreenshotRequest.md)| Screenshot request parameters |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

