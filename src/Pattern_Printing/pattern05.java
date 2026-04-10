package Pattern_Printing;
import java.util.Scanner;

public class pattern05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r;
        System.out.print("ENTER THE NUMBER OF LINES:: ");
        r= scanner.nextInt();
        int i,j;
        for(i=1;i<=r;i++){
            for(j=r;j>i;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
