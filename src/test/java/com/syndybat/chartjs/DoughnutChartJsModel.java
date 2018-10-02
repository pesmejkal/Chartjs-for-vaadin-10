package com.syndybat.chartjs;

import com.syndybat.chartjs.doughnut.DoughnutDataBean;
import com.syndybat.chartjs.doughnut.DoughnutOptionsBean;
import com.vaadin.flow.templatemodel.TemplateModel;

public interface DoughnutChartJsModel extends TemplateModel {
    void setType(String type);
    void setData(DoughnutDataBean data);
    void setOptions(DoughnutOptionsBean options);
}