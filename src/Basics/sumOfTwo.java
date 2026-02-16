package Basics;

import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x , y , sum;
        System.out.print("enter the first number: ");
        x = sc.nextInt();
        System.out.print("enter the second number: ");
        y = sc.nextInt();
        sum = x + y ;
        System.out.println("the sum is : "+sum);
    }
}
