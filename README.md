# ChartJS for Vaadin 10

Vaadin 10 Java integration of chartjs library

This is beta version

## Supports
Bar, line, pie, doughnut chart

## Does not support
options configuration

## Usage
You can extend <type>ChartJs class and added to your layout.
Refer to DemoView and other files in test directory.

## About me
I am a student at Brno University of technology.
I did this addon as an challenge and I probably will not have enough time to maintain it actively.

I am not skilled enough in this area so any advice and contribution is appreciated.

## Architecture
It was made according to vaadin documentation: creating polymer templates.

Adding new feature should be easy by extending specified Bean class which are serialized and transfered to client side so if the property is defined in beans it should work.