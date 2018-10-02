package com.syndybat.chartjs;

import com.syndybat.chartjs.pie.PieChartBean;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;


@Tag("chart-js")
@HtmlImport("/html/chartjs.html")
@JavaScript("../frontend/bower_components/chart.js/dist/Chart.js")
public class PieChartJs extends PolymerTemplate<PieChartJsModel> {
    public PieChartJs() {
        setId("pie-chart-js");

        PieChartCreater pieChartCreater = new PieChartCreater();
        PieChartBean pieChartBean = pieChartCreater.getPieChartBean();

        getModel().setType(pieChartBean.getType());
        getModel().setData(pieChartBean.getData());
        getModel().setOptions(pieChartBean.getOptions());
    }
}
