package com.syndybat.chartjs.bar;


public class BarChartBean {
    private String type = "bar";
    private BarDataBean data;
    private BarOptionsBean options;

    public BarChartBean() {
    }

    public BarChartBean(String type, BarDataBean data, BarOptionsBean options) {
        this.type = type;
        this.data = data;
        this.options = options;
    }

    public void setType(Boolean horizontal) {
        if(horizontal){
            this.type = "bar";
        }else{
            this.type = "horizontalBar";
        }

    }

    public void setData(BarDataBean data) {
        this.data = data;
    }

    public void setOptions(BarOptionsBean options) {
        this.options = options;
    }

    public String getType() {
        return type;
    }

    public BarDataBean getData() {
        return data;
    }

    public BarOptionsBean getOptions() {
        return options;
    }
}
