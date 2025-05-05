// Operators are used to perform operations on variables and values.
// Arithmetic operators: +, -, *, /, %
// Relational operators: >, <, ==, !=, etc.
// Logical operators: &&, ||, !

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("a > b? " + (a > b));
        System.out.println("a == b? " + (a == b));

        boolean result = (a > b) && (a < 20);
        System.out.println("Logical AND: " + result);
    }
}
