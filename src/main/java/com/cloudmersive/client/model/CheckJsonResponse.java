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

package com.cloudmersive.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Spell check result
 **/
@ApiModel(description = "Spell check result")
public class CheckJsonResponse {
  
  @SerializedName("Correct")
  private Boolean correct = null;

  /**
   * True if spellected correctly, false otherwise
   **/
  @ApiModelProperty(value = "True if spellected correctly, false otherwise")
  public Boolean getCorrect() {
    return correct;
  }
  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckJsonResponse checkJsonResponse = (CheckJsonResponse) o;
    return (this.correct == null ? checkJsonResponse.correct == null : this.correct.equals(checkJsonResponse.correct));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.correct == null ? 0: this.correct.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckJsonResponse {\n");
    
    sb.append("  correct: ").append(correct).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
