// An ArrayList is a resizable array. It stores elements in insertion order and allows duplicates.
// Fast for index-based access
// Dynamically grows as needed
// Part of java.util

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Accessing elements with a loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Output:
        // Apple
        // Banana
        // Cherry
    }
}
