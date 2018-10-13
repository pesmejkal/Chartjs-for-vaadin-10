package com.syndybat.chartjs;

import com.syndybat.chartjs.config.ChartConfig;
import com.syndybat.chartjs.data.Data;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

@Tag("chart-js")
@HtmlImport("/html/chartjs.html")
@JavaScript("../frontend/bower_components/chart.js/dist/Chart.js")
public class ChartJs extends PolymerTemplate<ChartJsModel> {
    public ChartJs(ChartConfig chartConfig) {
        getModel().setChartJs(chartConfig.buildJson().toJson());
    }

    public void setData(Data<?> data){
        getModel().setChartData(data.buildJson().toJson());
    }

}
