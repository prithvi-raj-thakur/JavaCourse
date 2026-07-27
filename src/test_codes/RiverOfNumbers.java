package test_codes;

public class RiverOfNumbers {

    static long countSubarrays(int[] arr, int k) {
        int left = 0;
        long answer = 0;
        long sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left++];
            }

            answer += (right - left + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(countSubarrays(arr,5));
    }
}