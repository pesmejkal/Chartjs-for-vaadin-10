package com.syndybat.chartjs;

import com.vaadin.flow.templatemodel.TemplateModel;
import elemental.json.JsonObject;

public interface ChartJsModel extends TemplateModel {
    void setChartJs(String jsonChart);
}
