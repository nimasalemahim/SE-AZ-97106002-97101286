import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrototype {

    Circle circle = new Circle(5);


    @Test
    void testPrototype() {

        Circle clone_circle = circle.copy();
        assertEquals(circle.getRadius(), clone_circle.getRadius());
    }
}
