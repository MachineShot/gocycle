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
 * TripRoad
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-29T15:47:54.662Z")


public class TripRoad   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("startTimestamp")
  private String startTimestamp = null;

  @JsonProperty("endTimestamp")
  private String endTimestamp = null;

  @JsonProperty("startPoint")
  private String startPoint = null;

  @JsonProperty("endPoint")
  private String endPoint = null;

  public TripRoad id(Long id) {
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

  public TripRoad startTimestamp(String startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  /**
   * Get startTimestamp
   * @return startTimestamp
  **/
  @ApiModelProperty(value = "")


  public String getStartTimestamp() {
    return startTimestamp;
  }

  public void setStartTimestamp(String startTimestamp) {
    this.startTimestamp = startTimestamp;
  }

  public TripRoad endTimestamp(String endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  /**
   * Get endTimestamp
   * @return endTimestamp
  **/
  @ApiModelProperty(value = "")


  public String getEndTimestamp() {
    return endTimestamp;
  }

  public void setEndTimestamp(String endTimestamp) {
    this.endTimestamp = endTimestamp;
  }

  public TripRoad startPoint(String startPoint) {
    this.startPoint = startPoint;
    return this;
  }

  /**
   * Get startPoint
   * @return startPoint
  **/
  @ApiModelProperty(value = "")


  public String getStartPoint() {
    return startPoint;
  }

  public void setStartPoint(String startPoint) {
    this.startPoint = startPoint;
  }

  public TripRoad endPoint(String endPoint) {
    this.endPoint = endPoint;
    return this;
  }

  /**
   * Get endPoint
   * @return endPoint
  **/
  @ApiModelProperty(value = "")


  public String getEndPoint() {
    return endPoint;
  }

  public void setEndPoint(String endPoint) {
    this.endPoint = endPoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TripRoad tripRoad = (TripRoad) o;
    return Objects.equals(this.id, tripRoad.id) &&
        Objects.equals(this.startTimestamp, tripRoad.startTimestamp) &&
        Objects.equals(this.endTimestamp, tripRoad.endTimestamp) &&
        Objects.equals(this.startPoint, tripRoad.startPoint) &&
        Objects.equals(this.endPoint, tripRoad.endPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTimestamp, endTimestamp, startPoint, endPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TripRoad {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
    sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
    sb.append("    startPoint: ").append(toIndentedString(startPoint)).append("\n");
    sb.append("    endPoint: ").append(toIndentedString(endPoint)).append("\n");
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

