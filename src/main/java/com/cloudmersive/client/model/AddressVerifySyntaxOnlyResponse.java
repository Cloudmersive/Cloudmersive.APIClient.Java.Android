/**
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Syntactic validity of email address
 **/
@ApiModel(description = "Syntactic validity of email address")
public class AddressVerifySyntaxOnlyResponse {
  
  @SerializedName("ValidAddress")
  private Boolean validAddress = null;

  /**
   * True if the email address is syntactically valid, false if it is not
   **/
  @ApiModelProperty(value = "True if the email address is syntactically valid, false if it is not")
  public Boolean getValidAddress() {
    return validAddress;
  }
  public void setValidAddress(Boolean validAddress) {
    this.validAddress = validAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressVerifySyntaxOnlyResponse addressVerifySyntaxOnlyResponse = (AddressVerifySyntaxOnlyResponse) o;
    return (this.validAddress == null ? addressVerifySyntaxOnlyResponse.validAddress == null : this.validAddress.equals(addressVerifySyntaxOnlyResponse.validAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.validAddress == null ? 0: this.validAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressVerifySyntaxOnlyResponse {\n");
    
    sb.append("  validAddress: ").append(validAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
