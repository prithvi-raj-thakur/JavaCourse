package test_codes;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] A = {1,3,5,7};
        int[] B = {2,4,6,8};

        int n = A.length;
        int m = B.length;

        int[] C = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m) {

            if(A[i] < B[j]) {
                C[k] = A[i];
                i++;
            }
            else {
                C[k] = B[j];
                j++;
            }

            k++;
        }

        while(i < n) {
            C[k] = A[i];
            i++;
            k++;
        }

        while(j < m) {
            C[k] = B[j];
            j++;
            k++;
        }

        System.out.println("Merged Array:");

        for(int x : C) {
            System.out.print(x + " ");
        }
    }
}
