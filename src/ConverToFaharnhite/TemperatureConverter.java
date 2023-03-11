package ConverToFaharnhite;

import java.util.Scanner;

public class TemperatureConverter {
    private double temperatureInCelsius;
    private static final double CONVERSION_FACTOR = 1.8;

    public TemperatureConverter(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public double convertToFahrenheit() {
        double temperatureInFahrenheit = temperatureInCelsius * CONVERSION_FACTOR + 32;
        return temperatureInFahrenheit;
    }

    public static void main(String[] args) {

        Scanner readTemp =  new Scanner(System.in);
        System.out.println("enter the temprature");
        TemperatureConverter temConuntObject = new TemperatureConverter(readTemp.nextInt());
        double temperatureInFahrenheit = temConuntObject.convertToFahrenheit();
        System.out.println("Temperature in Fahrenheit: " + temperatureInFahrenheit);
    }
}
