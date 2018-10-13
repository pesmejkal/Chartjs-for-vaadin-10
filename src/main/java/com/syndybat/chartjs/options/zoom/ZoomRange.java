package com.syndybat.chartjs.options.zoom;

import com.syndybat.chartjs.options.Zoom;
import com.syndybat.chartjs.utils.And;
import com.syndybat.chartjs.utils.JUtils;
import com.syndybat.chartjs.utils.JsonBuilder;
import elemental.json.Json;
import elemental.json.JsonObject;

import java.io.Serializable;

public class ZoomRange<T> extends And<Zoom<T>> implements JsonBuilder, Serializable {

    private static final long serialVersionUID = 5655614586948910546L;

    private Object x;
    private Object y;

    public ZoomRange(Zoom<T> parent) {
        super(parent);
    }

    public ZoomRange<T> x(double x) {
        this.x = x;
        return this;
    }

    public ZoomRange<T> x(String x) {
        this.x = x;
        return this;
    }

    public ZoomRange<T> y(double y) {
        this.y = y;
        return this;
    }

    public ZoomRange<T> y(String x) {
        this.x = x;
        return this;
    }


    @Override
    public JsonObject buildJson() {
        JsonObject obj = Json.createObject();
        setValue(obj, "x", x);
        setValue(obj, "y", y);
        return obj;
    }

    private void setValue(JsonObject obj, String key, Object value) {
        if (value instanceof String) {
            JUtils.putNotNull(obj, "x", (String) value);
        } else if (value instanceof Double) {
            JUtils.putNotNull(obj, "x", (Double) value);
        }
    }

}