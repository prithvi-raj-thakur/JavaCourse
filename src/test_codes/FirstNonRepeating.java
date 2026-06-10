package test_codes;

import java.util.Scanner;

public class FirstNonRepeating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for(int i = 0; i < n; i++) {

            int count = 0;

            for(int j = 0; j < n; j++) {

                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count == 1) {

                System.out.println(
                        "First Non-Repeating Element = " + arr[i]
                );

                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("No Non-Repeating Element");
        }
    }
}
