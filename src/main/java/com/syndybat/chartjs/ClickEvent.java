package com.syndybat.chartjs;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * @author Tomáš Jochec
 * @since 2018-11-07
 */

@DomEvent("click")
public class ClickEvent extends ComponentEvent<ChartJs> {
    private String label;
    private String value;

     public ClickEvent(ChartJs source, boolean fromClient) {
        super(source, fromClient);

        this.label = source.getLabel();
        this.value = source.getValue();
    }

    public String getLabel() {
        return label;
    }
    public String getValue() {
        return value;
    }
}
