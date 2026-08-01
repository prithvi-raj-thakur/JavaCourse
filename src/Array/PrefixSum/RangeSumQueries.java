package Array.PrefixSum;

//You are given an array of size n. You need to answer q queries. Each query gives two integers l and r, and you must print the sum of the values in the array from index l to r (inclusive).
//one based indexing to be used
import java.util.Scanner;

public class RangeSumQueries {
    static void PrefixSum(int[] arr , int[] pref , int n ){
        pref[0]= 0;
        for (int i = 1; i <=n ; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int [n+1];
        int[] pref = new int [n+1];
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < n ; i++) {
            arr[i]=sc.nextInt();
        }
        PrefixSum(arr,pref,n);
        System.out.println("enter the value of q :");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("enter the value of l and r : ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum;
            if(l==0)
                sum = pref[r];
            else
                sum = pref[r]-pref[l-1];
            System.out.println("sum = "+ sum);
            q--;
        }
        sc.close();
    }
}
