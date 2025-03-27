package se.lexicon;

public class BookLenderApp {
    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Smith");

        // Creating Book objects
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Displaying person and book details
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(book1);
        System.out.println(book2);

        // Simulating book lending: marking '1984' as unavailable
        book1.setAvailable(false);
        System.out.println("After lending out '1984': " + book1);

        // Simulating book return
        book1.returnBook();
        System.out.println("After returning '1984': " + book1);
    }
}