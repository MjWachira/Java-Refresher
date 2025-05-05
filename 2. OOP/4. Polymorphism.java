// Polymorphism allows objects to take on many forms. The most common type is method overriding, 
// where a subclass provides a specific implementation of a method already defined in the parent class.

class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    void makeSound() {
        System.out.println("Moo");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a;

        a = new Cat(); a.makeSound(); // Output: Meow
        a = new Cow(); a.makeSound(); // Output: Moo
    }
}
