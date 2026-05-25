package Array.TargetSum;

// Program to find a unique number in a given array
import java.util.Scanner;

public class UniqueElements {

    static void UniqueNumber (int[] arr,int n){
        for(int i = 0 ; i < n ; i++ ){
            int count = 0;
            for(int j = 0 ; j < n ; j ++){
                if(arr[i] == arr[j])
                    count ++;
            }

            if( count == 1){
                System.out.println(arr[i]);
            }
        }
    }

    static void inputArray ( int[] arr , int n ,  Scanner sc ){
        System.out.println("enter the array elements : ");

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        inputArray(arr,n,sc);

        UniqueNumber(arr,n);

        sc.close();
    }

}
