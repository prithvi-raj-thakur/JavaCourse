package Array.ArrayList;

import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(25);
        list.add(7);
        list.add(45);
        list.add(18);

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("Maximum element = " + max);
    }
}
