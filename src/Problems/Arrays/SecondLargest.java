package Problems.Arrays;

import java.util.Scanner;

public class SecondLargest {

    static int Secondlargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int num : arr){
            if (num > largest) {;
                second_largest=largest;
                largest=num;
            } else if (largest>num && num>second_largest) {
                second_largest=num;
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements in array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements : ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the second largest element is : " + Secondlargest(arr));
        sc.close();
    }
}
