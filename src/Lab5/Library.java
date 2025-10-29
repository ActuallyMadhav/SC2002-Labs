package Lab5;

import java.util.*;

public class Library<T extends Searchable> {
    private List<T> books = new ArrayList<>();

    public void addBook(T book){
        books.add(book);
    }

    public void removeBook(T book){
        books.remove(book);
    }

    public List<T> getBooks(){
        return books;
    }

    public List<T> search(String keyword){
        return books.stream().filter(book -> book.matches(keyword)).toList();
    }

    public List<T> filterbyGenre(String genre){
        return books.stream().filter(book -> ((Book) book).genre.equalsIgnoreCase(genre)).toList();
    }

    public List<T> filterbyAuthor(String author){
        return books.stream().filter(book -> ((Book)book).author.equalsIgnoreCase(author)).toList();
    }

    public void displayAll(){
        for(T book : books){
            System.out.println(book);
        }
    }

    public void sortbyTitle(){
        books.sort(Comparator.comparing(book -> ((Book)book).title));
    }

    public String recommendBook(String category) {
        return switch (category.toLowerCase()) {
            case "science" -> "Try 'A Brief History of Time' by Stephen Hawking.";
            case "fiction" -> "Try '1984' by George Orwell.";
            case "biography" -> "Try 'A Beautiful Mind' by Sylvia Nasar.";
            default -> "No recommendations available.";
        };
    }
}
