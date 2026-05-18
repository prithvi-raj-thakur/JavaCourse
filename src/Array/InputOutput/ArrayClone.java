package Array.InputOutput;

import java.util.Scanner;

public class ArrayClone {
    // Program to clone an array in Java
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

        int[] arrClone = new int[n];
        for ( i = 0 ; i<n ; i++){
            arrClone[i]= arr[i];
        }

        System.out.println("the elements of clone array are: ");
        for(i=0 ; i<n ; i++){
            System.out.print(arrClone[i]+" ");
        }
    }
}
