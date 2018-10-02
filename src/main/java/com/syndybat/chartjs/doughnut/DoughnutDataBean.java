package com.syndybat.chartjs.doughnut;

import java.util.ArrayList;
import java.util.List;

public class DoughnutDataBean {
    private List<String> labels = new ArrayList();
    private List<DoughnutDatasetBean> datasets = new ArrayList();

    public DoughnutDataBean() {
    }

    public DoughnutDataBean(List<String> labels, List<DoughnutDatasetBean> datasets) {
        this.labels = labels;
        this.datasets = datasets;
    }

    public List<String> getLabels() {
        return labels;
    }

    public List<DoughnutDatasetBean> getDatasets() {
        return datasets;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public void setDatasets(List<DoughnutDatasetBean> datasets) {
        this.datasets = datasets;
    }

}
