package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Amount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T06:14:12.973Z")

public class Amount   {
  @JsonProperty("paymentAmount")
  private String paymentAmount = null;

  @JsonProperty("paymentCurrency")
  private String paymentCurrency = null;

  public Amount paymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public Amount paymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
    return this;
  }

   /**
   * Get paymentCurrency
   * @return paymentCurrency
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getPaymentCurrency() {
    return paymentCurrency;
  }

  public void setPaymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.paymentAmount, amount.paymentAmount) &&
        Objects.equals(this.paymentCurrency, amount.paymentCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentAmount, paymentCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
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

