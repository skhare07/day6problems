package com.bridgelabz.day6problem;

import java.util.Scanner;

/*
In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:

a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
*/
public class ReverseNumber {

    public void Reversenum() {
        int reverse = 0;
        int remainder = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        System.out.println(reverse);


    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        obj.Reversenum();
    }
}
