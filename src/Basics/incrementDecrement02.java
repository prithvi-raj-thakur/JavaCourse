package Basics;

import java.util.Scanner;

public class incrementDecrement02 {
    public static void main(String[] args) {
        int x ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        x=sc.nextInt();
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        //x++ : use x and then increment...
        //++x : increment x and then use...
    }
}
