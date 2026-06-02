package Array.TwoPointer;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array:");

        for(int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }

        int i = 0;

        for(int j = 1; j < n; j++) {

            if(arr[i] != arr[j]) {

                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println("Array after removing duplicates:");

        for(int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}