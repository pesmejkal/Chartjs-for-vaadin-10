package com.syndybat.chartjs.pie;

import java.util.ArrayList;
import java.util.List;

public class PieDataBean {
    private List<String> labels = new ArrayList();
    private List<PieDatasetBean> datasets = new ArrayList();

    public PieDataBean() {
    }

    public PieDataBean(List<String> labels, List<PieDatasetBean> datasets) {
        this.labels = labels;
        this.datasets = datasets;
    }

    public List<String> getLabels() {
        return labels;
    }

    public List<PieDatasetBean> getDatasets() {
        return datasets;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public void setDatasets(List<PieDatasetBean> datasets) {
        this.datasets = datasets;
    }
}
