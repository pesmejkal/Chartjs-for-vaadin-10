package com.syndybat.chartjs;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;

/**
 * @author tjochec
 * @since 2018-11-07
 */

@DomEvent("click")
public class ChangeEvent extends ComponentEvent<ChartJs> {
    private String value;

    public ChangeEvent(ChartJs source, boolean fromClient) {
        super(source, fromClient);
    }

}
