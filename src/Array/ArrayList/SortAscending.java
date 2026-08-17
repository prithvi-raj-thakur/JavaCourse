package Array.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortAscending {

    static void sortAscending(ArrayList<String> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        System.out.println("Original ArrayList: " + list);

        sortAscending(list);

        System.out.println("Ascending Order: " + list);

        sc.close();
    }
}
