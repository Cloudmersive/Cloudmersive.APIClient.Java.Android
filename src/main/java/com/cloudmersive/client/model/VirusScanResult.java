/**
 * virusapi
 * Virus API lets you scan files and content for viruses and identify security issues with content.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.cloudmersive.client.model;

import com.cloudmersive.client.model.VirusFound;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Result of running a virus scan
 **/
@ApiModel(description = "Result of running a virus scan")
public class VirusScanResult {
  
  @SerializedName("CleanResult")
  private Boolean cleanResult = null;
  @SerializedName("FoundViruses")
  private List<VirusFound> foundViruses = null;

  /**
   * True if the scan contained no viruses, false otherwise
   **/
  @ApiModelProperty(value = "True if the scan contained no viruses, false otherwise")
  public Boolean getCleanResult() {
    return cleanResult;
  }
  public void setCleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
  }

  /**
   * Array of viruses found, if any
   **/
  @ApiModelProperty(value = "Array of viruses found, if any")
  public List<VirusFound> getFoundViruses() {
    return foundViruses;
  }
  public void setFoundViruses(List<VirusFound> foundViruses) {
    this.foundViruses = foundViruses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirusScanResult virusScanResult = (VirusScanResult) o;
    return (this.cleanResult == null ? virusScanResult.cleanResult == null : this.cleanResult.equals(virusScanResult.cleanResult)) &&
        (this.foundViruses == null ? virusScanResult.foundViruses == null : this.foundViruses.equals(virusScanResult.foundViruses));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cleanResult == null ? 0: this.cleanResult.hashCode());
    result = 31 * result + (this.foundViruses == null ? 0: this.foundViruses.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirusScanResult {\n");
    
    sb.append("  cleanResult: ").append(cleanResult).append("\n");
    sb.append("  foundViruses: ").append(foundViruses).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
