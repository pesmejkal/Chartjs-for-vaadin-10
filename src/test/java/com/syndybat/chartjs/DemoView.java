package com.syndybat.chartjs;

import com.syndybat.chartjs.config.BarChartConfig;
import com.syndybat.chartjs.config.LineChartConfig;
import com.syndybat.chartjs.data.BarDataset;
import com.syndybat.chartjs.data.Dataset;
import com.syndybat.chartjs.data.LineDataset;
import com.syndybat.chartjs.options.InteractionMode;
import com.syndybat.chartjs.options.Position;
import com.syndybat.chartjs.options.scale.Axis;
import com.syndybat.chartjs.options.scale.CategoryScale;
import com.syndybat.chartjs.options.scale.LinearScale;
import com.syndybat.chartjs.utils.ColorUtils;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

@Route("")
public class DemoView extends VerticalLayout {

   /* public DemoView() {
        BarChartJs chart = new BarChartJs();
        add(chart);

        LineChartJs lineChart = new LineChartJs();
        add(lineChart);

        PieChartJs pieChartJs = new PieChartJs();
        add(pieChartJs);

        DoughnutChartJs doughnutChartJs = new DoughnutChartJs();
        add(doughnutChartJs);
    }*/

    public DemoView() {
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

        ChartJs chartJs = new ChartJs(lineConfig);
        add(chartJs);

    }
}
