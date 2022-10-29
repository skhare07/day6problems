package com.bridgelabz.day6problem;
import java.util.Scanner;

// Program to print prime number  .

public class PrimeNumbers {

    public void Primecheck()
    {
        int primecount = 0;
        int number = 1;
        System.out.println("Enter Range");
        Scanner s= new Scanner(System.in);
        int range = s.nextInt();


        System.out.println("First "+range+" prime numbers : ");
        while (primecount < range) {
            int factorcount = 0;

            for (int i=1; i<=number; i++) {

                if (number % i == 0) {
                    factorcount++;
                }

            }
            if (factorcount == 2) {
                primecount++;
                System.out.println(number);

            }
                number++;
        }


    }

    public static void main(String[] args) {
    PrimeNumbers obj = new PrimeNumbers();
    obj.Primecheck();

    }
}

