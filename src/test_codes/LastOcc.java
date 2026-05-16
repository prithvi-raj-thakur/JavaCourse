package test_codes;

import java.util.Scanner;

public class LastOcc {

    public static void main(String[] args) {

        /*
         Write a Java program to find the last occurrence
         of an element x in a given array entered by the user.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int lastIndex = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] == x) {
                lastIndex = i;
            }
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence at index: " + lastIndex);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}