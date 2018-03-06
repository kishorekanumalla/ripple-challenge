package io.swagger.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T06:14:12.973Z")

public class PaymentInfo   {
  @JsonProperty("Account")
  private Account account = null;

  @JsonProperty("Amount")
  private Amount amount = null;

  @JsonProperty("requestedExecutionDate")
  private String requestedExecutionDate = null;

  public PaymentInfo account(Account account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public PaymentInfo amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public PaymentInfo requestedExecutionDate(String requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
    return this;
  }

   /**
   * Get requestedExecutionDate
   * @return requestedExecutionDate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRequestedExecutionDate() {
    return requestedExecutionDate;
  }

  public void setRequestedExecutionDate(String requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInfo paymentInfo = (PaymentInfo) o;
    return Objects.equals(this.account, paymentInfo.account) &&
        Objects.equals(this.amount, paymentInfo.amount) &&
        Objects.equals(this.requestedExecutionDate, paymentInfo.requestedExecutionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, amount, requestedExecutionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInfo {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
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

