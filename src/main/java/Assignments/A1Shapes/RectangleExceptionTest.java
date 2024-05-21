package Assignments.A1Shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleExceptionTest {

    @Test
    void createRectangles () throws InvalidShapeParameterException {
        Rectangle rectangle = new Rectangle(3.4,1.2);
        assertNotNull(rectangle);


        assertThrows(InvalidShapeParameterException.class, () -> {
            Rectangle invalidWidthRectangle = new Rectangle(5.6, -2.8);
        });

        assertThrows(InvalidShapeParameterException.class, ()-> {
            Rectangle invalidLengthRectangle = new Rectangle(-3.3,1.2);
        });
    }

}
