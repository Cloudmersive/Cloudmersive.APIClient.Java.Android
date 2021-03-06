/**
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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

public class ResizeApi {
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
  * Resize an image with parameters
  * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio
   * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width
   * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
   * @return Object
  */
  public Object resizePost (Integer maxWidth, Integer maxHeight, File imageFile) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'maxWidth' is set
    if (maxWidth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'maxWidth' when calling resizePost",
        new ApiException(400, "Missing the required parameter 'maxWidth' when calling resizePost"));
    }
    // verify the required parameter 'maxHeight' is set
    if (maxHeight == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'maxHeight' when calling resizePost",
        new ApiException(400, "Missing the required parameter 'maxHeight' when calling resizePost"));
    }
    // verify the required parameter 'imageFile' is set
    if (imageFile == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'imageFile' when calling resizePost",
        new ApiException(400, "Missing the required parameter 'imageFile' when calling resizePost"));
    }

    // create path and map variables
    String path = "/image/resize/preserveAspectRatio/{maxWidth}/{maxHeight}".replaceAll("\\{" + "maxWidth" + "\\}", apiInvoker.escapeString(maxWidth.toString())).replaceAll("\\{" + "maxHeight" + "\\}", apiInvoker.escapeString(maxHeight.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      if (imageFile != null) {
        localVarBuilder.addBinaryBody("imageFile", imageFile);
      }
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "Apikey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Object) ApiInvoker.deserialize(localVarResponse, "", Object.class);
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
   * Resize an image with parameters
   * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio
   * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width   * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
  */
  public void resizePost (Integer maxWidth, Integer maxHeight, File imageFile, final Response.Listener<Object> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'maxWidth' is set
    if (maxWidth == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'maxWidth' when calling resizePost",
        new ApiException(400, "Missing the required parameter 'maxWidth' when calling resizePost"));
    }
    // verify the required parameter 'maxHeight' is set
    if (maxHeight == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'maxHeight' when calling resizePost",
        new ApiException(400, "Missing the required parameter 'maxHeight' when calling resizePost"));
    }
    // verify the required parameter 'imageFile' is set
    if (imageFile == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'imageFile' when calling resizePost",
        new ApiException(400, "Missing the required parameter 'imageFile' when calling resizePost"));
    }

    // create path and map variables
    String path = "/image/resize/preserveAspectRatio/{maxWidth}/{maxHeight}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "maxWidth" + "\\}", apiInvoker.escapeString(maxWidth.toString())).replaceAll("\\{" + "maxHeight" + "\\}", apiInvoker.escapeString(maxHeight.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "multipart/form-data"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      
      if (imageFile != null) {
        localVarBuilder.addBinaryBody("imageFile", imageFile);
      }
      

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
              responseListener.onResponse((Object) ApiInvoker.deserialize(localVarResponse,  "", Object.class));
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
