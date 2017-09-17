import org.junit.Before;
import org.junit.After;
import org.junit.*;
import static org.junit.Assert.*;

public class test {

    @Before
    public void setDefaults() {
        Robot r = new Robot();

        r.name = "Peter";
        r.walking = 1;
        r.skipping = 1;
        r.jumping = 3;
        r.running = 4;
    }

    @Test
    public void testDefault() {
        Robot r = new Robot();
        Integer x = r.getX();
        Integer y = r.getY();

        if (r.getX() != 0 || r.getY() != 0) {
            assertTrue(r.getX().equals(0));
            assertTrue(r.getY().equals(0));
        }
    }

    @Test
    public void testResults() {
        Robot r = new Robot();
        Integer x = r.getX();
        Integer y = r.getY();

        if (x != r.getX2() & y != r.getY2()) {
            assertTrue(r.getX().equals(x));
            assertTrue(r.getY().equals(y));
        }
    }

    @Test
    public void testDestinationInput() {
        Robot r = new Robot();
        Integer x = r.getX();
        Integer y = r.getY();

        if (r.getX2() == r.getX() || r.getY2() == r.getY()) {
            assertTrue(r.getX().equals(x));
            assertTrue(r.getY().equals(y));
        }
    }
}

