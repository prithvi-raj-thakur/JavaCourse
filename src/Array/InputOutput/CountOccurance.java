package Array.InputOutput;

import java.util.Scanner;

public class CountOccurance {
    // Program to count the number of occurrences of element x in a given array
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

        int count=0;
        int x;
        System.out.println("enter the number to check the occurance of : ");
        x = sc.nextInt();

        for (i = 0; i < n  ; i++) {
            if(arr[i]==x){
                count++;
            }
        }

        System.out.printf("%d occured %d times in the array",x,count);
    }
}
