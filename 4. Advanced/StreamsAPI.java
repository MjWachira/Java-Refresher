// Streams provide a functional way to process collections.
// You can filter, map, and reduce data without writing loops.

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Print names starting with "C"
        names.stream()
             .filter(name -> name.startsWith("C"))
             .forEach(System.out::println);

        // Output: Charlie
    }
}
