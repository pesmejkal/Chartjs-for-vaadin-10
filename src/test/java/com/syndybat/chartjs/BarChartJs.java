package com.syndybat.chartjs;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.syndybat.chartjs.bar.BarChartBean;
import com.syndybat.chartjs.bar.BarScaleOptionBean;


@Tag("chart-js")
@HtmlImport("/html/chartjs.html")
@JavaScript("../frontend/bower_components/chart.js/dist/Chart.js")
public class BarChartJs extends PolymerTemplate<BarChartJsModel> {
    public BarChartJs() {
        setId("bar-chart-js");

        BarChartCreater barChartCreater = new BarChartCreater();
        BarChartBean barChartBean = barChartCreater.getBarChartBean();

        getModel().setType(barChartBean.getType());
        getModel().setData(barChartBean.getData());
        getModel().setOptions(barChartBean.getOptions());
        getModel().setBarScaleOption(new BarScaleOptionBean());
    }
}
