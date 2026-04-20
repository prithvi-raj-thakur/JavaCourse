package Number_System;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        String octal = "";

        while(num > 0) {
            int rem = num % 8;
            octal = rem + octal;
            num /= 8;
        }

        System.out.println("Octal = " + octal);
        sc.close();
    }
}