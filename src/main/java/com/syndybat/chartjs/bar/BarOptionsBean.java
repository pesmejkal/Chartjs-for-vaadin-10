package com.syndybat.chartjs.bar;

public class BarOptionsBean {
    //private HoverOption hoverOption;
    private BarScaleOptionBean scales;
    //private RectangleElements rectangleElements;

    public BarOptionsBean(){}

    public BarOptionsBean(BarScaleOptionBean scales) {
        this.scales = scales;
    }

    public void setScales(BarScaleOptionBean scales) {
        this.scales = scales;
    }

    public BarScaleOptionBean getScales() {
        return scales;
    }
}
