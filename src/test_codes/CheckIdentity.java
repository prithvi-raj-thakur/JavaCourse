package test_codes;

import java.util.Scanner;

public class CheckIdentity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        boolean identity = true;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if((i == j && a[i][j] != 1) ||
                        (i != j && a[i][j] != 0)) {
                    identity = false;
                    break;
                }
            }
        }

        if(identity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");

        sc.close();
    }
}
