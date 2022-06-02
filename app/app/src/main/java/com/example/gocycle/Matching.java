package com.example.gocycle;

public class Matching {
    private double confidence;
    private String geometry;
    private Leg[] legs;
    private String weightName;
    private double weight;
    private double duration;
    private double distance;

    public double getConfidence() { return confidence; }
    public void setConfidence(double value) { this.confidence = value; }

    public String getGeometry() { return geometry; }
    public void setGeometry(String value) { this.geometry = value; }

    public Leg[] getLegs() { return legs; }
    public void setLegs(Leg[] value) { this.legs = value; }

    public String getWeightName() { return weightName; }
    public void setWeightName(String value) { this.weightName = value; }

    public double getWeight() { return weight; }
    public void setWeight(double value) { this.weight = value; }

    public double getDuration() { return duration; }
    public void setDuration(double value) { this.duration = value; }

    public double getDistance() { return distance; }
    public void setDistance(double value) { this.distance = value; }
}
