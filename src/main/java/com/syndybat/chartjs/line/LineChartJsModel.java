package com.syndybat.chartjs.line;

import com.vaadin.flow.templatemodel.TemplateModel;

public interface LineChartJsModel extends TemplateModel {
    void setType(String type);
    void setData(LineDataBean data);
    void setOptions(LineOptionsBean options);
}