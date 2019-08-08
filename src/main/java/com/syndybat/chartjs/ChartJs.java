package com.syndybat.chartjs;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.shared.Registration;

@Tag("chart-js")
@HtmlImport("html/chartjs.html")
@JavaScript("bower_components/moment/min/moment.min.js")
@JavaScript("bower_components/chart.js/dist/Chart.min.js")
/**
 * This class is a java wrapper for chart.js web component.
 */
public class ChartJs extends PolymerTemplate<ChartJsModel> {

    /**
     * Enables to add a listener on frontend click event.
     * This is invoked only when a dataset is clicked.
     * @param listener
     */
    public Registration addClickListener(
            ComponentEventListener<ClickEvent> listener) {
        return addListener(ClickEvent.class, listener);
    }

    /**
     * @param chart - Valid JSON representation of Chartjs chart.
     */
    public ChartJs(String chart) {
        getModel().setChartJs(chart);
    }

    /**
     * Enables to update whole chart configuration and dataset.
     * @param chart - Valid JSON representation of Chartjs chart.
     */
    public void updateChart(String chart){
        getModel().setChartJs(chart);
    }

    /**
     * Enables to update datasets.
     * @param data
     */
    public void updateData(String data){
        getModel().setChartData(data);
    }

    /**
     * Enables to update chart options.
     * @param options
     */
    public void updateOptions(String options){
        getModel().setChartOptions(options);
    }

    /**
     * This is a RPC callback invoked by client on dataset click event.
     * It raise ClickEvent.
     * @param label - chart label when having vertical chart than it is x value.
     * @param datasetLabel - dataset label usually is seen in legend.
     * @param value - value of dataset corresponds to y value in vertical chart.
     */
    @ClientCallable
    private void handleClick(String label, String datasetLabel, String value) {
        fireEvent(new ClickEvent(this, true, label, datasetLabel, value));
    }
}
