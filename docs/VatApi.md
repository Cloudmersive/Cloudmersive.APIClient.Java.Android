# VatApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vatVatLookup**](VatApi.md#vatVatLookup) | **POST** /validate/vat/lookup | Lookup a VAT code


<a name="vatVatLookup"></a>
# **vatVatLookup**
> VatLookupResponse vatVatLookup(input)

Lookup a VAT code

Checks if a VAT code is valid, and if it is, returns more information about it

### Example
```java
// Import classes:
//import com.cloudmersive.client.VatApi;

VatApi apiInstance = new VatApi();
VatLookupRequest input = new VatLookupRequest(); // VatLookupRequest | Input VAT code
try {
    VatLookupResponse result = apiInstance.vatVatLookup(input);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VatApi#vatVatLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **input** | [**VatLookupRequest**](VatLookupRequest.md)| Input VAT code |

### Return type

[**VatLookupResponse**](VatLookupResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json, application/xml, text/xml

