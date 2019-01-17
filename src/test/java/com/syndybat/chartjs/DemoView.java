package com.syndybat.chartjs;

import org.apache.commons.lang3.StringUtils;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import be.ceau.chart.BarChart;
import be.ceau.chart.color.Color;
import be.ceau.chart.data.BarData;
import be.ceau.chart.dataset.BarDataset;
import be.ceau.chart.javascript.JavaScriptFunction;
import be.ceau.chart.options.BarOptions;
import be.ceau.chart.options.Legend;
import be.ceau.chart.options.Title;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {

        ChartJs barChartJs = new ChartJs(getBarChart());
        Div div2 = new Div();
        div2.add(barChartJs);
        div2.setHeight("800px");
        div2.setWidth("800px");
        add(div2);

    }

    private String getBarChart(){
        BarDataset dataset = new BarDataset()
                .setLabel("sample chart")
                .setData(65, 59, 80, 81, 56, 55, 40)
                .addBackgroundColors(Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.GRAY, Color.BLACK)
                .setBorderWidth(2);

        BarData data = new BarData()
                .addLabels("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
                .addDataset(dataset);

        JavaScriptFunction label = new JavaScriptFunction(
                "\"function(chart) {console.log('test legend');}\""
        );

        BarOptions barOptions = new BarOptions()
                .setResponsive(true)
                .setTitle(new Title().setText("test"))
                .setLegend(new Legend().setDisplay(true)
                        .setOnClick(label));

        System.out.printf(new BarChart(data,barOptions).toJson());
        System.out.printf(StringUtils.deleteWhitespace(new BarChart(data,barOptions).toJson()));
        return new BarChart(data,barOptions).toJson();
    }


}
