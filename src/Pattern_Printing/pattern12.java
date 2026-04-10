package Pattern_Printing;
import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i,j;
        System.out.print("ENTER THE VALUE OF n: ");
        n= scanner.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.printf("*  ");
            }
            for(j=1;j<=(n-i)*2;j++){
                System.out.print("   ");
            }
            for(j=1;j<=i;j++){
                System.out.printf("*  ");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.printf("*  ");
            }
            for(j=1;j<=(n-i)*2;j++){
                System.out.print("   ");
            }
            for(j=1;j<=i;j++){
                System.out.printf("*  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
