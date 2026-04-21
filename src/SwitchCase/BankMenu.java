package SwitchCase;

import java.util.Scanner;

class BankMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                int dep = sc.nextInt();
                balance += dep;
                System.out.println("Updated Balance: " + balance);
                break;

            case 2:
                System.out.print("Enter amount to withdraw: ");
                int wd = sc.nextInt();
                if(wd <= balance) {
                    balance -= wd;
                    System.out.println("Remaining Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 3:
                System.out.println("Current Balance: " + balance);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}