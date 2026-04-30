package Array.Basics;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (range 1 to n): ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        int missing = totalSum - arraySum;

        System.out.println("Missing number is: " + missing);
    }
}