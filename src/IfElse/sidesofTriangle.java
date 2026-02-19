package IfElse;

import java.util.Scanner;

public class sidesofTriangle {
    //Take 3 numbers input and tell if they can be the sides of a triangle.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c ;
        System.out.print("enter the 1st side of the triangle: ");
        a=sc.nextInt();
        System.out.print("enter the 2nd side of the triangle: ");
        b=sc.nextInt();
        System.out.print("enter the 3rd side of the triangle: ");
        c=sc.nextInt();
        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.println("yes .. these are the sides of the triangle...");
        }
        else{
            System.out.println("no... these are not the sides of a triangle... ");
        }
    }
}
