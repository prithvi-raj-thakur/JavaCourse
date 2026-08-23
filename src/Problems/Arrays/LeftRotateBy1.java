package Problems.Arrays;

import java.util.Scanner;

public class LeftRotateBy1 {

    static void LeftRotate(int[] arr){
        int first = arr[0];
        for (int i = 0; i < arr.length -1  ; i++) {
            arr[i] = arr [i+1];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("after left rotation the array is : ");
        LeftRotate(arr);
        for (int i = 0; i <n  ; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
