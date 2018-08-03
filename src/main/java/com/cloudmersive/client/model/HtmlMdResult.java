/**
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.cloudmersive.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Result from converting a Markdown file to HTML
 **/
@ApiModel(description = "Result from converting a Markdown file to HTML")
public class HtmlMdResult {
  
  @SerializedName("Successful")
  private Boolean successful = null;
  @SerializedName("Html")
  private String html = null;

  /**
   * True if operation was successful, false otherwise
   **/
  @ApiModelProperty(value = "True if operation was successful, false otherwise")
  public Boolean getSuccessful() {
    return successful;
  }
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  /**
   * Resulting HTML from the conversion
   **/
  @ApiModelProperty(value = "Resulting HTML from the conversion")
  public String getHtml() {
    return html;
  }
  public void setHtml(String html) {
    this.html = html;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlMdResult htmlMdResult = (HtmlMdResult) o;
    return (this.successful == null ? htmlMdResult.successful == null : this.successful.equals(htmlMdResult.successful)) &&
        (this.html == null ? htmlMdResult.html == null : this.html.equals(htmlMdResult.html));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.successful == null ? 0: this.successful.hashCode());
    result = 31 * result + (this.html == null ? 0: this.html.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlMdResult {\n");
    
    sb.append("  successful: ").append(successful).append("\n");
    sb.append("  html: ").append(html).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
