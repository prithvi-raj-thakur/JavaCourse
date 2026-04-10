package Pattern_Printing;
import java.util.Scanner;

public class pattern09 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n ,i,j;
        System.out.print("ENTER THE NUMBER OF LINES YOUR REQUIRE: ");
        n= scanner.nextInt();
        for(i=0;i<n;i++){
            for(j=1;j<=n-i;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}
