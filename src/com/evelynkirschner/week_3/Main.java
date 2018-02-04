package com.evelynkirschner.week_3;

import java.text.DecimalFormat;

public class Main {

    static double fahrenheitToCelsius( double fahrenheitValue ){
        double celsiusValue = 5.0/9 * ( fahrenheitValue - 32);
        return celsiusValue;
    }

    static double getFahrenheitFromUser() {
        System.out.println("Enter a temperature in Fahrenheit to be converted to Celsius (-460 or less to exit)");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String numberAsString = scanner.nextLine();
        return Double.parseDouble(numberAsString);     // Convert string to a double
    }

    static void showCelsiusFromFahrenheit( double fahrenheitValue, double celsiusValue ){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    // output format to hundredths place
        System.out.println( decimalFormat.format(fahrenheitValue) + " " + '\u00b0' + "F converts to " +
                decimalFormat.format(celsiusValue) + " " + '\u00b0' + "C" );
    }

    public static void main(String[] args) {
        double computedCelsiusValue,userFahrenheitValue;

        userFahrenheitValue = getFahrenheitFromUser();
        while (userFahrenheitValue > -460.0) {
            computedCelsiusValue = fahrenheitToCelsius( userFahrenheitValue );
            showCelsiusFromFahrenheit(userFahrenheitValue, computedCelsiusValue);
            userFahrenheitValue = getFahrenheitFromUser();
        }
    }
}

