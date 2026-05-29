package Array.TwoPointer;

import java.util.Scanner;

public class SortZeroAndOnesTwoPointers {

    static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void Sort(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left<right) {
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0)
                left++;
            if (arr[right]==1)
                right--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements: ");
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        Sort(arr);
        System.out.println("the sorted array is :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
