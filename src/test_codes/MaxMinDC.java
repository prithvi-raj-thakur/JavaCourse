package test_codes;

class Pair {
    int min;
    int max;
}

public class MaxMinDC {

    static Pair getMinMax(int arr[], int low, int high) {

        Pair result = new Pair();

        // Only one element
        if (low == high) {
            result.min = arr[low];
            result.max = arr[low];
            return result;
        }

        // Two elements
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                result.max = arr[low];
                result.min = arr[high];
            } else {
                result.max = arr[high];
                result.min = arr[low];
            }
            return result;
        }

        // Divide
        int mid = (low + high) / 2;

        Pair left = getMinMax(arr, low, mid);
        Pair right = getMinMax(arr, mid + 1, high);

        // Conquer
        result.min = (left.min < right.min) ? left.min : right.min;
        result.max = (left.max > right.max) ? left.max : right.max;

        return result;
    }

    public static void main(String[] args) {

        int arr[] = {100, 11, 445, 1, 330, 3000};

        Pair result = getMinMax(arr, 0, arr.length - 1);

        System.out.println("Minimum element = " + result.min);
        System.out.println("Maximum element = " + result.max);
    }
}
