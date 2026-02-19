package IfElse;

import java.util.Scanner;

public class StraightLineCheck {
    //Given three points (x1, y1), (x2, y2) and
    //(x3, y3), write a program to check if all the three
    //points fall on one straight line.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1 , x2 ,x3, y1 , y2, y3, m1 ,m2;
        System.out.print("enter the value of x1: ");
        x1 = sc.nextFloat();
        System.out.print("enter the value of y1: ");
        y1 = sc.nextFloat();
        System.out.print("enter the value of x2: ");
        x2 = sc.nextFloat();
        System.out.println("enter the value of y2: ");
        y2 = sc.nextFloat();
        System.out.println("enter the value of x3: ");
        x3 = sc.nextFloat();
        System.out.println("enter the value of y3: ");
        y3 = sc.nextFloat();
        m1 = (y2-y1)/(x2-x1);
        m2 = (y3-y2)/(x3-x2);
        if(m1 == m2 ){
            System.out.println("all three points orm a straight line...");
        }
        else{
            System.out.println("no... they do not form a straight line...");
        }
    }
}
