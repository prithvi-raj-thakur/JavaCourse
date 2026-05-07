package test_codes;

import java.util.Scanner;

public class MatrixTranspose2x2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] T = new int[2][2];

        System.out.println("Enter Matrix A (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                T[j][i] = A[i][j];
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }
}