package Problems.Arrays;

import java.util.Scanner;

public class ArrayReverse {
    static void Reverse(int[] arr ){
        int i = 0;
        int j = arr.length - 1 ;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        Reverse(arr);
        System.out.println("reversed array is : ");
        for (int i = 0; i < n  ; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
