package com.bridgelabz.day6problem;

import java.util.Scanner;

//To the Util Class add dayOfWeek static function that takes a date as input and
//prints the day of the week that date falls on. Your program should take three
//command-line arguments: m (month), d (day), and y (year). For m use 1 for January,
//2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for
//Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where
/// denotes integer division):
//y0 = y − (14 − m) / 12
//x = y0 + y0/4 − y0/100 + y0/400
//m0 = m + 12 × ((14 − m) / 12) − 2
//d0 = (d + x + 31m0 /12) mod 7


public class DayOfWeek {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);                                     //Taking Inputs
        System.out.println("Enter month(1 for Jan, 2 for Feb and so on) : ");
        int m=s.nextInt();
        System.out.println("Enter date : ");
        int d=s.nextInt();
        System.out.println("Enter year : ");
        int y=s.nextInt();


//Formulae
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        System.out.println("day is " + d0);

        switch (d0) {                                           //Switching options
            case 0:
                 System.out.println("sunday");
                 break;
            case 1 :
                System.out.println("monday");
                break;

            case 2 :
                System.out.println("tuesday");
                break;

            case 3 :
                System.out.println("wednesday");
                break;

            case 4 :
                System.out.println("thursday");
                break;

            case 5 :
                System.out.println("friday");
                break;

            case 6 :
                System.out.println("saturday");
                break;

            default :
                System.out.println("invalid day or answer");

        }
    }
}
