package com.syndybat.chartjs.doughnut;

import com.vaadin.flow.templatemodel.TemplateModel;

public interface DoughnutChartJsModel extends TemplateModel {
    void setType(String type);
    void setData(DoughnutDataBean data);
    void setOptions(DoughnutOptionsBean options);
}