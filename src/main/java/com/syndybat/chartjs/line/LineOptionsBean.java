package com.syndybat.chartjs.line;

import java.io.Serializable;

public class LineOptionsBean implements Serializable {
    private Boolean showLines;
    private Boolean spanGaps;
    /*private LinearScalesBean scales;
    private LineElementsBean elements;*/

    public LineOptionsBean() {
    }

    public LineOptionsBean(Boolean showLines, Boolean spanGaps) {
        this.showLines = showLines;
        this.spanGaps = spanGaps;
    }

    public Boolean getShowLines() {
        return showLines;
    }

    public Boolean getSpanGaps() {
        return spanGaps;
    }

    public void setShowLines(Boolean showLines) {
        this.showLines = showLines;
    }

    public void setSpanGaps(Boolean spanGaps) {
        this.spanGaps = spanGaps;
    }
}
