package Problems.Arrays;

import java.util.Scanner;

public class CheckIfsorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements: ");
        for (int i = 0; i < n ; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("the array is sorted (true/false) : "+SortedCheck(arr));
    }

    static boolean SortedCheck(int[] arr ){
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < arr[i-1])
                return false;
        }
        return true;
    }
}
