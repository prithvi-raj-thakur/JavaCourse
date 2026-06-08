package test_codes;

import java.util.Scanner;

public class RemoveElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to remove: ");
        int x = sc.nextInt();

        int i = 0;

        for(int j = 0; j < n; j++) {

            if(arr[j] != x) {

                arr[i] = arr[j];
                i++;
            }
        }

        System.out.println("Array after removal:");

        for(int k = 0; k < i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
