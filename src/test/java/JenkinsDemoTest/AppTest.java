package JenkinsDemoTest;

import JenkinsDemo.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    App app = new App();

    @Test
    public void testAddMe() {
        assertEquals(5.0, app.addMe(2, 3));
    }

    @Test
    public void testSubMe() {
        assertEquals(2.0, app.subMe(5, 3));
    }
}
