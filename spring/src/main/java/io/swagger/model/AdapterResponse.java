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
 * AdapterResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-23T07:30:18.777Z")

public class AdapterResponse   {
  @JsonProperty("buildDuration")
  private Long buildDuration = null;

  @JsonProperty("buildTimeOut")
  private Boolean buildTimeOut = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("type")
  private String type = null;

  public AdapterResponse buildDuration(Long buildDuration) {
    this.buildDuration = buildDuration;
    return this;
  }

   /**
   * Get buildDuration
   * @return buildDuration
  **/
  @ApiModelProperty(value = "")


  public Long getBuildDuration() {
    return buildDuration;
  }

  public void setBuildDuration(Long buildDuration) {
    this.buildDuration = buildDuration;
  }

  public AdapterResponse buildTimeOut(Boolean buildTimeOut) {
    this.buildTimeOut = buildTimeOut;
    return this;
  }

   /**
   * Get buildTimeOut
   * @return buildTimeOut
  **/
  @ApiModelProperty(value = "")


  public Boolean isBuildTimeOut() {
    return buildTimeOut;
  }

  public void setBuildTimeOut(Boolean buildTimeOut) {
    this.buildTimeOut = buildTimeOut;
  }

  public AdapterResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AdapterResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")


  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public AdapterResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdapterResponse adapterResponse = (AdapterResponse) o;
    return Objects.equals(this.buildDuration, adapterResponse.buildDuration) &&
        Objects.equals(this.buildTimeOut, adapterResponse.buildTimeOut) &&
        Objects.equals(this.message, adapterResponse.message) &&
        Objects.equals(this.success, adapterResponse.success) &&
        Objects.equals(this.type, adapterResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildDuration, buildTimeOut, message, success, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdapterResponse {\n");
    
    sb.append("    buildDuration: ").append(toIndentedString(buildDuration)).append("\n");
    sb.append("    buildTimeOut: ").append(toIndentedString(buildTimeOut)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

