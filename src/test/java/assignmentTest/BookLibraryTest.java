package assignmentTest;

import static org.junit.jupiter.api.Assertions.*;

import assignmentClasses.BookLibrary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class BookLibraryTest {

    private BookLibrary library;

    @BeforeEach
    public void setUp() {
        library = new BookLibrary();
    }

    @Test
    public void testAddAndListBooks() {
        library.addBook("Uzumaki");
        List<String> books = library.listBooks();
        assertEquals(1, books.size(), "There should be 1 book in the library");
        assertEquals("Uzumaki", books.get(0), "Uzumaki should be the first book");
    }

    @Test
    public void testRemoveBook() {
        library.addBook("Soichi's Beloved Pet");
        library.removeBook("Soichi's Beloved Pet");
        List<String> books = library.listBooks();
        assertEquals(0, books.size(), "There should be no books in the library");
    }

    @Test
    public void testRemoveNonExistingBook() {
        library.addBook("Tomie");
        boolean result = library.removeBook("Smashed");
        assertFalse(result, "Removing a non-existing book should return false");
        List<String> books = library.listBooks();
        assertEquals(1, books.size(), "There should still be 1 book in the library");
    }

    @Test
    public void testListBooksWithMultipleEntries() {
        library.addBook("Uzumaki");
        library.addBook("Soichi's Beloved Pet");
        library.addBook("Tomie");
        List<String> books = library.listBooks();
        assertEquals(3, books.size(), "There should be 3 books in the library");
        assertEquals("Uzumaki", books.get(0), "First book should be Uzumaki");
        assertEquals("Soichi's Beloved Pet", books.get(1), "Second book should be Soichi's Beloved Pet");
        assertEquals("Tomie", books.get(2), "Third book should be Tomie");
    }
}
