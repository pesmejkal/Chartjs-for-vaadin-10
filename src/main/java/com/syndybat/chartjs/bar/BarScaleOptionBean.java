package com.syndybat.chartjs.bar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BarScaleOptionBean implements Serializable {
    public List<BarXAxesOptionBean> xAxes;
    private List<BarYAxesOptionBean> yAxes;

    public BarScaleOptionBean(){
        xAxes = new ArrayList<>();
        yAxes = new ArrayList<>();
    }

    public BarScaleOptionBean(List<BarXAxesOptionBean> xAxes, List<BarYAxesOptionBean> yAxes) {
        this.xAxes = xAxes;
        this.yAxes = yAxes;
    }

    public List<BarXAxesOptionBean> getXAxes() {
        return xAxes;
    }

    public List<BarYAxesOptionBean> getYAxes() {
        return yAxes;
    }

    public void setXAxes(List<BarXAxesOptionBean> xAxes) {
        this.xAxes = xAxes;
    }

    public void setYAxes(List<BarYAxesOptionBean> yAxes) {
        this.yAxes = yAxes;
    }
}
