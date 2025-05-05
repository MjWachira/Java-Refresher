// A class is a blueprint for creating objects. 
// An object is an instance of a class that holds state and behavior.

class Car {
    // Fields (attributes)
    String brand;
    int year;

    // Method (behavior)
    void drive() {
        System.out.println(brand + " is driving.");
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        // Creating an object from the Car class
        Car myCar = new Car();
        myCar.brand = "Honda";
        myCar.year = 2022;
        myCar.drive(); // Calls the drive method
    }
}
