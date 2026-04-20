package Number_System;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter octal number: ");
        int num = sc.nextInt();

        int decimal = 0, base = 1;

        while(num > 0) {
            int lastDigit = num % 10;
            decimal += lastDigit * base;
            base *= 8;
            num /= 10;
        }

        System.out.println("Decimal = " + decimal);
        sc.close();
    }
}