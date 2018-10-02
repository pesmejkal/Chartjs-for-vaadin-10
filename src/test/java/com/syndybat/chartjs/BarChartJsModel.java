package com.syndybat.chartjs;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.syndybat.chartjs.bar.BarDataBean;
import com.syndybat.chartjs.bar.BarOptionsBean;
import com.syndybat.chartjs.bar.BarScaleOptionBean;

public interface BarChartJsModel extends TemplateModel {
    void setType(String type);
    void setData(BarDataBean data);
    void setOptions(BarOptionsBean options);
    void setBarScaleOption(BarScaleOptionBean barScaleOption);

}