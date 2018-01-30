package com.evelynkirschner.week_2;

public class Main {
    public static void main(String[] args) {

        int highTemperature[] = {45, 29, 10, 22, 41, 28, 33};
        int precipitationProbability[] = {95, 60, 25, 5, 0, 75, 90};
        String weekDay[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        boolean first = true;   // To indicate if it will snow on any days

        for (int day = 0; day < highTemperature.length; day++) {
            if ( highTemperature[day] <= 32 && precipitationProbability[ day ] > 50 ) {
                if (first) {
                    System.out.println( "These are the days that it will snow:");
                    first = false;
                }
                System.out.println( weekDay[ day]);
            }
        }
        if (first)
            System.out.println( "It won't snow this week");
    }
}
