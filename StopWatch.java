package com.bridgelabz.day6problem;

import java.util.Scanner;

public class StopWatch {

    public static double Startwatch() {
        System.out.print("Press any number & Enter to Start : ");
        Scanner s = new Scanner(System.in);
        double start = s.nextDouble();
        start = System.currentTimeMillis();  //return time in milliseconds since 1970 january 1
        System.out.println(start);
        return start;
    }

    public static double Stopwatch() {
        System.out.print("Press any number & Enter to Stop : ");
        Scanner s = new Scanner(System.in);
        double stop = s.nextDouble();
        stop = System.currentTimeMillis();

        return stop;
    }


    public static void main(String[] args) {


        double time_seconds = (Startwatch() - Stopwatch()) / 1000;
        System.out.println("Time : " + -(time_seconds));
    }

}
