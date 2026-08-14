package Array.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Printing the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Accessing an element
        System.out.println("Element at index 2: " + numbers.get(2));

        // Updating an element
        numbers.set(2, 35);
        System.out.println("After updating: " + numbers);

        // Removing an element
        numbers.remove(1);
        System.out.println("After removing: " + numbers);

        // Finding size
        System.out.println("Size of ArrayList: " + numbers.size());

        // Checking if an element exists
        System.out.println("Contains 40: " + numbers.contains(40));
    }
}