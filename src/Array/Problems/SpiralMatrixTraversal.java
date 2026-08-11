package Array.Problems;

import java.util.Scanner;

public class SpiralMatrixTraversal {

    static void printSpiralOrder(int[][] matrix , int r , int c){
        int topRow = 0;
        int bottomRow = r-1;
        int leftCol = 0 ;
        int rightCol = c-1;
        int totalElements = 0;

        while (totalElements < r*c){

            //topRow ---> left to right
            for (int j = leftCol; j <= rightCol && totalElements<r*c ; j++) {
                System.out.print(matrix[topRow][j]+ " ");
                totalElements ++;
            }
            topRow ++ ;

            //rightCol ---> rightCol to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements< r*c ; i++) {
                System.out.print(matrix[i][rightCol]+" ");
                totalElements ++;
            }
            rightCol --;

            //bottomRow ---> rightCol to leftCol
            for (int j= rightCol ; j >= leftCol && totalElements < r*c ; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements ++;
            }
            bottomRow--;

            //leftCol ---> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r*c ; i--) {
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r , c ;
        System.out.print("enter the number of rows: ");
        r = sc.nextInt();
        System.out.print("enter the number of columns : ");
        c = sc .nextInt();

        int[][] matrix = new int [r][c];
        System.out.println("enter the martix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the input matrix is : ");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        printSpiralOrder(matrix,r,c);
        sc.close();
    }
}
