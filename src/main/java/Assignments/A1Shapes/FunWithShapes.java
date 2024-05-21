package Assignments.A1Shapes;
import java.util.ArrayList;

public class FunWithShapes {

    public static void main(String[] args) throws InvalidShapeParameterException {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        for (int x = 0; x < 5; x++) {
            try {
                Shape shape = ShapeGenerator.getShape();
                if (shape != null) {
                    shapes.add(shape);
                }
            } catch (InvalidShapeParameterException error) {
                System.err.println(error);
            }
        }

        for (Shape shape : shapes) {
            System.out.println(shape.getDescription());
        }
    }
}
