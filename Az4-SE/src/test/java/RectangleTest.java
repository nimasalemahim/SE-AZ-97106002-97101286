import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RectangleTest {
    private final Rectangle rec = new Rectangle();
    private final Square sq = new Square();

    @Test
    void testSetLength() {
        rec.setLength(5);
        Float length = rec.getLength();

        assertEquals(5, length);

    }

    @Test
    void testSetWidth() {
        rec.setWidth(3);
        Float width = rec.getWidth();

        assertEquals(3, width);
    }

    @Test
    void testArea() {
        rec.setWidth(3);
        rec.setLength(5);

        assertEquals(15, rec.getArea());

    }

    @Test
    void testSquare() {
        sq.setSide(3);

        assertEquals(3, sq.getSide());
        assertEquals(9, sq.getArea());

    }
}
