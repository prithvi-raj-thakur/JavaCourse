package Problems.Arrays;

import java.util.Scanner;

public class LargestElement {
    static int Largest(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
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
        System.out.println("the largest element is : "+Largest(arr));
        sc.close();
    }
}
