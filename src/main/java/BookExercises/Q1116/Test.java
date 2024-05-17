package BookExercises.Q1116;

public class Test {

    public static void main(String[] args) {
        try {
            throw new ExceptionB("Throw Exception B");
        }
        catch (ExceptionA error){
            System.err.println(error);
        }
        try {
            throw new ExceptionC("Throw Exception C");
        }
        catch (ExceptionA error) {
            System.err.println(error);
        }
    }
}
