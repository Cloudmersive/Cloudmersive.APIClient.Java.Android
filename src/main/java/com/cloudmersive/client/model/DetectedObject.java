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

package com.cloudmersive.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Single object instance, and associated details, detected in an image
 **/
@ApiModel(description = "Single object instance, and associated details, detected in an image")
public class DetectedObject {
  
  @SerializedName("ObjectClassName")
  private String objectClassName = null;
  @SerializedName("Height")
  private Integer height = null;
  @SerializedName("Width")
  private Integer width = null;
  @SerializedName("Score")
  private Double score = null;
  @SerializedName("X")
  private Integer X = null;
  @SerializedName("Y")
  private Integer Y = null;

  /**
   * Class of the object.  Example values are \"person\", \"car\", \"dining table\", etc.
   **/
  @ApiModelProperty(value = "Class of the object.  Example values are \"person\", \"car\", \"dining table\", etc.")
  public String getObjectClassName() {
    return objectClassName;
  }
  public void setObjectClassName(String objectClassName) {
    this.objectClassName = objectClassName;
  }

  /**
   * Height, in pixels, of the object
   **/
  @ApiModelProperty(value = "Height, in pixels, of the object")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Width, in pixels, of the object
   **/
  @ApiModelProperty(value = "Width, in pixels, of the object")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   * Confidence score of detected object; possible values are between 0.0 and 1.0; values closer to 1.0 are higher confidence
   **/
  @ApiModelProperty(value = "Confidence score of detected object; possible values are between 0.0 and 1.0; values closer to 1.0 are higher confidence")
  public Double getScore() {
    return score;
  }
  public void setScore(Double score) {
    this.score = score;
  }

  /**
   * X location, in pixels, of the left side location of the object, with the right side being X + Width
   **/
  @ApiModelProperty(value = "X location, in pixels, of the left side location of the object, with the right side being X + Width")
  public Integer getX() {
    return X;
  }
  public void setX(Integer X) {
    this.X = X;
  }

  /**
   * Y location, in pixels, of the top side location of the object, with the bottom side being Y + Height
   **/
  @ApiModelProperty(value = "Y location, in pixels, of the top side location of the object, with the bottom side being Y + Height")
  public Integer getY() {
    return Y;
  }
  public void setY(Integer Y) {
    this.Y = Y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedObject detectedObject = (DetectedObject) o;
    return (this.objectClassName == null ? detectedObject.objectClassName == null : this.objectClassName.equals(detectedObject.objectClassName)) &&
        (this.height == null ? detectedObject.height == null : this.height.equals(detectedObject.height)) &&
        (this.width == null ? detectedObject.width == null : this.width.equals(detectedObject.width)) &&
        (this.score == null ? detectedObject.score == null : this.score.equals(detectedObject.score)) &&
        (this.X == null ? detectedObject.X == null : this.X.equals(detectedObject.X)) &&
        (this.Y == null ? detectedObject.Y == null : this.Y.equals(detectedObject.Y));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objectClassName == null ? 0: this.objectClassName.hashCode());
    result = 31 * result + (this.height == null ? 0: this.height.hashCode());
    result = 31 * result + (this.width == null ? 0: this.width.hashCode());
    result = 31 * result + (this.score == null ? 0: this.score.hashCode());
    result = 31 * result + (this.X == null ? 0: this.X.hashCode());
    result = 31 * result + (this.Y == null ? 0: this.Y.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedObject {\n");
    
    sb.append("  objectClassName: ").append(objectClassName).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("  X: ").append(X).append("\n");
    sb.append("  Y: ").append(Y).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
