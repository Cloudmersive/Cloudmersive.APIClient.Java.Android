/**
 * nlpapi
 * The powerful Natural Language Processing APIs let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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

import com.cloudmersive.client.model.PosRequest;
import com.cloudmersive.client.model.PosResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class PosTaggerJsonApi {
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
  * Part-of-speech tag a string
  * Part-of-speech (POS) tag a string and return result as JSON
   * @param request Input string
   * @return PosResponse
  */
  public PosResponse posTaggerJsonPost (PosRequest request) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = request;
    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling posTaggerJsonPost",
        new ApiException(400, "Missing the required parameter 'request' when calling posTaggerJsonPost"));
    }

    // create path and map variables
    String path = "/nlp/PosTaggerJson";

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
         return (PosResponse) ApiInvoker.deserialize(localVarResponse, "", PosResponse.class);
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
   * Part-of-speech tag a string
   * Part-of-speech (POS) tag a string and return result as JSON
   * @param request Input string
  */
  public void posTaggerJsonPost (PosRequest request, final Response.Listener<PosResponse> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = request;

    // verify the required parameter 'request' is set
    if (request == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'request' when calling posTaggerJsonPost",
        new ApiException(400, "Missing the required parameter 'request' when calling posTaggerJsonPost"));
    }

    // create path and map variables
    String path = "/nlp/PosTaggerJson".replaceAll("\\{format\\}","json");

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
              responseListener.onResponse((PosResponse) ApiInvoker.deserialize(localVarResponse,  "", PosResponse.class));
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
