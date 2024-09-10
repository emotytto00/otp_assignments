package assignmentClasses;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private List<String> books;

    public BookLibrary() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    public boolean removeBook(String book) {
        return books.remove(book);
    }

    public List<String> listBooks() {
        return new ArrayList<>(books);
    }
}
