import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class StringManipulatorJohannesTest {

    private StringManipulatorJohannes manipulator;

    // Runs once before all tests
    @BeforeAll
    public static void initAll() {
        System.out.println("Before all tests");
    }

    // Runs once after all tests
    @AfterAll
    public static void cleanUpAll() {
        System.out.println("After all tests");
    }

    // Runs before each test
    @BeforeEach
    public void setUp() {
        manipulator = new StringManipulatorJohannes();
    }

    // Runs after each test
    @AfterEach
    public void tearDown() {
        manipulator = null;
    }

    // Test for the reverse method
    @Test
    public void testReverse() {
        assertEquals("cba", manipulator.reverse("abc"));
        assertEquals("", manipulator.reverse(""));
        assertNull(manipulator.reverse(null));
    }

    // Test for the capitalize method
    @Test
    public void testCapitalize() {
        assertEquals("Hello World", manipulator.capitalize("hello world"));
        assertEquals("Java", manipulator.capitalize("java"));
        assertEquals("", manipulator.capitalize(""));
        assertNull(manipulator.capitalize(null));
    }
}
