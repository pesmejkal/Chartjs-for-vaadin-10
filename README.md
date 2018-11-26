# ChartJS for Vaadin 10+

Vaadin 10+ Java integration of chartjs library

This is beta version

## Usage
You have to pass json string to ChartJS, you can use any library you want, but I recommend [Chart java](https://github.com/mdewilde/chart).

```java
ChartJS chartJs = new ChartJS(barConfig.buildJson().toJson());
add(chartJs);
```

It supports callbacks such as legend onClick, tooltips label... 
**The json string has to be valid JSON**. If not it will not convert on client side to object.
Javascript function has to be escaped with double quotes.
```java
ChartJS chartJs = new ChartJS(barConfig.buildJson().toJson());
add(chartJs);
```

Click listener
```java
ChartJS chartJs = new ChartJS(barConfig.buildJson().toJson());
chartJs.addClickListener(event -> {
    System.out.println(event.getLabel() + " = " + event.getValue());
});
```

## About me
I am a student at Brno University of technology.
I did this addon as an challenge and because we need it at work.

I am not skilled enough in this area so any advice and contribution is appreciated.

## Architecture
It was made according to vaadin documentation: creating polymer templates.