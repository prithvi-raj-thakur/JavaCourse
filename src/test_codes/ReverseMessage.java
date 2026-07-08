package test_codes;

import java.util.Scanner;

public class ReverseMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = sc.nextLine();

        String reverse = "";

        for (int i = message.length() - 1; i >= 0; i--) {
            reverse += message.charAt(i);
        }

        System.out.println("Reversed message: " + reverse);

        sc.close();
    }
}
