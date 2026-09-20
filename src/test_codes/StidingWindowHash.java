package test_codes;

import java.util.*;

class SlidingWindowHash {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            // Add current element
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            // Shrink window if distinct elements > k
            while (map.size() > k) {

                int element = arr[left];

                map.put(element, map.get(element) - 1);

                if (map.get(element) == 0) {
                    map.remove(element);
                }

                left++;
            }

            // Calculate maximum window length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest Length = " + maxLength);
    }
}
