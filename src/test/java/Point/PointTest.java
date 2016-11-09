import junit.framework.TestCase;
import org.junit.Test;
import Point.*;


public class PointTest extends TestCase {

    @Test
    public void testtoString() {
        Point pt = new Point(3,8);
        assertEquals("X : 3, Y : 8",pt.toString());
    }
}
