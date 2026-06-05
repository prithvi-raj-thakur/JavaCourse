package Array.TwoPointer;

import java.util.Scanner;

public class MiddleElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int slow = 0;
        int fast = 0;

        while(fast < n - 1 && fast + 1 < n - 1) {

            slow++;
            fast += 2;
        }

        System.out.println("Middle Element = " + arr[slow]);
    }
}