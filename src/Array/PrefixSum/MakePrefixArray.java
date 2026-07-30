package Array.PrefixSum;

import java.util.Scanner;

public class MakePrefixArray {

    static int[] makePrefixSumArray(int [] arr){
        int n = arr.length;
        int[] pref = new int [n];
        pref[0] = arr[0];
        for (int i = 1; i < n ; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        int i ;
        System.out.println("enter the elements of the array : ");
        for (i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the prefix sum array is : ");
        int[] prefix= makePrefixSumArray(arr);
        for (i = 0; i < n; i++) {
            System.out.print(prefix[i]+" ");
        }
        sc.close();
    }
}
