package com.syndybat.chartjs.line;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LineDataBean implements Serializable {
    private List<String> labels = new ArrayList();
    private List<LineDatasetBean> datasets = new ArrayList();

    public LineDataBean() {
    }

    public LineDataBean(List<String> labels, List<LineDatasetBean> datasets) {
        this.labels = labels;
        this.datasets = datasets;
    }

    public List<String> getLabels() {
        return labels;
    }

    public List<LineDatasetBean> getDatasets() {
        return datasets;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public void setDatasets(List<LineDatasetBean> datasets) {
        this.datasets = datasets;
    }
}
