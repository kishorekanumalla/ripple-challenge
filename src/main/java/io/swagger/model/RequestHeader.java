package io.swagger.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RequestHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T06:14:12.973Z")

public class RequestHeader   {
  @JsonProperty("auth")
  private Auth auth = null;

  @JsonProperty("creationDateTime")
  private String creationDateTime = null;

  @JsonProperty("msgId")
  private String msgId = null;

  public RequestHeader auth(Auth auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Auth getAuth() {
    return auth;
  }

  public void setAuth(Auth auth) {
    this.auth = auth;
  }

  public RequestHeader creationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Get creationDateTime
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(String creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public RequestHeader msgId(String msgId) {
    this.msgId = msgId;
    return this;
  }

   /**
   * Get msgId
   * @return msgId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getMsgId() {
    return msgId;
  }

  public void setMsgId(String msgId) {
    this.msgId = msgId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeader requestHeader = (RequestHeader) o;
    return Objects.equals(this.auth, requestHeader.auth) &&
        Objects.equals(this.creationDateTime, requestHeader.creationDateTime) &&
        Objects.equals(this.msgId, requestHeader.msgId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, creationDateTime, msgId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeader {\n");
    
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    msgId: ").append(toIndentedString(msgId)).append("\n");
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

