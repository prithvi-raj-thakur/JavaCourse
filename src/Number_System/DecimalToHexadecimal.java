package Number_System;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        String hex = "";
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(num > 0) {
            int rem = num % 16;
            hex = hexChars[rem] + hex;
            num /= 16;
        }

        System.out.println("Hexadecimal = " + hex);
        sc.close();
    }
}