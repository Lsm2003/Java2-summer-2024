package Assignments;

public class WeightConverter {
    public static Double poundsToKilos(Double pounds) {
        assert pounds > 0: "weight must be above 0";
        return pounds / 2.205;
    }

    public static Double kilosToPounds(Double kilos) {
        assert kilos > 0: "weight must be above 0";
        return kilos * 2.205;
    }

    public static void main(String[] args) {

        try {
            System.out.println(poundsToKilos(5.5));
        }
        catch (AssertionError error) {
            System.out.println(error);
        }

        try {
            System.out.println(poundsToKilos(0.0));
        }
        catch (AssertionError error) {
            System.out.println(error);
        }

        try {
            System.out.println(kilosToPounds(20.8));
        }
        catch (AssertionError error) {
            System.err.println(error);
        }

        try {
            System.out.println(kilosToPounds(-1.8));
        }
        catch (AssertionError error) {
            System.err.println(error);
        }
    }
}

