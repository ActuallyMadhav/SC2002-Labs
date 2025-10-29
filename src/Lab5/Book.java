package Lab5;

public class Book implements Searchable{
    String title, genre, author;
    int yearOfPub;

    public Book( String title, String author, String genre, int yearOfPub){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearOfPub = yearOfPub;
    }

    @Override
    public boolean matches(String keyword) {
        return this.title.contains(keyword) || this.genre.contains(keyword);
    }

    @Override
    public String toString() {
        return String.format("{\"title\": \"%s\", \"author\": \"%s\", \"genre\": \"%s\", \"publicationYear\": %d}",
                this.title, this.author, this.genre, this.yearOfPub);
    }
}
