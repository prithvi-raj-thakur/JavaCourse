package Array.Basics;

import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, flag = 0;
        System.out.print("Enter size: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n / 2; i++) {
            if(arr[i] != arr[n - i - 1]) {
                flag = 1;
                break;
            }
        }

        if(flag == 0)
            System.out.println("Array is Palindrome");
        else
            System.out.println("Array is NOT Palindrome");
    }
}