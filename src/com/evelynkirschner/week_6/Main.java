package com.evelynkirschner.week_6;

import java.util.Scanner;

class UserInput{
    // class field
    private static Scanner scanner = new Scanner(System.in);

    public static String promptString(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        String userString = "";
        boolean isString = false;
        while (!isString) {
            // if the string is empty, then ask for another
            if ( userInput.equals("") )
            {
                System.out.println("You must enter a non-empty string.");
                System.out.println(message);
                userInput = scanner.nextLine();
            }
            else
            {
                userString = userInput;
                isString = true;
            }
        }
        return userString;
    }

    public static int promptInt(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. ");
                System.out.println(message);
                userInput = scanner.nextLine();
            }
        }
        return userInt;
    }

    public static double promptDouble(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        double userDouble = 0.0;
        boolean isDbl = false;
        while (!isDbl) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDbl = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. ");
                System.out.println(message);
                userInput = scanner.nextLine();
            }
        }
        return userDouble;
    }

}

public class Main {

    public static void main(String[] args)
    {
        System.out.println("You entered the integer: " + UserInput.promptInt("Enter an integer:"));
        System.out.println("You entered the double: " + UserInput.promptDouble("Enter a double:"));
        System.out.println("You entered the string: " + UserInput.promptString("Enter a string:"));
    }

}
