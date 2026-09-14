package Problems.Arrays;

import java.util.Scanner;

public class SlidingWindow {

    // Maximum sum of subarray of size k
    static void maxSum(int[] arr, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum sum = " + maxSum);
    }

    // Print all subarrays of size k
    static void printWindows(int[] arr, int k) {
        for (int i = 0; i <= arr.length - k; i++) {
            System.out.print("Window: ");

            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + " ");
            }

            System.out.println();
        }
    }

    // Average of every window of size k
    static void average(int[] arr, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        System.out.println("Average = " + (double) windowSum / k);

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];

            System.out.println("Average = " + (double) windowSum / k);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        System.out.println("\n1. Maximum Sum");
        System.out.println("2. Print Windows");
        System.out.println("3. Window Average");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid window size");
            return;
        }

        switch (choice) {

            case 1:
                maxSum(arr, k);
                break;

            case 2:
                printWindows(arr, k);
                break;

            case 3:
                average(arr, k);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
