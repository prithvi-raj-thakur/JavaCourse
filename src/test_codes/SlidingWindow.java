package test_codes;

public class SlidingWindow {

    public static int maxSum(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];       // Add new element
            windowSum -= arr[i - k];   // Remove old element

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Maximum sum = " + maxSum(arr, k));
    }
}
