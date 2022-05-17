package com.example.gocycle;

import com.google.gson.annotations.SerializedName;

public class Nearest {
    @SerializedName("code")
    private String code;
    @SerializedName("waypoints")
    private Waypoint[] waypoints;

    public String getCode() { return code; }
    public void setCode(String value) { this.code = value; }

    public Waypoint[] getWaypoints() { return waypoints; }
    public void setWaypoints(Waypoint[] value) { this.waypoints = value; }
}