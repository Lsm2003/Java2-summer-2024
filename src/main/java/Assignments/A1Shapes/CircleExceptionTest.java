package Assignments.A1Shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleExceptionTest {

    @Test
    void createCircles() throws InvalidShapeParameterException {
        Circle circle = new Circle(2.7);
        assertNotNull(circle);

        assertThrows(InvalidShapeParameterException.class, () -> {
            Circle badCircle = new Circle(-8.0);
        });}


}
