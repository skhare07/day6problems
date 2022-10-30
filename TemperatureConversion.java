package com.bridgelabz.day6problem;

import java.util.Scanner;

//To the Util Class add temperaturConversion static function, given the temperature
//in fahrenheit as input outputs the temperature in Celsius or viceversa using the
//formula
//Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
//Fahrenheit to Celsius: (°F − 32) x 5/9 = °C


public class TemperatureConversion {

    public static void CelToFah() {                                                  //method to convert celsius to fahrenheit
        double cel;
        double fah;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius : ");
        cel = s.nextDouble();
        fah = (cel * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit : " + fah + " °F");
    }

    public static void FahToCel() {                                              //method to convert fahrenheit to celsius
        double cel;
        double fah;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit : ");
        fah = s.nextDouble();
        cel = (fah - 32) * 5 / 9;
        System.out.println("Temperature in Celsius : " + cel + " °C");
    }


    public static void main(String[] args) {

        System.out.println("1.Celsius to Fahrenheit ");
        System.out.println("2.Fahrenheit to Celsius ");
        System.out.print("Select Option : ");

        Scanner s = new Scanner(System.in);
        int option = s.nextInt();


        if (option == 1) {                                //calling methods
            CelToFah();
        } else if (option == 2) {
            FahToCel();
        }
    }
}
