package Pattern_Printing;
import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i,j,var=1;
        System.out.print("ENTER THE NUMBER OF LINES: ");
        n= scanner.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.printf("%d ",var);
                var++;
            }
            System.out.println();
        }
    }
}
