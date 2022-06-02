package com.example.gocycle;

public class Annotation {
    private Metadata metadata;
    private long[] datasources;
    private double[] weight;
    private long[] nodes;
    private double[] distance;
    private double[] duration;
    private double[] speed;

    public Metadata getMetadata() { return metadata; }
    public void setMetadata(Metadata value) { this.metadata = value; }

    public long[] getDatasources() { return datasources; }
    public void setDatasources(long[] value) { this.datasources = value; }

    public double[] getWeight() { return weight; }
    public void setWeight(double[] value) { this.weight = value; }

    public long[] getNodes() { return nodes; }
    public void setNodes(long[] value) { this.nodes = value; }

    public double[] getDistance() { return distance; }
    public void setDistance(double[] value) { this.distance = value; }

    public double[] getDuration() { return duration; }
    public void setDuration(double[] value) { this.duration = value; }

    public double[] getSpeed() { return speed; }
    public void setSpeed(double[] value) { this.speed = value; }
}
