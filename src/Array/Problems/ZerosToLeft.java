package Array.Problems;

import java.util.Scanner;

public class ZerosToLeft {
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
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
                j++;
            }
        }
    }
}
