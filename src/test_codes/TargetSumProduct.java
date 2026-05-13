package test_codes;

import java.util.Scanner;

public class TargetSumProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target sum
        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        // Input target product
        System.out.print("Enter target product: ");
        int targetProduct = sc.nextInt();

        boolean found = false;

        System.out.println("\nPairs with target sum and product:");

        // Check all pairs
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