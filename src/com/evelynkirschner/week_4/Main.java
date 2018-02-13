package com.evelynkirschner.week_4;

import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void getCitiesAndTemps( Map<String,String> cities ){
        // method to get list of cities and 5 days of average temperatures

        String cityName, cityTemps;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println( "We will be entering City Names and then the average temperature for the next 5 days.");
        System.out.println( "Enter 'End' when finished.");
        // Get the first city
        System.out.println("City: ");
        cityName = scanner.nextLine();
        while (!( cityName.toLowerCase( ).contentEquals("end") )) {
                // continue to get input until the user types "End"
            System.out.println("Enter the average temperature for the next 5 days.  Separate values with a comma");
            cityTemps = scanner.nextLine();
            // Add the values to the map.  City Name is the key and the value is the list of temperatures
            cities.put(cityName,cityTemps);

            // Get the next City
            System.out.println("City: ");
            cityName = scanner.nextLine();
        }
    }


    public static float calculateAverage( String numberList ){
        // method to calculate the average of a list of numbers
        // using String.split to split the string into an array of numbers
        String numArray[5];
        float numSum = 0;
        numArray = String.split(numberList);
        for (int i = 0; i < 5; i++){
            numSum +=  Float.parseFloat(numArray[i]);     // Convert string to a float and add it to sum
        }
        return numSum/5.0;      // Calculate the average of the 5 numbers
    }

    public static void displayAverages( ArrayList<String> cities ){
        // method to display the average temperature
        String cityTemps;

        System.out.println( "Average temperatures")
        for (String city: cities ) {
            cityTemps = "";
            System.out.println( "City: " + city + " Average Temperature: " + calculateAverage(cityTemps));

        }

    }

    public static void main(String[] args) {
        Map<String,String> cityData = new TreeMap<String,String>();
        getCities(cityData);
        getTemps(cityData);
        displayAverages(cityData);
    }
}
