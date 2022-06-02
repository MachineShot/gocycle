package com.example.gocycle;

public class Match {
    private String code;
    private Matching[] matchings;
    private Tracepoint[] tracepoints;

    public String getCode() { return code; }
    public void setCode(String value) { this.code = value; }

    public Matching[] getMatchings() { return matchings; }
    public void setMatchings(Matching[] value) { this.matchings = value; }

    public Tracepoint[] getTracepoints() { return tracepoints; }
    public void setTracepoints(Tracepoint[] value) { this.tracepoints = value; }
}
