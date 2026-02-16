package IfElse;

import java.util.Scanner;

public class arerAndPerimeter {
    //Given the length and breadth of a rectangle,
    //write a program to find whether the area of the
    //rectangle is greater than its perimeter.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length ,breadth , perimeter , area ;
        System.out.print("enter the length : ");
        length = sc.nextFloat();
        System.out.print("enter the breadth : ");
        breadth = sc.nextFloat();
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        if( area == perimeter ){
            System.out.println("both the area and perimeter is equal...");
        }
        else if (area < perimeter){
            System.out.println("perimtere is bigger than area ....");
        }
        else {
            System.out.println("area is bigger than the perimeter ...");
        }
    }
}
