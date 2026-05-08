package test_codes;

import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array: ");
        int n = sc.nextInt();
         int arr [] = new int [n];
        System.out.println("enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        int left = 0 ;
        int right = arr.length - 1 ;

        System.out.println("pairs using two pointer technique: ");
        while (left < right ){
            System.out.println(arr[left] + " , " + arr[right]);
            left ++;
            right --;
        }
        if (left == right ){
            System.out.println("middle element: "+ arr[left]);
        }

    }
}
