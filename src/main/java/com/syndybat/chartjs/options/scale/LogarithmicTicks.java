package com.syndybat.chartjs.options.scale;

import com.syndybat.chartjs.utils.JUtils;
import com.syndybat.chartjs.utils.JsonBuilder;
import elemental.json.JsonObject;

/**
 * @author michael@byteowls.com
 */
public class LogarithmicTicks<T> extends Ticks<T> implements JsonBuilder {

    private static final long serialVersionUID = 3668600985274134089L;

    private Integer min;
    private Integer max;

    public LogarithmicTicks(T parent) {
        super(parent);
    }


    /**
     * User defined minimum number for the scale, overrides minimum value from data.
     */
    public LogarithmicTicks<T> min(int min) {
        this.min = min;
        return this;
    }

    /**
     * User defined maximum number for the scale, overrides maximum value from data.
     */
    public LogarithmicTicks<T> max(int max) {
        this.max = max;
        return this;
    }


    @Override
    public JsonObject buildJson() {
        JsonObject map = super.buildJson();
        JUtils.putNotNull(map, "min", min);
        JUtils.putNotNull(map, "max", max);
        return map;
    }
}
