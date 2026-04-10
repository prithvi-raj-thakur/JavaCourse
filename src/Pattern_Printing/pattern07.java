package Pattern_Printing;
import java.util.Scanner;

public class pattern07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i,j;
        System.out.print("ENTER THE NUMBER OF LINES YOU NEED: ");
        n=scanner.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}
