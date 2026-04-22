package Iteration;

import java.util.Scanner;

public class MenuLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Factorial 2.Fibonacci 3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter number: ");
                    int n = sc.nextInt();
                    int fact = 1;

                    for(int i = 1; i <= n; i++) {
                        fact *= i;
                    }

                    System.out.println("Factorial: " + fact);
                    break;

                case 2:
                    System.out.print("Enter terms: ");
                    int t = sc.nextInt();

                    int a = 0, b = 1;
                    System.out.print("Fibonacci: ");

                    for(int i = 1; i <= t; i++) {
                        System.out.print(a + " ");
                        int next = a + b;
                        a = b;
                        b = next;
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 3);
    }
}