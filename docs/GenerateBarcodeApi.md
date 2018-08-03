# GenerateBarcodeApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateBarcodeEAN13**](GenerateBarcodeApi.md#generateBarcodeEAN13) | **POST** /barcode/generate/ean-13 | Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
[**generateBarcodeEAN8**](GenerateBarcodeApi.md#generateBarcodeEAN8) | **POST** /barcode/generate/ean-8 | Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
[**generateBarcodeQRCode**](GenerateBarcodeApi.md#generateBarcodeQRCode) | **POST** /barcode/generate/qrcode | Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
[**generateBarcodeUPCA**](GenerateBarcodeApi.md#generateBarcodeUPCA) | **POST** /barcode/generate/upc-a | Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
[**generateBarcodeUPCE**](GenerateBarcodeApi.md#generateBarcodeUPCE) | **POST** /barcode/generate/upc-e | Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode


<a name="generateBarcodeEAN13"></a>
# **generateBarcodeEAN13**
> File generateBarcodeEAN13(value)

Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.GenerateBarcodeApi;

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | Barcode value to generate from
try {
    File result = apiInstance.generateBarcodeEAN13(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeEAN13");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Barcode value to generate from |

### Return type

[**File**](File.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

<a name="generateBarcodeEAN8"></a>
# **generateBarcodeEAN8**
> File generateBarcodeEAN8(value)

Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.GenerateBarcodeApi;

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | Barcode value to generate from
try {
    File result = apiInstance.generateBarcodeEAN8(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeEAN8");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| Barcode value to generate from |

### Return type

[**File**](File.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

<a name="generateBarcodeQRCode"></a>
# **generateBarcodeQRCode**
> File generateBarcodeQRCode(value)

Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information

### Example
```java
// Import classes:
//import com.cloudmersive.client.GenerateBarcodeApi;

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | QR code text to convert into the QR code barcode
try {
    File result = apiInstance.generateBarcodeQRCode(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeQRCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| QR code text to convert into the QR code barcode |

### Return type

[**File**](File.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

<a name="generateBarcodeUPCA"></a>
# **generateBarcodeUPCA**
> File generateBarcodeUPCA(value)

Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.GenerateBarcodeApi;

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | UPC-A barcode value to generate from
try {
    File result = apiInstance.generateBarcodeUPCA(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeUPCA");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| UPC-A barcode value to generate from |

### Return type

[**File**](File.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

<a name="generateBarcodeUPCE"></a>
# **generateBarcodeUPCE**
> File generateBarcodeUPCE(value)

Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode

### Example
```java
// Import classes:
//import com.cloudmersive.client.GenerateBarcodeApi;

GenerateBarcodeApi apiInstance = new GenerateBarcodeApi();
String value = "value_example"; // String | UPC-E barcode value to generate from
try {
    File result = apiInstance.generateBarcodeUPCE(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenerateBarcodeApi#generateBarcodeUPCE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | **String**| UPC-E barcode value to generate from |

### Return type

[**File**](File.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: image/png

