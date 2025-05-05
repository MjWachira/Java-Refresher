// Exceptions represent errors that disrupt normal program flow. Java handles them using try, catch, and finally.
// Use try to wrap risky code
// Use catch to handle specific exceptions
// finally runs no matter what (for cleanup)
// You can throw your own exceptions with throw

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block always runs.");
        }
    }
}
