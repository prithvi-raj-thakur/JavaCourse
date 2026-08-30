package Array.Problems;

import java.util.Scanner;

public class MaximumSubarraySum {

    public static int maxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either start a new subarray or continue the current one
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find maximum subarray sum
        int result = maxSubarraySum(arr);

        // Display result
        System.out.println("Maximum Subarray Sum = " + result);

        sc.close();
    }
}
