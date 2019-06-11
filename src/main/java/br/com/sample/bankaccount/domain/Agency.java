package br.com.sample.bankaccount.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Agency
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-11T01:35:03.801Z")

public class Agency   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("bank")
  private String bank = null;

  @JsonProperty("ag")
  private String ag = null;

  @JsonProperty("address")
  private String address = null;

  public Agency id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Agency bank(String bank) {
    this.bank = bank;
    return this;
  }

  /**
   * Get bank
   * @return bank
  **/
  @ApiModelProperty(example = "Banco do Brasil", required = true, value = "")
  @NotNull


  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public Agency ag(String ag) {
    this.ag = ag;
    return this;
  }

  /**
   * Get ag
   * @return ag
  **/
  @ApiModelProperty(example = "2090-0", required = true, value = "")
  @NotNull


  public String getAg() {
    return ag;
  }

  public void setAg(String ag) {
    this.ag = ag;
  }

  public Agency address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Agency agency = (Agency) o;
    return Objects.equals(this.id, agency.id) &&
        Objects.equals(this.bank, agency.bank) &&
        Objects.equals(this.ag, agency.ag) &&
        Objects.equals(this.address, agency.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bank, ag, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agency {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    ag: ").append(toIndentedString(ag)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

