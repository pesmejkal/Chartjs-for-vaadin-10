package com.syndybat.chartjs;

import com.vaadin.flow.component.ComponentEvent;

/**
 * @author Tomáš Jochec
 * @since 2018-11-07
 */

public class ClickEvent extends ComponentEvent<ChartJs> {
    private String label;
    private String value;

     public ClickEvent(ChartJs source, boolean fromClient, String label, String value) {
        super(source, fromClient);

        this.label = label;
        this.value = value;
    }

    /**
     * @return Dataset label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @return Dataset value
     */
    public String getValue() {
        return value;
    }
}
