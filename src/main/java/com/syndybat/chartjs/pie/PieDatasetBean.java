package com.syndybat.chartjs.pie;

import java.util.ArrayList;
import java.util.List;

public class PieDatasetBean {
    private String label;
    private List<Double> data = new ArrayList();
    private List<String> backgroundColor;
    private List<String> borderColor;

    public PieDatasetBean() {
    }

    public PieDatasetBean(String label, List<Double> data, List<String> backgroundColor, List<String> borderColor) {
        this.label = label;
        this.data = data;
        this.backgroundColor = backgroundColor;
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
}
