package Array.TwoPointer;

import java.util.Scanner;

public class SortZeroOne {

    static void sortZeroesAndOnes(int[] arr) {

        int countZeroes = 0;

        // count zeroes
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                countZeroes++;
            }
        }

        // fill zeroes
        for(int i = 0; i < countZeroes; i++) {
            arr[i] = 0;
        }

        // fill ones
        for(int i = countZeroes; i < arr.length; i++) {
            arr[i] = 1;
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

        sortZeroesAndOnes(arr);

        System.out.println("Sorted Array:");

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
