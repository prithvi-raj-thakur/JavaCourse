package Number_System;

import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hexadecimal number: ");
        String hex = sc.next();

        int decimal = 0;

        for(int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int value;

            if(ch >= '0' && ch <= '9')
                value = ch - '0';
            else
                value = ch - 'A' + 10;

            decimal = decimal * 16 + value;
        }

        System.out.println("Decimal = " + decimal);
        sc.close();
    }
}