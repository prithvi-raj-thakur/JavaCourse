package Functions;

import java.util.Scanner;

public class evenOrOdd {
    public static  void checkOddEven(int n){
        if(n%2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        checkOddEven(n);
    }
}
