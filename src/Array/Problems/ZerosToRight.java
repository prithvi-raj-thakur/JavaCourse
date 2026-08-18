package Array.Problems;

import java.util.Scanner;

public class ZerosToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        ZeroShift(arr);
        System.out.println("output: ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    static void ZeroShift(int[] arr){
        int j = arr.length -1 ;
        for (int i = arr.length - 1 ; i >= 0; i--) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
                j--;
            }
        }
    }
}
