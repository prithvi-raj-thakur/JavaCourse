package IfElse;

import java.util.Scanner;

public class absoluteFunction {
    //Take integer input and print the absolute value of that integer
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("enter the number : ");
        num = sc.nextInt();
        if(num < 0 ){
            num = -1 * num ;
        }
        System.out.printf("the absolute value is %d .",num);
    }
}
