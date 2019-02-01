# ChartJS for Vaadin 10+

Vaadin 10+ Java integration of [Chart.js](https://github.com/chartjs/Chart.js) library

This is **beta** version, also available in [Vaadin directory](https://vaadin.com/directory/component/chartjs).

## Instructions
Demo example source: [example](https://github.com/syndybat/Chartjs-for-vaadin-10/blob/master/src/test/java/com/syndybat/chartjs/DemoView.java)

Add this dependency to your project in order to use this addon:
```pom
<dependency>
	<groupId>com.syndybat</groupId>
	<artifactId>chartjs</artifactId>
	<version>1.1.9-Beta</version>
</dependency>
```
The demo example depends on chratjs library which builds JSON for chartjs.
You can use the same library:
```pom
<dependency>
	<groupId>be.ceau</groupId>
	<artifactId>chart</artifactId>
	<version>2.5.0</version>
</dependency>
```
or choose any other way you wish. Because this is lightway and only needs to pass correct JSON.

## Usage
You have to pass json string to ChartJS, you can use any library you want, but I recommend [Chart.java](https://github.com/mdewilde/chart).

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

Click listener example
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

## License
Licensed under the Apache License, Version 2.0. Please see [LICENSE](https://github.com/syndybat/Chartjs-for-vaadin-10/blob/master/LICENSE).
