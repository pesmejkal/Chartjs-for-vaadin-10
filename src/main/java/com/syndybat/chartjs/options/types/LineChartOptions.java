package com.syndybat.chartjs.options.types;

import com.syndybat.chartjs.config.ChartConfig;
import com.syndybat.chartjs.options.AbstractScalableOptions;
import com.syndybat.chartjs.utils.JUtils;
import elemental.json.JsonObject;

public class LineChartOptions extends AbstractScalableOptions<LineChartOptions> {

    private static final long serialVersionUID = -5830320660361399534L;

    private Boolean showLines;

    public LineChartOptions(ChartConfig chartConfig) {
        super(chartConfig);
    }

    public LineChartOptions showLines(boolean showLines) {
        this.showLines = showLines;
        return this;
    }

    @Override
    public JsonObject buildJson() {
        JsonObject map = super.buildJson();
        JUtils.putNotNull(map, "showLines", showLines);
        return map;
    }

    @Override
    public LineChartOptions getThis() {
        return this;
    }

}
