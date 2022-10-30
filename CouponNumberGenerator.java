package com.bridgelabz.day6problem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CouponNumberGenerator {

    public static void main(String[] args) {
// iterate the loop until get N distinct number
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter no of random number you want to generate ?");
        int number = s.nextInt();
        int couponCount = 0;
        int arrIndex = 0;
        int loopCount = 0;
        int[] record = new int[number];

        while (couponCount < number) {

            int random = r.nextInt(100);
            System.out.print(random + " ");


            if (!isExists(record, random)) {
                couponCount++;
                record[arrIndex] = random;
                arrIndex++;
            }
            loopCount++;

        }
        Arrays.sort(record);
        System.out.println();
        System.out.println("Total loop count : " + loopCount);
        System.out.println("Distinct coupons : " + Arrays.toString(record));
    }

    private static boolean isExists(int[] record, int random) {
        for (int i : record) {
            if (i == random) {
                return true;
            }
        }
        return false;
    }

}