package Problems.Arrays;

import java.util.Scanner;

//the array is sorted
public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements: ");
        for (int i = 0; i < n ; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("the array after removing duplicate elements : ");
        RemoveDuplicate(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    static int RemoveDuplicate(int[] arr){
        int j =0 ;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
}
