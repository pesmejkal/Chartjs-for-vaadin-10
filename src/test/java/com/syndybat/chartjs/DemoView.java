package com.syndybat.chartjs;

import be.ceau.chart.options.scales.BarScale;
import be.ceau.chart.options.scales.XAxis;
import be.ceau.chart.options.scales.YAxis;
import be.ceau.chart.options.ticks.LinearTicks;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.notification.Notification;
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
        add(wrapToDiv(getBarChart()));
        add(wrapToDiv(getStackedBarChart()));
    }

    private ChartJs getStackedBarChart()
    {
        BarScale scale = new BarScale()
                .addxAxes(new XAxis<LinearTicks>().setStacked(true))
                .addyAxes(new YAxis<LinearTicks>().setStacked(true));

        BarOptions options = new BarOptions();
        options.setResponsive(true).setScales(scale);

        BarData barData = new BarData();
        barData.setLabels("First", "Second", "Last");
        barData.addDataset(new BarDataset().addBackgroundColor(Color.BLUE).setLabel("lion").addData(1).addData(2).addData(3));
        barData.addDataset(new BarDataset().addBackgroundColor(Color.DARK_GREEN).setLabel("soldier").addData(11).addData(21).addData(30));
        barData.addDataset(new BarDataset().addBackgroundColor(Color.BLACK).setLabel("home").addData(20).addData(40).addData(20));
        BarChart barChart = new BarChart(barData, options).setHorizontal();

        ChartJs chart = new ChartJs(barChart.toJson());

        chart.addClickListener(new ComponentEventListener<ClickEvent>()
        {
            @Override
            public void onComponentEvent(ClickEvent clickEvent)
            {
                Notification.show(String.format("%s : %s : %s", clickEvent.getLabel(), clickEvent.getDatasetLabel(), clickEvent.getValue()),
                        3000, Notification.Position.TOP_CENTER);
            }
        });

        return chart;
    }

    private Div wrapToDiv(ChartJs barChartJs)
    {
        Div div = new Div();
        div.add(barChartJs);
        div.setWidth("800px");
        return div;
    }


    private ChartJs getBarChart(){
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

        return new ChartJs(new BarChart(data,barOptions).toJson());
    }
}
