// Lambdas allow you to write concise implementations of functional interfaces (interfaces with one method).
// Syntax: (params) -> { body }
// Useful with functional APIs like streams or Runnable

public class LambdaExpressions {
    public static void main(String[] args) {
        // Traditional Runnable
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Old way");
            }
        };

        // Lambda expression
        Runnable r2 = () -> System.out.println("Lambda way");

        r1.run();
        r2.run();
    }
}
