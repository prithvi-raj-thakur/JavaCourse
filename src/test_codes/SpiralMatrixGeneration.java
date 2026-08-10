package test_codes;

import java.util.Scanner;

public class SpiralMatrixGeneration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input n² elements
        System.out.println("Enter " + (n * n) + " elements:");

        int[] arr = new int[n * n];

        for (int i = 0; i < n * n; i++) {
            arr[i] = sc.nextInt();
        }

        // Boundaries
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int index = 0;

        // Generate spiral matrix
        while (top <= bottom && left <= right) {

            // 1. Left → Right
            for (int j = left; j <= right; j++) {
                matrix[top][j] = arr[index++];
            }
            top++;

            // 2. Top → Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = arr[index++];
            }
            right--;

            // 3. Right → Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = arr[index++];
                }
                bottom--;
            }

            // 4. Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = arr[index++];
                }
                left++;
            }
        }

        // Print spiral matrix
        System.out.println("\nSpiral Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}