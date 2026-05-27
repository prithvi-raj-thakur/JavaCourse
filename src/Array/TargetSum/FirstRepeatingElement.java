package Array.TargetSum;

import java.util.Scanner;

public class FirstRepeatingElement {

    static void ArrayInput(int[] arr , int n , Scanner sc){
        System.out.println("enter the array elements: ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static int FirstRepeatingElement(int[] arr , int n){
        int repeat = -1 ;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i] == arr[j]){
                    repeat = arr[i];
                    break;
                }
                if(repeat!= -1)
                    break;
            }
        }
        if(repeat != -1)
            System.out.printf("the first repeating element is %d.",repeat);
        else
            System.out.println("no repeating element found..");
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayInput(arr,n,sc);
        FirstRepeatingElement(arr,n);
        sc.close();
    }
}
