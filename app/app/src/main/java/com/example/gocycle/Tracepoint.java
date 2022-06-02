package com.example.gocycle;

public class Tracepoint {
    private long waypointIndex;
    private long matchingsIndex;
    private long alternativesCount;
    private String hint;
    private double distance;
    private String name;
    private double[] location;

    public long getWaypointIndex() { return waypointIndex; }
    public void setWaypointIndex(long value) { this.waypointIndex = value; }

    public long getMatchingsIndex() { return matchingsIndex; }
    public void setMatchingsIndex(long value) { this.matchingsIndex = value; }

    public long getAlternativesCount() { return alternativesCount; }
    public void setAlternativesCount(long value) { this.alternativesCount = value; }

    public String getHint() { return hint; }
    public void setHint(String value) { this.hint = value; }

    public double getDistance() { return distance; }
    public void setDistance(double value) { this.distance = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public double[] getLocation() { return location; }
    public void setLocation(double[] value) { this.location = value; }
}

