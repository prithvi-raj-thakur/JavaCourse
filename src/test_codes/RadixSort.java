package test_codes;

import java.util.*;

public class RadixSort {

    static void countingSort(int arr[], int exp) {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[10];

        // Count occurrences of digits
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] so that it contains
        // actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy output to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int arr[]) {
        int max = arr[0];

        // Find maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // Apply counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        radixSort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
