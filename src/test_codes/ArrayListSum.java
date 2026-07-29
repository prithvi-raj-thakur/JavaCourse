package test_codes;

import java.util.ArrayList;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        int sum = 0;

        for (int num : list) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}
