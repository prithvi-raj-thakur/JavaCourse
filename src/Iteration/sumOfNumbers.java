package Iteration;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , n ;
        int sum = 0;
        System.out.println("enter the value of n: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            sum+=i;
        }
        System.out.printf("the sum of 1 to %d is %d",n,sum);
    }
}
