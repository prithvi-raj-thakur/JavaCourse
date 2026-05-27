package Array.Manupulation;

import java.util.Scanner;

public class CheckNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int x = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Number is present in array");
        } else {
            System.out.println("Number is not present in array");
        }
    }
}
