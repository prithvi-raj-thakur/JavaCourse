package IfElse;

import java.util.Scanner;

public class leapYear {
    //check its a leap year or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the year: ");
        int year = sc.nextInt();
        if (year % 400 == 0 && year % 4 == 0){
            System.out.println("its a leap year...");
        }
        else if (year % 100 == 0){
            System.out.println("not a leap year...");
        }
        else {
            System.out.println("not a leap year...");
        }
    }
}
