package IfElse;

import java.util.Scanner;

public class divisibleCheck {
    //Write a Java program to take a positive integer as input from the user and
    // check whether it is divisible by 5 but not divisible by 3.
    // If the condition is satisfied, print an appropriate message.
    // Otherwise, print that the condition is not satisfied.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 5 == 0 && num % 3 != 0) {
                System.out.println("The number is divisible by 5 but not by 3.");
            } else {
                System.out.println("Condition not satisfied.");
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
