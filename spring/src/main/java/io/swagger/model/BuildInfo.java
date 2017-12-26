package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BuildInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-26T06:37:43.014Z")

public class BuildInfo   {
  @JsonProperty("operationName")
  private String operationName = null;

  @JsonProperty("result")
  private String result = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("buildName")
  private String buildName = null;

  @JsonProperty("buildNumber")
  private String buildNumber = null;

  @JsonProperty("buildURL")
  private String buildURL = null;

  public BuildInfo operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

   /**
   * VNF Operation Name.
   * @return operationName
  **/
  @ApiModelProperty(value = "VNF Operation Name.")


  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  public BuildInfo result(String result) {
    this.result = result;
    return this;
  }

   /**
   * VNF Operation result.
   * @return result
  **/
  @ApiModelProperty(value = "VNF Operation result.")


  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public BuildInfo message(String message) {
    this.message = message;
    return this;
  }

   /**
   * VNF Operation message
   * @return message
  **/
  @ApiModelProperty(value = "VNF Operation message")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BuildInfo buildName(String buildName) {
    this.buildName = buildName;
    return this;
  }

   /**
   * buildName
   * @return buildName
  **/
  @ApiModelProperty(value = "buildName")


  public String getBuildName() {
    return buildName;
  }

  public void setBuildName(String buildName) {
    this.buildName = buildName;
  }

  public BuildInfo buildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

   /**
   * buildNumber
   * @return buildNumber
  **/
  @ApiModelProperty(value = "buildNumber")


  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public BuildInfo buildURL(String buildURL) {
    this.buildURL = buildURL;
    return this;
  }

   /**
   * buildURL
   * @return buildURL
  **/
  @ApiModelProperty(value = "buildURL")


  public String getBuildURL() {
    return buildURL;
  }

  public void setBuildURL(String buildURL) {
    this.buildURL = buildURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildInfo buildInfo = (BuildInfo) o;
    return Objects.equals(this.operationName, buildInfo.operationName) &&
        Objects.equals(this.result, buildInfo.result) &&
        Objects.equals(this.message, buildInfo.message) &&
        Objects.equals(this.buildName, buildInfo.buildName) &&
        Objects.equals(this.buildNumber, buildInfo.buildNumber) &&
        Objects.equals(this.buildURL, buildInfo.buildURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationName, result, message, buildName, buildNumber, buildURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildInfo {\n");
    
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    buildName: ").append(toIndentedString(buildName)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    buildURL: ").append(toIndentedString(buildURL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

