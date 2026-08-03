package Array.twoDarray;

import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();

        System.out.print("Columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        System.out.println("Enter matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                transpose[j][i] = matrix[i][j];

            }

        }

        System.out.println("\nTranspose:");

        for (int i = 0; i < cols; i++) {

            for (int j = 0; j < rows; j++) {

                System.out.print(transpose[i][j] + " ");

            }

            System.out.println();

        }

        sc.close();
    }
}