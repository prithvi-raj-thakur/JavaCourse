package Pattern_Printing;
import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n , i,j;
        System.out.print("ENTER THE NUMBER OF LINES: ");
        n= scanner.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.printf("1 ");
                }
                else{
                    System.out.printf("0 ");
                }
            }
            System.out.println();
        }
    }
}
