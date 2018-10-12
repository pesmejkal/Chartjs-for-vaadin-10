# ChartJS for Vaadin 10

Vaadin 10 Java integration of chartjs library

This is beta version

## Supports
almost everything what https://vaadin.com/directory/component/chartjs-add-on supports

## Does not support
chartjs callbacks

## Usage
It uses beans of above mentioned plugin to represent chart in POJO and convert it to JSON. To build these objects refer to documentation of the plugin. 
Then it is enough to pass created object implementing CartConfig to ChartJS constructor and add it to your content.

ChartJS chartJs = new ChartJS(barConfig);
add(chartJs);

## About me
I am a student at Brno University of technology.
I did this addon as an challenge and I probably will not have enough time to maintain it actively.

I am not skilled enough in this area so any advice and contribution is appreciated.

## Architecture
It was made according to vaadin documentation: creating polymer templates.

Adding new feature should be easy by extending specified Bean class which are serialized and transfered to client side so if the property is defined in beans it should work.