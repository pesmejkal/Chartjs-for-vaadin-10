package com.syndybat.chartjs;

import com.vaadin.flow.templatemodel.TemplateModel;

public interface ChartJsModel extends TemplateModel {
    void setChartJs(String jsonChart);
    void setChartData(String jsonChartData);
}
