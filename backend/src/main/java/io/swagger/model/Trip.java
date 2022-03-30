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
 * Trip
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-29T15:47:54.662Z")


public class Trip   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("avgSpeed")
  private BigDecimal avgSpeed = null;

  @JsonProperty("maxSpeed")
  private BigDecimal maxSpeed = null;

  @JsonProperty("calories")
  private Long calories = null;

  @JsonProperty("altitude")
  private BigDecimal altitude = null;

  public Trip id(Long id) {
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

  public Trip timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Trip duration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Trip avgSpeed(BigDecimal avgSpeed) {
    this.avgSpeed = avgSpeed;
    return this;
  }

  /**
   * Get avgSpeed
   * @return avgSpeed
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAvgSpeed() {
    return avgSpeed;
  }

  public void setAvgSpeed(BigDecimal avgSpeed) {
    this.avgSpeed = avgSpeed;
  }

  public Trip maxSpeed(BigDecimal maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }

  /**
   * Get maxSpeed
   * @return maxSpeed
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(BigDecimal maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public Trip calories(Long calories) {
    this.calories = calories;
    return this;
  }

  /**
   * Get calories
   * @return calories
  **/
  @ApiModelProperty(value = "")


  public Long getCalories() {
    return calories;
  }

  public void setCalories(Long calories) {
    this.calories = calories;
  }

  public Trip altitude(BigDecimal altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * @return altitude
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getAltitude() {
    return altitude;
  }

  public void setAltitude(BigDecimal altitude) {
    this.altitude = altitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trip trip = (Trip) o;
    return Objects.equals(this.id, trip.id) &&
        Objects.equals(this.timestamp, trip.timestamp) &&
        Objects.equals(this.duration, trip.duration) &&
        Objects.equals(this.avgSpeed, trip.avgSpeed) &&
        Objects.equals(this.maxSpeed, trip.maxSpeed) &&
        Objects.equals(this.calories, trip.calories) &&
        Objects.equals(this.altitude, trip.altitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, duration, avgSpeed, maxSpeed, calories, altitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trip {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    avgSpeed: ").append(toIndentedString(avgSpeed)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    calories: ").append(toIndentedString(calories)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
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

