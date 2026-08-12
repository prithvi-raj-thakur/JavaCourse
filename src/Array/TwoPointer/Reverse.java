package Array.TwoPointer;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        InputArray(arr,n,sc);
        System.out.println("the original array is : ");
        PrintArray(arr,n);
        System.out.println();
        Reverse(arr,n);
        System.out.println("the reversed array is :");
        PrintArray(arr,n);
        sc.close();
    }
    static void Reverse(int[] arr , int n ){
        int left = 0;
        int right = n-1 ;
        while(left<right){
            Swap(arr,left,right);
            left ++;
            right --;
        }
    }
    static void Swap(int[] arr , int left , int right ){
        int temp = arr [left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void PrintArray(int[] arr, int n ){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    static void InputArray(int[] arr , int n, Scanner sc){
        System.out.println("enter the array elements: ");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
    }
}
