package Functions;

import java.util.Scanner;

public class maxOfThree {
    public static int max(int a , int b , int c ){
        if(a>b && a >c )
            return a ;
        else if (b >c )
            return b;
        else
            return c ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

        System.out.println("Max = "+ max(a,b,c));
    }
}
