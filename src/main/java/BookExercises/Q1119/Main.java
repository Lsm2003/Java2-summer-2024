package BookExercises.Q1119;

public class Main {

    public static void main(String[] args) {
        try {
            ConstructorFailure cf = new ConstructorFailure();
        }
        catch (Exception error){
            System.err.println(error);
        }
    }
}
