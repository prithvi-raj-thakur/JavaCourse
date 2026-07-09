package test_codes;

import java.util.Scanner;

public class RemoveFirstElementNewArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newArr = new int[n - 1];

        for (int i = 1; i < n; i++) {
            newArr[i - 1] = arr[i];
        }

        System.out.println("New Array:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}