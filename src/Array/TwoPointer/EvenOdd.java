package Array.TwoPointer;

import java.util.Scanner;

public class EvenOdd {

    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortEvenOdd(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            if(arr[left] % 2 == 1 && arr[right] % 2 == 0) {

                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] % 2 == 0) {
                left++;
            }

            if(arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortEvenOdd(arr);

        System.out.println("Result:");

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
