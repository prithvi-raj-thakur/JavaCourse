package test_codes;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        // Step 1: Count digits
        int digits = String.valueOf(num).length();

        // Step 2: Extract digits and compute power sum
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }

        // Step 3: Check condition
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}