package test_codes;

import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;

        boolean found = false;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(sum == target) {
                System.out.println("Pair Found: " +
                        arr[left] + " + " +
                        arr[right] + " = " + target);
                found = true;
                break;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        if(!found) {
            System.out.println("No Pair Found");
        }
    }
}