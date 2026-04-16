package Functions;

import java.util.Scanner;

public class SumArray {
    public static int sumArray (int arr[] , int n ){
        int sum = 0;
        for (int i = 0 ; i< n ;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();

        int arr[]= new int[n];

        System.out.println("enter the elements:  ");
        for ( int i =0 ; i< n ;i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.println("sum = "+sumArray(arr,n));
    }
}
