package Array.Basics;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}