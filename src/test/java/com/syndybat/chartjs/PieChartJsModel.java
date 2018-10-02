package com.syndybat.chartjs;

import com.syndybat.chartjs.pie.PieDataBean;
import com.syndybat.chartjs.pie.PieOptionsBean;
import com.vaadin.flow.templatemodel.TemplateModel;

public interface PieChartJsModel extends TemplateModel {
    void setType(String type);
    void setData(PieDataBean data);
    void setOptions(PieOptionsBean options);
}