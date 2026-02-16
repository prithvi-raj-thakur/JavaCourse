package IfElse;

import java.util.Scanner;

public class digitCheck {
    //Take positive integer input and tell if it is a three digit number or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("enter the number : ");
        n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("yes... its a 3 digit number");
        }
        else{
            System.out.println("no... its not a 3 digit number");
        }
    }
}
