package Array.twoDarray;

import java.util.Scanner;

public class InPlaceTranspose {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();

            }

        }

        // In-place transpose
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }

        System.out.println("\nTranspose:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();

        }

        sc.close();
    }
}