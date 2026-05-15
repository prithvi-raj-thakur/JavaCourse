package test_codes;

import java.util.Scanner;

public class PairSP {

    public static void main(String[] args) {

        /*
         Write a Java program to find the pair of numbers
         whose sum and product match the target values.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int s = sc.nextInt();

        System.out.print("Enter target product: ");
        int p = sc.nextInt();

        boolean flag = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if ((arr[i] + arr[j] == s) &&
                        (arr[i] * arr[j] == p)) {

                    System.out.println("Pair: " + arr[i] + " " + arr[j]);
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}