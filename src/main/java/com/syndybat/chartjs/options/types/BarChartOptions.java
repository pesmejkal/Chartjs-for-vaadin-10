package com.syndybat.chartjs.options.types;

import com.syndybat.chartjs.config.ChartConfig;
import com.syndybat.chartjs.options.AbstractScalableOptions;

public class BarChartOptions extends AbstractScalableOptions<BarChartOptions> {

    private static final long serialVersionUID = 6873332861426634973L;

    public BarChartOptions(ChartConfig chartConfig) {
        super(chartConfig);
    }

    @Override
    public BarChartOptions getThis() {
        return this;
    }

}
