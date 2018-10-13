package com.syndybat.chartjs;

import com.syndybat.chartjs.config.BarChartConfig;
import com.syndybat.chartjs.config.ChartConfig;
import com.syndybat.chartjs.config.DonutChartConfig;
import com.syndybat.chartjs.config.LineChartConfig;
import com.syndybat.chartjs.data.BarDataset;
import com.syndybat.chartjs.data.Dataset;
import com.syndybat.chartjs.data.LineDataset;
import com.syndybat.chartjs.data.PieDataset;
import com.syndybat.chartjs.options.InteractionMode;
import com.syndybat.chartjs.options.Position;
import com.syndybat.chartjs.options.scale.Axis;
import com.syndybat.chartjs.options.scale.CategoryScale;
import com.syndybat.chartjs.options.scale.DefaultScale;
import com.syndybat.chartjs.options.scale.LinearScale;
import com.syndybat.chartjs.utils.ColorUtils;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        /*setWidth("80%");
        setHeight("80%");*/
        ChartJs lineChartJs = new ChartJs(getLineChart());
        Div div1 = new Div();
        div1.setHeight("800px");
        div1.setWidth("800px");
        div1.add(lineChartJs);
        add(div1);

        ChartJs barChartJs = new ChartJs(getBarChart());
        Div div2 = new Div();
        div2.setHeight("800px");
        div2.setWidth("800px");
        div2.add(barChartJs);
        add(div2);

        ChartJs doughnutChartJs = new ChartJs(getDoughnutChart());
        Div div3 = new Div();
        div3.setHeight("800px");
        div3.setWidth("800px");
        div3.add(doughnutChartJs);
        add(div3);
    }

    private ChartConfig getLineChart(){
        LineChartConfig lineConfig = new LineChartConfig();
        lineConfig.data()
                .labels("January", "February", "March", "April", "May", "June", "July")
                .addDataset(new LineDataset().label("My First dataset").fill(false))
                .addDataset(new LineDataset().label("My Second dataset").fill(false))
                .addDataset(new LineDataset().label("Hidden dataset").hidden(true))
                .and()
                .options()
                .responsive(true)
                .title()
                .display(true)
                .text("Chart.js Line Chart")
                .and()
                .tooltips()
                .mode(InteractionMode.INDEX)
                .intersect(false)
                .and()
                .hover()
                .mode(InteractionMode.NEAREST)
                .intersect(true)
                .and()
                .scales()
                .add(Axis.X, new CategoryScale()
                        .display(true)
                        .scaleLabel()
                        .display(true)
                        .labelString("Month")
                        .and()
                        .position(Position.TOP))
                .add(Axis.Y, new LinearScale()
                        .display(true)
                        .scaleLabel()
                        .display(true)
                        .labelString("Value")
                        .and()
                        .ticks()
                        .suggestedMin(-10)
                        .suggestedMax(250)
                        .and()
                        .position(Position.RIGHT))
                .and()
                .done();

        // add random data for demo
        List<String> labels = lineConfig.data().getLabels();
        for (Dataset<?, ?> ds : lineConfig.data().getDatasets()) {
            LineDataset lds = (LineDataset) ds;
            List<Double> data = new ArrayList<>();
            for (int i = 0; i < labels.size(); i++) {
                data.add((double) Math.round(Math.random() * 100));
            }
            lds.dataAsList(data);
            lds.borderColor(ColorUtils.randomColor(0.3));
            lds.backgroundColor(ColorUtils.randomColor(0.5));
        }
        return lineConfig;
    }

    private ChartConfig getBarChart(){
        BarChartConfig config = new BarChartConfig();
        config.data()
                .labels("January", "February", "March", "April", "May", "June", "July")
                .addDataset(new BarDataset()
                        .label("Dataset 1")
                        .backgroundColor("red")
                        .stack("Stack 0"))
                .addDataset(new BarDataset()
                        .label("Dataset 2")
                        .backgroundColor("blue")
                        .stack("Stack 0"))
                .addDataset(new BarDataset()
                        .label("Dataset 3")
                        .backgroundColor("green")
                        .stack("Stack 1"))
                .and()
                .options()
                .responsive(true)
                .title()
                .display(true)
                .text("Chart.js Bar Chart - Stacked and Grouped")
                .and()
                .tooltips()
                .mode(InteractionMode.INDEX)
                .intersect(false)
                .and()
                .scales()
                .add(Axis.X, new DefaultScale()
                        .stacked(true))
                .add(Axis.Y, new DefaultScale()
                        .stacked(true))
                .and()
                .done();

        // add random data for demo
        List<String> labels = config.data().getLabels();
        for (Dataset<?, ?> ds : config.data().getDatasets()) {
            BarDataset lds = (BarDataset) ds;
            List<Double> data = new ArrayList<>();
            for (int i = 0; i < labels.size(); i++) {
                data.add((double) (Math.random() > 0.5 ? 1.0 : -1.0) * Math.round(Math.random() * 100));
            }
            lds.dataAsList(data);
        }

        return config;
    }

    private ChartConfig getDoughnutChart(){
        DonutChartConfig config = new DonutChartConfig();
        config
                .data()
                .labels("Red", "Green", "Yellow", "Grey", "Dark Grey")
                .addDataset(new PieDataset().label("Dataset 1"))
                .addDataset(new PieDataset().label("Dataset 2"))
                .addDataset(new PieDataset().label("Dataset 3"))
                .and();

        config.
                options()
                .responsive(true)
                .title()
                .display(true)
                .text("Chart.js Doughnut Chart")
                .and()
                .animation()
                .animateScale(true)
                .animateRotate(true)
                .and()
                .done();

        String[] colors = new String[] {"#F7464A", "#46BFBD", "#FDB45C", "#949FB1", "#4D5360"};

        List<String> labels = config.data().getLabels();
        for (Dataset<?, ?> ds : config.data().getDatasets()) {
            PieDataset lds = (PieDataset) ds;
            lds.backgroundColor(colors);
            List<Double> data = new ArrayList<>();
            for (int i = 0; i < labels.size(); i++) {
                data.add((double) (Math.round(Math.random() * 100)));
            }
            lds.dataAsList(data);
        }

        return config;
    }
}
