package Array.twoDarray;

import java.util.Scanner;

public class InPlaceTransposeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();

        System.out.print("Columns: ");
        int cols = sc.nextInt();

        if (rows != cols) {
            System.out.println("In-place transpose is not possible because the matrix is not square.");
            return;
        }

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < rows; i++) {

            for (int j = i + 1; j < cols; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }

        System.out.println("\nTranspose:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();

        }

        sc.close();
    }
}
