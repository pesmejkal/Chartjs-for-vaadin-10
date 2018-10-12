package com.syndybat.chartjs.data;

import com.syndybat.chartjs.utils.JsonBuilder;

import java.io.Serializable;
import java.util.List;


/**
 * @author michael@byteowls.com
 */
public interface Dataset<T, D> extends JsonBuilder, Serializable {

    T data(@SuppressWarnings("unchecked") D... data);

    T dataAsList(List<D> data);

    List<D> getData();

    /**
     * Add the data value with a label. This is useful if you dynamically build labels and the datasets.
     * @param label the label the data belongs to
     * @param data
     * @return
     * @see Data#extractLabelsFromDataset(boolean)
     */
    T addLabeledData(String label, D data);

    /**
     * Gets the datasets labels.
     * @return a {@link List} of labels
     */
    List<String> getDataLabels();

}
