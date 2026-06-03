package Array.TwoPointer;

import java.util.Scanner;

public class MoveZeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;

        for(int j = 0; j < n; j++) {

            if(arr[j] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        System.out.println("Array after moving zeros:");

        for(int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}