package com.example.gocycle;

public class Node {
    public long fromOsmId;
    public long toOsmId;
    public double speed;

    public Node() {}

    public Node(long fromOsmId, long toOsmId, double speed) {
        this.fromOsmId = fromOsmId;
        this.toOsmId = toOsmId;
        this.speed = speed;
    }

    public long getfromOsmId() {
        return fromOsmId;
    }

    public void setfromOsmId(int fromOsmId) {
        this.fromOsmId = fromOsmId;
    }

    public long gettoOsmId() {
        return toOsmId;
    }

    public void settoOsmId(int toOsmId) {
        this.toOsmId = toOsmId;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Node{" +
                "fromOsmId=" + fromOsmId +
                ", toOsmId=" + toOsmId +
                ", speed=" + speed +
                '}';
    }
}
