package com.syndybat.chartjs.bar;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;

public class BarDatasetBean implements Serializable {
    private String label;
    private List<Double> data;
    private List<String> backgroundColor;
    private List<String> borderColor;
    //private String xAxisID;
    //private String yAxisID;
    //private final List<BorderSkipped> borderSkipped;
    //protected final List<Color> backgroundColor;
    //protected final List<Color> borderColor;
    //protected final List<Integer> borderWidth;
    //protected final List<Color> hoverBackgroundColor;
    //protected final List<Color> hoverBorderColor;
    //protected final List<Integer> hoverBorderWidth;

    public BarDatasetBean(){}

    public BarDatasetBean(String label, AbstractList<Double> data, AbstractList<String> backgroundColor, AbstractList<String> borderColor) {
        this.label = label;
        this.data = data;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setData(List<Double> data) {
        this.data = data;
    }

    public void setBackgroundColor(List<String> backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBorderColor(List<String> borderColor) {
        this.borderColor = borderColor;
    }

    public String getLabel() {
        return label;
    }

    public List<Double> getData() {
        return data;
    }

    public List<String> getBackgroundColor() {
        return backgroundColor;
    }

    public List<String> getBorderColor() {
        return borderColor;
    }
}
