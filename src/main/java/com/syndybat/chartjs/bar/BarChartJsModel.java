package com.syndybat.chartjs.bar;

import com.vaadin.flow.templatemodel.TemplateModel;

public interface BarChartJsModel extends TemplateModel {
    void setType(String type);
    void setData(BarDataBean data);
    void setOptions(BarOptionsBean options);
    void setBarScaleOption(BarScaleOptionBean barScaleOption);

}