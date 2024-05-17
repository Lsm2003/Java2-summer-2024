package BookExercises.Q1120;

public class Main {
    public static void main(String[] args) {
        try{
            someMethod();
        }
        catch (Exception error) {
            error.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        }
        catch (Exception error) {
            throw error;
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("someMethod2's Exception");
    }
}
