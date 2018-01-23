package com.evelynkirschner.week_1;

public class Main {

    public static void main(String[] args) {
	    String city_name = "Columbus";
	    int zipcode = 43215;
	    int[] HighTemp = {54,19,19,30,12};
	    float AverageHigh = 0;

	    for (int i = 0; i < HighTemp.length; i++){
	        AverageHigh += HighTemp[i];
        }
        AverageHigh /= HighTemp.length;

	    System.out.println("City: " + city_name);
	    System.out.println("Zip Code: " + zipcode);
	    System.out.println("Average High Temperature: " + AverageHigh);
    }
}