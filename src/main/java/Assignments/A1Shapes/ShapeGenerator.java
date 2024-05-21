package Assignments.A1Shapes;
import java.util.Random;

public class ShapeGenerator {

    static Shape getShape() throws InvalidShapeParameterException {
        Random rand = new Random();
        if (rand.nextInt() % 2 == 0) {

            Circle circle = null;
            try {
                circle = new Circle(rand.nextDouble(-1, 1));
            } catch (InvalidShapeParameterException error) {
                System.err.println(error);
            }
            return circle;
        } else {
            Rectangle rectangle = null;
            try {
                rectangle = new Rectangle(rand.nextDouble(-1, 1), rand.nextDouble(1, 10));
            } catch (InvalidShapeParameterException error) {
                System.err.println(error);
            }
            return rectangle;
        }
    }
}
