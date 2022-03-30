package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Road
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-29T15:47:54.662Z")


public class Road   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("line")
  private String line = null;

  @JsonProperty("quality")
  private BigDecimal quality = null;

  @JsonProperty("speed")
  private BigDecimal speed = null;

  public Road id(Long id) {
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

  public Road line(String line) {
    this.line = line;
    return this;
  }

  /**
   * Get line
   * @return line
  **/
  @ApiModelProperty(value = "")


  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public Road quality(BigDecimal quality) {
    this.quality = quality;
    return this;
  }

  /**
   * Get quality
   * @return quality
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getQuality() {
    return quality;
  }

  public void setQuality(BigDecimal quality) {
    this.quality = quality;
  }

  public Road speed(BigDecimal speed) {
    this.speed = speed;
    return this;
  }

  /**
   * Get speed
   * @return speed
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getSpeed() {
    return speed;
  }

  public void setSpeed(BigDecimal speed) {
    this.speed = speed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Road road = (Road) o;
    return Objects.equals(this.id, road.id) &&
        Objects.equals(this.line, road.line) &&
        Objects.equals(this.quality, road.quality) &&
        Objects.equals(this.speed, road.speed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, line, quality, speed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Road {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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

