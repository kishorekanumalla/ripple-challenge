package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T06:14:12.973Z")

public class Account   {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("branchCode")
  private String branchCode = null;

  @JsonProperty("branchName")
  private String branchName = null;

  public Account accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Account accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @ApiModelProperty(value = "")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public Account bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

   /**
   * Get bankCode
   * @return bankCode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public Account bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(value = "")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Account branchCode(String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

   /**
   * Get branchCode
   * @return branchCode
  **/
  @ApiModelProperty(value = "")


  public String getBranchCode() {
    return branchCode;
  }

  public void setBranchCode(String branchCode) {
    this.branchCode = branchCode;
  }

  public Account branchName(String branchName) {
    this.branchName = branchName;
    return this;
  }

   /**
   * Get branchName
   * @return branchName
  **/
  @ApiModelProperty(value = "")


  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountNumber, account.accountNumber) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.bankCode, account.bankCode) &&
        Objects.equals(this.bankName, account.bankName) &&
        Objects.equals(this.branchCode, account.branchCode) &&
        Objects.equals(this.branchName, account.branchName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountType, bankCode, bankName, branchCode, branchName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    branchCode: ").append(toIndentedString(branchCode)).append("\n");
    sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
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

