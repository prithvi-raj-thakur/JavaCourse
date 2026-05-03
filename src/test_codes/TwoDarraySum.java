package test_codes;

import java.util.Scanner;

public class TwoDarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows(m):");
        int m = sc.nextInt();

        System.out.print("enter the number of columns(n):");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        int sum = 0;

        System.out.print("enter the elements: ");
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        System.out.print("the sum is : "+sum);
    }
}
