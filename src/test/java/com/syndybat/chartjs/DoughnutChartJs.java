package com.syndybat.chartjs;

import com.syndybat.chartjs.doughnut.DoughnutChartBean;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;


@Tag("chart-js")
@HtmlImport("/html/chartjs.html")
@JavaScript("../frontend/bower_components/chart.js/dist/Chart.js")
public class DoughnutChartJs extends PolymerTemplate<DoughnutChartJsModel> {
    public DoughnutChartJs() {
        setId("pie-chart-js");

        DoughnutChartCreater doughnutChartCreater = new DoughnutChartCreater();
        DoughnutChartBean doughnutChartBean = doughnutChartCreater.getDoughnutChartBean();

        getModel().setType(doughnutChartBean.getType());
        getModel().setData(doughnutChartBean.getData());
        getModel().setOptions(doughnutChartBean.getOptions());
    }
}
