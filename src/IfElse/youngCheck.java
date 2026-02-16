package IfElse;

import java.util.Scanner;

public class youngCheck {
    //If the ages of Ram, Shyam and Ajay are input
    //through the keyboard, write a program to
    //determine the youngest of the three.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Ram: ");
        int ram = sc.nextInt();

        System.out.print("Enter age of Shyam: ");
        int shyam = sc.nextInt();

        System.out.print("Enter age of Ajay: ");
        int ajay = sc.nextInt();

        if (ram < shyam && ram < ajay) {
            System.out.println("Ram is the youngest.");
        }
        else if (shyam < ram && shyam < ajay) {
            System.out.println("Shyam is the youngest.");
        }
        else if (ajay < ram && ajay < shyam) {
            System.out.println("Ajay is the youngest.");
        }
        else {
            System.out.println("Two or more have the same youngest age.");
        }

        sc.close();
    }
}
