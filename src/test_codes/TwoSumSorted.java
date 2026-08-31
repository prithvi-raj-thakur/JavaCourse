package test_codes;

import java.util.*;

public class TwoSumSorted {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 8, 9, 14};
        int target = 13;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair: " + arr[left] + ", " + arr[right]);
                return;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println("No pair found");
    }
}
