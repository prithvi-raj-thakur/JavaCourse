package Array.InputOutput;

import java.util.Scanner;
//count the number of elements srtictly greater than x.
public class CountGreaterElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x;
        System.out.println("enter the value of x : ");
        x= sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>x)
                count ++;
        }
        if(count==0)
            System.out.println("element not found..");
        else{
            System.out.printf("elements greater than %d is %d",x,count);
        }
        sc.close();
    }
}
