package test_codes;

import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        // Input matrix elements
        System.out.println("Enter elements of 3x3 Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isIdentity = true;

        // Check Identity Matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // Diagonal elements should be 1
                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                }

                // Non-diagonal elements should be 0
                if (i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                }
            }
        }

        // Output
        if (isIdentity) {
            System.out.println("It is an Identity Matrix.");
        } else {
            System.out.println("It is NOT an Identity Matrix.");
        }

        sc.close();
    }
}