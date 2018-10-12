package com.syndybat.chartjs.options.types;

import com.syndybat.chartjs.config.ChartConfig;
import com.syndybat.chartjs.options.AbstractOptions;
import com.syndybat.chartjs.options.scale.RadialLinearScale;
import com.syndybat.chartjs.utils.JUtils;
import elemental.json.JsonObject;

public class RadarChartOptions extends AbstractOptions<RadarChartOptions> {

    private static final long serialVersionUID = -4046074534117345099L;

    private RadialLinearScale scale;
    private Double offsetAngle;

    public RadarChartOptions(ChartConfig chartConfig) {
        super(chartConfig);
    }

    public RadarChartOptions scale(RadialLinearScale scale) {
        this.scale = scale;
        return this;
    }

    public RadarChartOptions offsetAngle(double offsetAngle) {
        this.offsetAngle = offsetAngle;
        return this;
    }

    @Override
    public JsonObject buildJson() {
        JsonObject map = super.buildJson();
        JUtils.putNotNull(map, "scale", scale);
        JUtils.putNotNull(map, "offsetAngle", offsetAngle);
        return map;
    }

    @Override
    public RadarChartOptions getThis() {
        return this;
    }

}
