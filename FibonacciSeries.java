package com.bridgelabz.day6problem;

import java.util.Scanner;

public class FibonacciSeries {

    public void Fibseries() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range of fibonacci series : ");
        int range = s.nextInt();
        int num1 = 0, num2 = 1, num3 = 0;

        if (range == 1) {
            System.out.println(num1);
        }

        if (range >= 2) {
            System.out.print(num1 + " " + num2);

            for (int i = 2; i < range; i++) {
                num3 = num1 + num2;
                System.out.print(" " + num3);
                num1 = num2;
                num2 = num3;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        FibonacciSeries obj = new FibonacciSeries();
        obj.Fibseries();


    }
}
