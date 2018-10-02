package com.syndybat.chartjs;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.syndybat.chartjs.line.LineDataBean;
import com.syndybat.chartjs.line.LineOptionsBean;

public interface LineChartJsModel extends TemplateModel {
    void setType(String type);
    void setData(LineDataBean data);
    void setOptions(LineOptionsBean options);
}