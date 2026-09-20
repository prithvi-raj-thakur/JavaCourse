package Problems.Arrays;

import java.util.*;

class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Spaces for triangle shape
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            int num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");

                // Calculate next element
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }

        sc.close();
    }
}
