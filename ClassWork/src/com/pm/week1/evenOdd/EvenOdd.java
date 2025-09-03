package com.pm.week1.evenOdd;

import java.util.Scanner;


public class EvenOdd {

    /*
     * Program to check if the number by user is even or odd.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int number = scan.nextInt();

        if (number % 2 == 0) System.out.println(number + " is even.\n");
        else System.out.println(number + " is odd.\n");

        scan.close();
    }
}
