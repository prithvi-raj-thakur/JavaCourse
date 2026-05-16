package test_codes;

import java.util.Scanner;

public class CountOcc {

    public static void main(String[] args) {

        /*
         Write a Java program to count the number of
         occurrences of a given number x in an array.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int x = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println("Number of occurrences: " + count);

        sc.close();
    }
}