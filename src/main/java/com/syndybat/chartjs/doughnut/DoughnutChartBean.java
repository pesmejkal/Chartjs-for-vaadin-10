package com.syndybat.chartjs.doughnut;

import java.io.Serializable;

public class DoughnutChartBean implements Serializable {
    private final String type = "doughnut";
    private DoughnutDataBean data;
    private DoughnutOptionsBean options;

    public DoughnutChartBean() {
    }

    public DoughnutChartBean(DoughnutDataBean data, DoughnutOptionsBean options) {
        this.data = data;
        this.options = options;
    }

    public String getType() {
        return type;
    }

    public DoughnutDataBean getData() {
        return data;
    }

    public DoughnutOptionsBean getOptions() {
        return options;
    }

    public void setData(DoughnutDataBean data) {
        this.data = data;
    }

    public void setOptions(DoughnutOptionsBean options) {
        this.options = options;
    }
}
