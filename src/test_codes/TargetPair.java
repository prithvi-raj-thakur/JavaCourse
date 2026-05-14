package test_codes;

import java.util.Scanner;

public class TargetPair {

    public static void main(String[] args) {

        /*
         Write a Java program to find all pairs of elements in an array
         whose sum and product are equal to the target sum and target product.
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        System.out.print("Enter target product: ");
        int targetProduct = sc.nextInt();

        boolean found = false;

        System.out.println("\nMatching pairs are:");

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int sum = arr[i] + arr[j];
                int product = arr[i] * arr[j];

                if (sum == targetSum && product == targetProduct) {

                    System.out.println(arr[i] + " , " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No matching pair found.");
        }

        sc.close();
    }
}