package Array.TargetSum;
//Program to count the number of triplets whose sum is equal to the given value x...

import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of elements in the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int i ;
        System.out.print("enter the elements of the array : ");
        for (i=0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("enter the value of x : ");
        int x = sc.nextInt();

        int count = 0;

        int j,k;

        for (i = 0 ; i < n ; i++){
            for(j = i+1 ; j < n ; j++){
                for(k = j+1 ; k < n ; k++){
                    if( arr[i]+arr[j]+arr[k] == x){
                        count ++ ;
                        System.out.printf("(%d,%d,%d)=%d\n",arr[i],arr[j],arr[k],x);
                    }
                }
            }
        }

        if(count == 0)
            System.out.println("no triplet found with sum "+x);
        else
            System.out.println("the number of triplet whose sum is "+x+ " are "+count);
    }
}
