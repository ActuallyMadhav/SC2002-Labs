package Lab5;

import java.util.*;

public class Borrower {
    String name;
    List<String> borrowed = new ArrayList<>();

    public Borrower(String name){
        this.name = name;
    }

    public void borrowBook(String title){
        borrowed.add(title);
    }

    public void returnBook(String title){
        borrowed.remove(title);
    }

    @Override
    public String toString() {
        return String.format("{\"name\": \"%s\", \"borrowedBooks\": %s}", name, borrowed);
    }
}
