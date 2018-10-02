package com.syndybat.chartjs.bar;

import java.io.Serializable;

public class BarXAxesOptionBean implements Serializable {
    //private T ticks
    private String type = "test";
    private Boolean display;
    private String id;
    private Boolean stacked;
    private double categoryPercentage;
    private double barPercentage;
    //private GridLines gridLines;

    public BarXAxesOptionBean(){}

    public BarXAxesOptionBean(String type, Boolean display, String id, Boolean stacked, double categoryPercentage, double barPercentage) {
        this.type = type;
        this.display = display;
        this.id = id;
        this.stacked = stacked;
        this.categoryPercentage = categoryPercentage;
        this.barPercentage = barPercentage;
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

    public void setCategoryPercentage(double categoryPercentage) {
        this.categoryPercentage = categoryPercentage;
    }

    public void setBarPercentage(double barPercentage) {
        this.barPercentage = barPercentage;
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

    public double getCategoryPercentage() {
        return categoryPercentage;
    }

    public double getBarPercentage() {
        return barPercentage;
    }
}
