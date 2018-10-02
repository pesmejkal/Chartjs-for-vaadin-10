package com.syndybat.chartjs.bar;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;

public class BarDataBean implements Serializable{
    private List<String> labels;
    private List<BarDatasetBean> datasets;

    public BarDataBean(){}

    public BarDataBean(AbstractList<String> labels, AbstractList<BarDatasetBean> datasets) {
        this.labels = labels;
        this.datasets = datasets;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public void setDatasets(List<BarDatasetBean> datasets) {
        this.datasets = datasets;
    }

    public List<String> getLabels() {
        return labels;
    }

    public List<BarDatasetBean> getDatasets() {
        return datasets;
    }
}
