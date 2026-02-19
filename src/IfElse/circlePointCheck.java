package IfElse;

import java.util.Scanner;

public class circlePointCheck {
    //Given the coordinates (x, y) of a center of a
    //circle and its radius, write a program which will
    //determine whether a point lies inside the circle, on
    //the circle or outside the circle.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, r;

        System.out.print("Enter center x coordinate: ");
        x = sc.nextInt();

        System.out.print("Enter center y coordinate: ");
        y = sc.nextInt();

        System.out.print("Enter radius: ");
        r = sc.nextInt();

        int x1, y1;

        System.out.print("Enter point x coordinate: ");
        x1 = sc.nextInt();

        System.out.print("Enter point y coordinate: ");
        y1 = sc.nextInt();

        int d = ((x1 - x) * (x1 - x)) + ((y1 - y) * (y1 - y));

        int rSquare = r * r;

        if (d > rSquare) {
            System.out.println("Point is outside the circle.");
        }
        else if (d == rSquare) {
            System.out.println("Point lies on the circumference.");
        }
        else {
            System.out.println("Point is inside the circle.");
        }

        sc.close();
    }
}
