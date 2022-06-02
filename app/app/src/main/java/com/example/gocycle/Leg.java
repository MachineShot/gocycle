package com.example.gocycle;

public class Leg {
    private Object[] steps;
    private String summary;
    private double weight;
    private double duration;
    private Annotation annotation;
    private double distance;

    public Object[] getSteps() { return steps; }
    public void setSteps(Object[] value) { this.steps = value; }

    public String getSummary() { return summary; }
    public void setSummary(String value) { this.summary = value; }

    public double getWeight() { return weight; }
    public void setWeight(double value) { this.weight = value; }

    public double getDuration() { return duration; }
    public void setDuration(double value) { this.duration = value; }

    public Annotation getAnnotation() { return annotation; }
    public void setAnnotation(Annotation value) { this.annotation = value; }

    public double getDistance() { return distance; }
    public void setDistance(double value) { this.distance = value; }
}
