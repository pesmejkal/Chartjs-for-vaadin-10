package com.syndybat.chartjs.pie;

import com.vaadin.flow.templatemodel.TemplateModel;

public interface PieChartJsModel extends TemplateModel {
    void setType(String type);
    void setData(PieDataBean data);
    void setOptions(PieOptionsBean options);
}