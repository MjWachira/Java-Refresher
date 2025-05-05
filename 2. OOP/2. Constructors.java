// A constructor is a special method that runs when an object is created. 
// It initializes the object’s state.

class Book {
    String title;
    String author;

    // Constructor (no return type, same name as class)
    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println(title + " by " + author);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Book b1 = new Book("Java in Action", "Alex Smith");
        b1.display();
    }
}
