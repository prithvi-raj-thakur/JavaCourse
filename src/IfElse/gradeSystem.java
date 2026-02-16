package IfElse;

import java.util.Scanner;

public class gradeSystem {
    //Take input percentage of a student and print the Grade according to marks:
    //1) 90-100 Excellent
    //2) 80-90 Very Good
    //3) 70-80 Good
    //4) 60-70 Can do better
    //5) 50-60 Average
    //6) 40-50 Below Average
    //7) <40 Fail
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Excellent");
        }
        else if (percentage >= 80 && percentage < 90) {
            System.out.println("Very Good");
        }
        else if (percentage >= 70 && percentage < 80) {
            System.out.println("Good");
        }
        else if (percentage >= 60 && percentage < 70) {
            System.out.println("Can do better");
        }
        else if (percentage >= 50 && percentage < 60) {
            System.out.println("Average");
        }
        else if (percentage >= 40 && percentage < 50) {
            System.out.println("Below Average");
        }
        else if (percentage >= 0 && percentage < 40) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid Percentage");
        }
        sc.close();
    }
}
