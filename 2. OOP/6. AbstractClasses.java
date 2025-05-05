// An abstract class can have both abstract methods (no body) and concrete methods (with body). 
// It’s used as a base for other classes.

abstract class Shape {
    abstract void draw(); // Abstract method

    void display() {
        System.out.println("Showing a shape");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Shape s = new Square();
        s.draw();    // Output: Drawing a square
        s.display(); // Output: Showing a shape
    }
}
