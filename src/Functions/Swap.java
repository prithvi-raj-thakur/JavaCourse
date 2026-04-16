package Functions;

import java.util.Scanner;

public class Swap {
    public static void swap(int a , int b ){
        int temp = a;
        a=b;
        b=temp;

        System.out.println("inside function : a = "+a+ ", b = " +b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        swap(a,b);
        System.out.println("outside function : a = "+a+ " , b = "+b);
    }
}
