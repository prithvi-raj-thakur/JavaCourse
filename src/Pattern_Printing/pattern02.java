package Pattern_Printing;
import java.util.Scanner;

/*
*****
*   *
*   *
*****
 */
public class pattern02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        System.out.print("ENTER THE NUMBER OF ROWS:: ");
        rows= scanner.nextInt();
        System.out.print("ENTER THE NUMBER OF COLUMNS:: ");
        columns= scanner.nextInt();
        int i,j;
        for(i=1;i<=rows;i++){
            for(j=1;j<=columns;j++){
                if(i==1 || i==rows || j==1 || j==columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }

}
