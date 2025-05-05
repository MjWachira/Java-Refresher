// An Iterator is used to loop through collections when you need more control (like removing items during iteration).
// You can also use enhanced for-loops for simple traversal.

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsAndLoops {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Using Iterator to loop
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }

        // Using enhanced for-loop
        for (int num : numbers) {
            System.out.println("For-each: " + num);
        }

        // Output:
        // Iterator: 10
        // Iterator: 20
        // Iterator: 30
        // For-each: 10
        // For-each: 20
        // For-each: 30
    }
}
