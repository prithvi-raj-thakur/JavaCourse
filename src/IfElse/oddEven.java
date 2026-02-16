package IfElse;

import java.util.Scanner;

public class oddEven {
    //Take positive integer input and tell if it is even or odd...
    public static void main(String[] args) {
        int x ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to check: ");
        x= sc.nextInt();
        if(x%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
