package Array.InputOutput;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("enter the size of the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        int i ;

        System.out.print("enter the elements of the array; ");
        for ( i = 0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("the elements of array are: ");
        for(i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
