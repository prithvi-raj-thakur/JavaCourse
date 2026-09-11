package test_codes;

import java.util.*;

public class UnionIntersection {

    static void union(int[] a, int[] b) {
        System.out.print("Union: ");

        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(a[i] + " ");
            }
        }

        for (int i = 0; i < b.length; i++) {
            boolean found = false;

            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            for (int j = 0; j < i; j++) {
                if (b[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(b[i] + " ");
            }
        }

        System.out.println();
    }

    static void intersection(int[] a, int[] b) {
        System.out.print("Intersection: ");

        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (found && !duplicate) {
                System.out.print(a[i] + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] b = new int[m];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        System.out.println("\n1. Union");
        System.out.println("2. Intersection");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                union(a, b);
                break;

            case 2:
                intersection(a, b);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}