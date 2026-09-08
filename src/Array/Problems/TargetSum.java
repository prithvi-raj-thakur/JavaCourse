package Array.Problems;

import java.util.Scanner;

public class TargetSum {
    static void FindTargetSum(int[] arr , int target){
        int left = 0 ;
        int right = arr.length - 1;
        boolean found = false;
        while( left < right ){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(arr[left]+" "+arr[right]+" : "+ target);
                left ++;
                right --;
                found = true;
            }
            else if ( sum < target){
                left ++;
            }
            else{
                right -- ;
            }
        }
        if(found!=true)
            System.out.println("no pair found...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements: ");
        for (int i = 0; i < n  ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target: ");
        int target = sc.nextInt();
        FindTargetSum(arr,target);
    }
}
