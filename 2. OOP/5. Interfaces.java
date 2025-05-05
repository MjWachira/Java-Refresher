// An interface defines a contract — methods that a class must implement. 
// Interfaces enable abstraction and multiple inheritance of types.

// Interface defines a method with no body
interface Drawable {
    void draw();
}

// Implementing the interface
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw(); // Output: Drawing a circle
    }
}
