package test_codes;

import java.util.Scanner;

public class ReverseVowels {

    static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            while(left < right && !isVowel(arr[left])) {
                left++;
            }

            while(left < right && !isVowel(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Result: " + new String(arr));
    }
}
