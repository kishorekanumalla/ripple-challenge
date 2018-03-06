package io.swagger.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ApiRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T06:14:12.973Z")

public class ApiRequest   {
  @JsonProperty("paymentInfo")
  private PaymentInfo paymentInfo = null;

  @JsonProperty("requestHeader")
  private RequestHeader requestHeader = null;

  public ApiRequest paymentInfo(PaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
    return this;
  }

   /**
   * Get paymentInfo
   * @return paymentInfo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentInfo getPaymentInfo() {
    return paymentInfo;
  }

  public void setPaymentInfo(PaymentInfo paymentInfo) {
    this.paymentInfo = paymentInfo;
  }

  public ApiRequest requestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

   /**
   * Get requestHeader
   * @return requestHeader
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestHeader getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequest apiRequest = (ApiRequest) o;
    return Objects.equals(this.paymentInfo, apiRequest.paymentInfo) &&
        Objects.equals(this.requestHeader, apiRequest.requestHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentInfo, requestHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequest {\n");
    
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
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

