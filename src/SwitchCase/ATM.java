package SwitchCase;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice;

        do {
            System.out.println("\n1.Withdraw 2.Deposit 3.Balance 4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    if(w <= balance) {
                        balance -= w;
                        System.out.println("Withdrawn Successfully");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    balance += d;
                    System.out.println("Deposited Successfully");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);
    }
}