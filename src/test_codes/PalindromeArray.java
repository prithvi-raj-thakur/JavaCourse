package test_codes;

import java.util.Scanner;

public class PalindromeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        boolean palindrome = true;

        while(left < right) {

            if(arr[left] != arr[right]) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if(palindrome) {
            System.out.println("Palindrome Array");
        }
        else {
            System.out.println("Not a Palindrome Array");
        }
    }
}
