package com.syndybat.chartjs.pie;

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

    }
}
