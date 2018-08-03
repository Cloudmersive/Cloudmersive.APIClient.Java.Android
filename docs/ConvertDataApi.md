# ConvertDataApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertDataCsvToJson**](ConvertDataApi.md#convertDataCsvToJson) | **POST** /convert/csv/to/json | CSV to JSON conversion
[**convertDataXmlToJson**](ConvertDataApi.md#convertDataXmlToJson) | **POST** /convert/xml/to/json | XML to JSON conversion


<a name="convertDataCsvToJson"></a>
# **convertDataCsvToJson**
> Object convertDataCsvToJson(inputFile)

CSV to JSON conversion

Convert a CSV file to a JSON object array

### Example
```java
// Import classes:
//import com.cloudmersive.client.ConvertDataApi;

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataCsvToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataCsvToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="convertDataXmlToJson"></a>
# **convertDataXmlToJson**
> Object convertDataXmlToJson(inputFile)

XML to JSON conversion

Convert an XML string or file into JSON

### Example
```java
// Import classes:
//import com.cloudmersive.client.ConvertDataApi;

ConvertDataApi apiInstance = new ConvertDataApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    Object result = apiInstance.convertDataXmlToJson(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConvertDataApi#convertDataXmlToJson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**Object**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

