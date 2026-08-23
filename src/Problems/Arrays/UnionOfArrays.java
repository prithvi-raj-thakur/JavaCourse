package Problems.Arrays;

import java.util.Scanner;

public class UnionOfArrays {
    static void Union(int[] a , int[] b ){
        int i = 0 ;
        int j = 0 ;
        while ( i < a.length && j < b.length){
            if(a[i] < b [j]){
                System.out.print(a[i]+" ");
                i++ ;
            }
            else if ( a[i] > b[j]){
                System.out.print(b[j]+" ");
                j++;
            }
            else {
                System.out.print(a[i]+" ");
                i++ ;
                j ++ ;
            }
        }
        while(i < a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        while( j < b.length){
            System.out.print(b[j]+" ");
            j++ ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in array 1 : ");
        int n1 = sc.nextInt();
        int [] a = new int[n1];
        System.out.println("enter the elements of the array a : ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("enter the number of elements in array 2 : ");
        int n2 = sc.nextInt();
        int [] b = new int[n2];
        System.out.println("enter the elements of the array b : ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        Union(a,b);
        sc.close();
    }
}
