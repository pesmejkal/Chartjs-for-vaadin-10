package com.syndybat.chartjs.pie;

public class PieOptionsBean {
    private Double cutoutPercentage;
    private Double rotation;
    private Double circumference;
    /*private PieAnimation animation;
    private ArcElements elements;*/

    public PieOptionsBean() {
    }

    public PieOptionsBean(Double cutoutPercentage, Double rotation, Double circumference) {
        this.cutoutPercentage = cutoutPercentage;
        this.rotation = rotation;
        this.circumference = circumference;
    }

    public Double getCutoutPercentage() {
        return cutoutPercentage;
    }

    public Double getRotation() {
        return rotation;
    }

    public Double getCircumference() {
        return circumference;
    }

    public void setCutoutPercentage(Double cutoutPercentage) {
        this.cutoutPercentage = cutoutPercentage;
    }

    public void setRotation(Double rotation) {
        this.rotation = rotation;
    }

    public void setCircumference(Double circumference) {
        this.circumference = circumference;
    }
}
