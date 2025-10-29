package Lab5;

public class Main {
    public static void main(String[] args) {
        Library<Book> library = new Library<>();

        // Test Case 1: Adding Books
        library.addBook(new Book("1984", "George Orwell", "Fiction", 1949));
        library.addBook(new Book("A Brief History of Time", "Stephen Hawking", "Science", 1988));
        System.out.println("Library contains " + library.getBooks().size() + " books.");

        // Test Case 2: Filter by Genre
        System.out.println("Fiction Books:");
        library.filterbyGenre("Fiction").forEach(System.out::println);

        // Test Case 3: Filter by Author
        System.out.println("Books by Stephen Hawking:");
        library.filterbyAuthor("Stephen Hawking").forEach(System.out::println);

        // Test Case 4: Search by Keyword
        System.out.println("Search for 'Time':");
        library.search("Time").forEach(System.out::println);

        // Test Case 5: Add and Sort
        library.addBook(new Book("A Beautiful Mind", "Sylvia Nasar", "Biography", 1998));
        library.sortbyTitle();
        System.out.println("Sorted Books:");
        library.displayAll();

        // Test Case 6: Recommendation
        System.out.println("Recommendation for Science:");
        System.out.println(library.recommendBook("Science"));

        // Test Case 7: Borrowing
        Borrower alice = new Borrower("Alice");
        alice.borrowBook("1984");
        System.out.println("Borrower details:");
        System.out.println(alice);

        // Test Case 8: Returning
        alice.returnBook("1984");
        System.out.println("After returning:");
        System.out.println(alice);
    }
}

