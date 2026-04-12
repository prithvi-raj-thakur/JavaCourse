package Number_System;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the binary number :");
        int binary_number = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while (binary_number != 0){
            int uni_digit = binary_number % 10;
            ans += (uni_digit * pw);
            pw *= 2;
            binary_number/= 10;
        }
        System.out.printf("the answer is %d .",ans);
    }
}
