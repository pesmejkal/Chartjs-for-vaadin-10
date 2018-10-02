package com.syndybat.chartjs;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        BarChartJs chart = new BarChartJs();
        add(chart);

        LineChartJs lineChart = new LineChartJs();
        add(lineChart);

        PieChartJs pieChartJs = new PieChartJs();
        add(pieChartJs);

        DoughnutChartJs doughnutChartJs = new DoughnutChartJs();
        add(doughnutChartJs);
    }
}
