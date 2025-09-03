package com.pm.week1.conversion;

import java.util.Scanner;

/*
 * a. Convert a temperature value from Fahrenheit to Celsius
 * 
 * b. Convert miles to kms
 * 
 * c. Convert litres to gallons
 */

public class Conversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Get temperature in Fahrenheit and convert to Celsius
		System.out.print("\nEnter temperature in fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        double celsius = fahrenheitToCelsius(fahrenheit);

        System.out.println(String.format("%.2f", fahrenheit) + "°F is " + String.format("%.2f", celsius) + "°C\n");

        // Get distance in miles and convert to kilometers
		System.out.print("Enter distance in miles: ");
        double miles = scan.nextDouble();

        double kilometers = milesToKilometers(miles);

        System.out.println(String.format("%.2f", miles) + " miles is " + String.format("%.2f", kilometers) + " kilometers\n");

        // Get volume in liters and convert to gallons
        System.out.print("\nEnter volume in liters: ");
        double liters = scan.nextDouble();

        double gallons = litersToGallons(liters);

        System.out.println(String.format("%.2f", liters) + " liters is " + String.format("%.2f", gallons) + " gallons\n");

		scan.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double milesToKilometers(double miles) {
        return  miles * 1.60934;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }
}
