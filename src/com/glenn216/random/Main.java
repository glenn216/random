package com.glenn216.random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers to generate random numbers between them.");
        System.out.print("Enter the first number: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Enter the second number: ");
        num2 = Integer.parseInt(input.nextLine());
        if (!(num1 == num2)) {
            if (num1 > num2) {
                result = (int) (num2 + (Math.random() * (num1 - num2)));
            } else {
                result = (int) (num1 + (Math.random() * (num2 - num1)));
            }
            System.out.println("The random number generated between " + num1 + " and " + num2 + " is " + result + ".");
        } else {
            System.out.println("Error: " + num1 + " and " + num2 + " are equal numbers.");
        }
    }
}
