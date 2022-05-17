package com.example.gocycle;

import com.google.gson.annotations.SerializedName;

public class Waypoint {
    @SerializedName("hint")
    private String hint;
    @SerializedName("nodes")
    private long[] nodes;
    @SerializedName("distance")
    private double distance;
    @SerializedName("name")
    private String name;
    @SerializedName("location")
    private double[] location;

    public String getHint() { return hint; }
    public void setHint(String value) { this.hint = value; }

    public long[] getNodes() { return nodes; }
    public void setNodes(long[] value) { this.nodes = value; }

    public double getDistance() { return distance; }
    public void setDistance(double value) { this.distance = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public double[] getLocation() { return location; }
    public void setLocation(double[] value) { this.location = value; }
}

