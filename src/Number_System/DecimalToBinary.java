package Number_System;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal value: ");

        int decimal_value = sc.nextInt();
        int original = decimal_value;

        int ans = 0;
        int pw = 1;

        while (decimal_value > 0) {
            int parity = decimal_value % 2;
            ans += (parity * pw);
            decimal_value /= 2;
            pw *= 10;
        }

        System.out.printf("The binary value of %d is %d.", original, ans);
    }
}