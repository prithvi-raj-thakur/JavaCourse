package Array.Manupulation;

import java.util.Scanner;

public class SwapSingleLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b - (b = a);

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}