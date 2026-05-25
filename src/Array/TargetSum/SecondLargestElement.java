package Array.TargetSum;

import java.util.Scanner;

public class SecondLargestElement {
    static void inputArray (int[] arr , int n , Scanner sc){
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void SecondLargest(int[] arr , int n ){
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < n ; i++) {
            if(arr[i] > largest)
                largest = arr[i];
        }
        for (int i = 0; i < n ; i++) {
            if(arr[i]> secondLargest && arr[i] != largest)
                secondLargest=arr[i];
        }
        System.out.println("the second largest element is "+secondLargest);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        inputArray(arr , n, sc);
        SecondLargest(arr,n);
        sc.close();
    }
}
