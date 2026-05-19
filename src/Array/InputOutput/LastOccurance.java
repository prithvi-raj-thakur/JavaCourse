package Array.InputOutput;

import java.util.Scanner;

public class LastOccurance {
    // Program to find the last occurrence of element x in a given array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("enter the number to search: ");
        int x = sc.nextInt();

        int check = -1;
        for (int i = 0; i <n ; i++) {
            if(arr[i] == x )
                check = i;
        }

        if(check == -1)
            System.out.println("element not present in array...");
        else
            System.out.printf("the element %d was last found at index %d.",x,check);

        sc.close();
    }
}
