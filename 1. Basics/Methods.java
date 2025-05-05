// Methods (functions) let you group reusable blocks of code.
// Methods can return values or perform actions.
// Java supports parameters and return types.

public class Methods {
    // Method that returns an int
    static int add(int a, int b) {
        return a + b;
    }

    // Method that prints a message
    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        int result = add(5, 7);
        System.out.println("Sum: " + result);

        greet("Alice");
    }
}
