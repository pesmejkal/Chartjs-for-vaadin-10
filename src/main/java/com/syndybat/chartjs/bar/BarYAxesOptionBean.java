package com.syndybat.chartjs.bar;

import java.io.Serializable;

public class BarYAxesOptionBean implements Serializable {
    //private T ticks;
    private String type = "type";
    private Boolean display;
    private String id;
    private Boolean stacked;

    public BarYAxesOptionBean(){}

    public BarYAxesOptionBean(String type, Boolean display, String id, Boolean stacked) {
        this.type = type;
        this.display = display;
        this.id = id;
        this.stacked = stacked;
    }

    public String getType() {
        return type;
    }

    public Boolean getDisplay() {
        return display;
    }

    public String getId() {
        return id;
    }

    public Boolean getStacked() {
        return stacked;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStacked(Boolean stacked) {
        this.stacked = stacked;
    }
}
