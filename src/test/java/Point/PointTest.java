package Point;

import junit.framework.TestCase;
import org.junit.Test;


public class PointTest extends TestCase {

    @Test
    public void testtoString() {
        Point pt = new Point(3,8);
        assertEquals("X : 3, Y : 8",pt.toString());
    }

    @Test
    public void testSoustraction() {
        Point pt = new Point(15,10);
        assertEquals(5,pt.soustraction());
    }

    @Test
    public void testAddition() {
        Point pt = new Point(15,10);
        assertEquals(25,pt.addition());
    }
}
