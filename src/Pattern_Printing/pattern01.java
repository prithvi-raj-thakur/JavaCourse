/*
*****
*****
*****
*****
*/

package Pattern_Printing;

import java.util.Scanner;

public class pattern01 {
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
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
