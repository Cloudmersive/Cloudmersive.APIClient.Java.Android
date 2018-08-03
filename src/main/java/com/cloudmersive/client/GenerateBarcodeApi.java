/**
 * barcodeapi
 * Barcode APIs let you generate barcode images, and recognize values from images of barcodes.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiInvoker;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Pair;

import com.cloudmersive.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class GenerateBarcodeApi {
  String basePath = "https://api.cloudmersive.com";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
  * 
   * @param value Barcode value to generate from
   * @return File
  */
  public File generateBarcodeEAN13 (String value) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = value;
    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeEAN13",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeEAN13"));
    }

    // create path and map variables
    String path = "/barcode/generate/ean-13";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json",
      "text/json",
      "application/xml",
      "text/xml",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Apikey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (File) ApiInvoker.deserialize(localVarResponse, "", File.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
   * 
   * @param value Barcode value to generate from
  */
  public void generateBarcodeEAN13 (String value, final Response.Listener<File> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = value;

    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeEAN13",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeEAN13"));
    }

    // create path and map variables
    String path = "/barcode/generate/ean-13".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Apikey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((File) ApiInvoker.deserialize(localVarResponse,  "", File.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
  * 
   * @param value Barcode value to generate from
   * @return File
  */
  public File generateBarcodeEAN8 (String value) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = value;
    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeEAN8",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeEAN8"));
    }

    // create path and map variables
    String path = "/barcode/generate/ean-8";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json",
      "text/json",
      "application/xml",
      "text/xml",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Apikey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (File) ApiInvoker.deserialize(localVarResponse, "", File.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
   * 
   * @param value Barcode value to generate from
  */
  public void generateBarcodeEAN8 (String value, final Response.Listener<File> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = value;

    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeEAN8",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeEAN8"));
    }

    // create path and map variables
    String path = "/barcode/generate/ean-8".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Apikey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((File) ApiInvoker.deserialize(localVarResponse,  "", File.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
  * 
   * @param value QR code text to convert into the QR code barcode
   * @return File
  */
  public File generateBarcodeQRCode (String value) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = value;
    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeQRCode",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeQRCode"));
    }

    // create path and map variables
    String path = "/barcode/generate/qrcode";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json",
      "text/json",
      "application/xml",
      "text/xml",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Apikey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (File) ApiInvoker.deserialize(localVarResponse, "", File.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
   * 
   * @param value QR code text to convert into the QR code barcode
  */
  public void generateBarcodeQRCode (String value, final Response.Listener<File> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = value;

    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeQRCode",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeQRCode"));
    }

    // create path and map variables
    String path = "/barcode/generate/qrcode".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Apikey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((File) ApiInvoker.deserialize(localVarResponse,  "", File.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
  * 
   * @param value UPC-A barcode value to generate from
   * @return File
  */
  public File generateBarcodeUPCA (String value) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = value;
    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeUPCA",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeUPCA"));
    }

    // create path and map variables
    String path = "/barcode/generate/upc-a";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json",
      "text/json",
      "application/xml",
      "text/xml",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Apikey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (File) ApiInvoker.deserialize(localVarResponse, "", File.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
   * 
   * @param value UPC-A barcode value to generate from
  */
  public void generateBarcodeUPCA (String value, final Response.Listener<File> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = value;

    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeUPCA",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeUPCA"));
    }

    // create path and map variables
    String path = "/barcode/generate/upc-a".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Apikey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((File) ApiInvoker.deserialize(localVarResponse,  "", File.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
  * 
   * @param value UPC-E barcode value to generate from
   * @return File
  */
  public File generateBarcodeUPCE (String value) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = value;
    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeUPCE",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeUPCE"));
    }

    // create path and map variables
    String path = "/barcode/generate/upc-e";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json",
      "text/json",
      "application/xml",
      "text/xml",
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Apikey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (File) ApiInvoker.deserialize(localVarResponse, "", File.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
   * 
   * @param value UPC-E barcode value to generate from
  */
  public void generateBarcodeUPCE (String value, final Response.Listener<File> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = value;

    // verify the required parameter 'value' is set
    if (value == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'value' when calling generateBarcodeUPCE",
        new ApiException(400, "Missing the required parameter 'value' when calling generateBarcodeUPCE"));
    }

    // create path and map variables
    String path = "/barcode/generate/upc-e".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json","text/json","application/xml","text/xml","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "Apikey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((File) ApiInvoker.deserialize(localVarResponse,  "", File.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
