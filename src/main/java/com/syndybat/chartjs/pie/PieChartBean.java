package com.syndybat.chartjs.pie;

public class PieChartBean {
    private final String type = "pie";
    private PieDataBean data;
    private PieOptionsBean options;

    public PieChartBean() {
    }

    public PieChartBean(PieDataBean data, PieOptionsBean options) {
        this.data = data;
        this.options = options;
    }

    public String getType() {
        return type;
    }

    public PieDataBean getData() {
        return data;
    }

    public PieOptionsBean getOptions() {
        return options;
    }

    public void setData(PieDataBean data) {
        this.data = data;
    }

    public void setOptions(PieOptionsBean options) {
        this.options = options;
    }
}
