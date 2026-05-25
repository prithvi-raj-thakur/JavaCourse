package Array.TargetSum;

import java.util.Scanner;

public class UniqueElementsByArrayManipulation {

    static void inputArray ( int[] arr , int n ,Scanner sc){
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void FindUnique(int[] arr , int n ){
        for (int i = 0; i < n ; i++) {
            if(arr[i] == -1)
                continue;
            for (int j = i+1; j < n ; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        System.out.println("unique elements are : ");
        for (int i = 0; i < n ; i++) {
            if(arr[i] > 0)
                System.out.println(arr[i]+"  ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        inputArray(arr , n, sc);
        FindUnique(arr,n);
        sc.close();
    }
}
