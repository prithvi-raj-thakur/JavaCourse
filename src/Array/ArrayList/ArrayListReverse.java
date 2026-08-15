package Array.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original ArrayList: " + list);

        Collections.reverse(list);

        System.out.println("Reversed ArrayList: " + list);
    }
}