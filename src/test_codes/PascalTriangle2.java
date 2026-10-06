package test_codes;

import java.util.*;

public class PascalTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        long value = 1;

        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) value);
            value = value * (rowIndex - i) / (i + 1);
        }

        return row;
    }

    public static void main(String[] args) {

        int rowIndex = 3;

        List<Integer> result = getRow(rowIndex);

        System.out.println(result);
    }
}
