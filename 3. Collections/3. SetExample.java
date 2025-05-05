// A Set is a collection that contains no duplicate elements.
// Does not maintain order
// Used for unique items only
// We use HashSet (one of the implementations) for most use-cases.

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        // Adding elements (duplicates ignored)
        names.add("John");
        names.add("Jane");
        names.add("John"); // Duplicate, won't be added again

        // Displaying unique names
        for (String name : names) {
            System.out.println(name);
        }

        // Output:
        // John
        // Jane
        // (Order may vary)
    }
}
