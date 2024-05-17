package Assignments.A1Shapes;

public class InvalidShapeParameterException extends Exception {
    public static final String msg = "Shape parameter is not valid!";

    public InvalidShapeParameterException(){
        super(msg);
    }
}
