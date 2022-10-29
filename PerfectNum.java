package com.bridgelabz.day6problem;

import java.util.Scanner;

public class PerfectNum {

    public static void Checknum() {

        System.out.println("Enter number: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        if (sum == num) {
            System.out.println(num + " is Perfect number");
        } else
            System.out.println(num + " not perfect number");
    }


    public static void main(String[] args) {
        Checknum();


    }

}
