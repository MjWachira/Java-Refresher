// Generics allow you to write code that works with any data type while maintaining type safety.
// Without generics, you’d use Object, and then cast (which is risky)
// With generics, the compiler enforces type checking at compile time

// Generic Collections: Type-safe usage with ArrayList<String>
// Generic Class: Box<T> stores any type
// Generic Method: printArray() prints any array
// Bounded Generics: MathUtils<T extends Number> restricts to numeric types

import java.util.ArrayList;

// This file demonstrates key concepts of Java Generics:
// 1. Type-safe collections
// 2. Generic classes
// 3. Generic methods
// 4. Bounded generics

public class GenericsOverview {

    // 1. Generic Class: Box<T>
    // This class can hold any type (T), like Integer, String, etc.
    static class Box<T> {
        private T value;

        public void set(T val) {
            value = val;
        }

        public T get() {
            return value;
        }
    }

    // 2. Generic Method: printArray
    // This method works for any array type
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 3. Bounded Generics: only allows Number or its subclasses
    static class MathUtils<T extends Number> {
        private T value;

        public MathUtils(T value) {
            this.value = value;
        }

        public double getDoubleValue() {
            return value.doubleValue(); // All subclasses of Number have doubleValue()
        }
    }

    public static void main(String[] args) {
        // --- Using a Generic Collection ---
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        // names.add(10); // ❌ Compile-time error: only Strings allowed

        System.out.println("Names:");
        for (String name : names) {
            System.out.println(name);
        }

        // --- Using a Generic Class ---
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("\nBox holds Integer: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Generics are cool");
        System.out.println("Box holds String: " + strBox.get());

        // --- Using a Generic Method ---
        System.out.println("\nGeneric method with Integer array:");
        Integer[] numbers = {1, 2, 3};
        printArray(numbers);

        System.out.println("Generic method with String array:");
        String[] words = {"Java", "Generics", "Rocks"};
        printArray(words);

        // --- Using Bounded Generics ---
        MathUtils<Integer> m1 = new MathUtils<>(42);
        MathUtils<Double> m2 = new MathUtils<>(3.14);

        System.out.println("\nBounded Generics:");
        System.out.println("Integer as double: " + m1.getDoubleValue());
        System.out.println("Double as double: " + m2.getDoubleValue());

        // Uncommenting below line will result in compile-time error
        // MathUtils<String> m3 = new MathUtils<>("Oops"); // ❌ Not a subclass of Number
    }
}
