package com.syndybat.chartjs;

import com.syndybat.chartjs.bar.*;

import java.util.*;

public class BarChartCreater {

    BarChartBean barChartBean = new BarChartBean();

    public BarChartCreater(){
        barChartBean.setType(true);
        barChartBean.setData(initData());
        barChartBean.setOptions(initOptions());
    }

    private BarOptionsBean initOptions(){
        BarOptionsBean barOptionsBean = new BarOptionsBean();

        BarScaleOptionBean barScaleOptionBean = new BarScaleOptionBean();
        List<BarXAxesOptionBean> xAxesOptionBeans = new ArrayList<>();
        List<BarYAxesOptionBean> yAxesOptionBeans = new ArrayList<>();
        /*barScaleOptionBean.setxAxes(xAxesOptionBeans);
        barScaleOptionBean.setyAxes(yAxesOptionBeans);*/

        barOptionsBean.setScales(barScaleOptionBean);

        return barOptionsBean;
    }

    private BarDataBean initData(){
        AbstractList<BarDatasetBean> datasetBeans = new ArrayList<>();
        AbstractList<String> labels = new ArrayList<>();
        AbstractList<Double> data = new ArrayList<>();
        AbstractList<String> backgroundColor = new ArrayList<>();
        AbstractList<String> borderColor = new ArrayList<>();

        String[] aLabels = { "Blue", "Yellow", "Green", "Purple", "Orange"};
        labels.addAll(Arrays.asList(aLabels));

        Double[] aData = { 19.3, 3.0, 5.0, 2.0, 3.0};
        data.addAll(Arrays.asList(aData));

        String[] abackgroundColor = {
                "rgba(54, 162, 235, 0.2)",
                "rgba(255, 206, 86, 0.2)",
                "rgba(75, 192, 192, 0.2)",
                "rgba(153, 102, 255, 0.2)",
                "rgba(255, 159, 64, 0.2)"};
        backgroundColor.addAll(Arrays.asList(abackgroundColor));

        String[] aBorderColor = {
                "rgba(54, 162, 235, 1)",
                "rgba(255, 206, 86, 1)",
                "rgba(75, 192, 192, 1)",
                "rgba(153, 102, 255, 1)",
                "rgba(255, 159, 64, 1)"};
        borderColor.addAll(Arrays.asList(aBorderColor));

        datasetBeans.add(new BarDatasetBean("test", data, backgroundColor, borderColor));


        BarDataBean barDataBean = new BarDataBean(labels, datasetBeans);

        return  barDataBean;
    }

    public BarChartBean getBarChartBean() {
        return barChartBean;
    }
}
