package Assignments.A1Shapes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleExceptionTest {

    @Test
    void createRectangles () throws InvalidShapeParameterException {
        Rectangle goodRectangle = new Rectangle(1.0,1.0);
        assertNotNull(goodRectangle);


        assertThrows(InvalidShapeParameterException.class, () -> {
            Rectangle badWidthRectangle = new Rectangle(1.0, -1.0);
        });

        assertThrows(InvalidShapeParameterException.class, ()-> {
            Rectangle badLengthRectangle = new Rectangle(-1.0,1.0);
        });
    }

}
