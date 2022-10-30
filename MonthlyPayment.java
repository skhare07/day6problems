package com.bridgelabz.day6problem;
import java.util.Scanner;

//Write a Util Static Function to calculate monthlyPayment that reads in three
//command-line arguments P, Y, and R and calculates the monthly payments you
//would have to make over Y years to pay off a P principal loan amount at R per cent
//interest compounded monthly. The formula is The formula is
//        n = 12 * Y
//        r = R / (12 * 100)
//        payment = (P * r) / 1 - Math.pow((1 + r), (-n))

public class MonthlyPayment {

    public static void Monthlypay() {
        double P , R , Y , n, r, payment ;          //local variables

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Principal :");
        P = s.nextDouble();
        System.out.println("Enter Interest Percent :");
        R = s.nextDouble();
        System.out.println("Enter Years :");
        Y = s.nextDouble();

        n = 12 * Y;                  //Formulae

        r = R / (12 * 100);

        payment = (P * r) / (1 - Math.pow((1 + r), (-n)));

        System.out.print("Monthly Payment : " + payment);

    }

    public static void main(String[] args) {
        Monthlypay();                         //calling methods
    }
}
