package Point;

/**
 * Created by Nicochu on 09/11/2016.
 */
public class Point {

    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int soustraction() {
        return x-y;
    }

    public int addition() {
        return x+y+1;
    }

    public String toString() {
        return "X : " + x + ", Y : " + y;
    }
}
