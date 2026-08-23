package Problems.Arrays;

import java.util.Scanner;

public class RightRotationBy1 {
    static void RightRotation(int[] arr ){
        int last = arr[arr.length - 1];
        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
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
        RightRotation(arr);
        for (int i = 0; i <n  ; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
