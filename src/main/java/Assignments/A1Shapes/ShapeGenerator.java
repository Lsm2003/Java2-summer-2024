package Assignments.A1Shapes;
import java.util.Random;

public class ShapeGenerator {
    public ShapeGenerator(){
    }

    public static Shape generateShape(){
        int coinTossResult = new Random().nextInt(2);
        double radius = new Random().nextInt(100);
        double length = new Random().nextInt(100);
        double width = new Random().nextInt(100);
        if (coinTossResult == 0){
            return new Circle(radius);
        }
        else{
            return new Rectangle(length,width);
        }
    }
}
