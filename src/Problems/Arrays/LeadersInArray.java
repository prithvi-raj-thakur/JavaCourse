package Problems.Arrays;

public class LeadersInArray {

    static void findLeaders(int[] arr) {

        int max = arr[arr.length - 1];

        System.out.print("Leaders: " + max + " ");

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        findLeaders(arr);
    }
}