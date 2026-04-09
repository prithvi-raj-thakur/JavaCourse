package Iteration;

import java.util.Scanner;

public class StreamNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int sum = 0;
        System.out.print("enter the value or -1 to end : ");
        n = sc.nextInt();
        do{
            sum += n;
            System.out.print("enter the value or -1 to end : ");
            n = sc.nextInt();
        } while (n != -1);
        System.out.printf("the sum is %d.",sum);
    }
}
