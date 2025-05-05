// A HashMap stores key-value pairs.
// Each key must be unique
// Values can be duplicated
// Lookup is fast using the hash code of the key
// Think of it like a dictionary: you search by key to get the value.

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap where key = name, value = score
        HashMap<String, Integer> scores = new HashMap<>();

        // Adding entries
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // Accessing and printing key-value pairs
        for (String key : scores.keySet()) {
            System.out.println(key + ": " + scores.get(key));
        }

        // Output example:
        // Alice: 90
        // Bob: 85
        // Charlie: 95
    }
}
