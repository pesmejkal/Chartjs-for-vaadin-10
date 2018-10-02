package com.syndybat.chartjs.line;

import java.io.Serializable;

public class LineChartBean implements Serializable {
    private String type = "line";
    private LineDataBean data;
    private LineOptionsBean options;

    public LineChartBean() {
    }

    public LineChartBean(String type, LineDataBean data, LineOptionsBean options) {
        this.type = type;
        this.data = data;
        this.options = options;
    }

    public String getType() {
        return type;
    }

    public LineDataBean getData() {
        return data;
    }

    public LineOptionsBean getOptions() {
        return options;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(LineDataBean data) {
        this.data = data;
    }

    public void setOptions(LineOptionsBean options) {
        this.options = options;
    }
}
