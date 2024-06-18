package Test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BicycleShop {
    public static void main(String[] args) {
        Pattern licensePattern = Pattern.compile("[A-Z]{3}\\d{4}D\\d{1}_\\d{5}");

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter license number: ");
            String licenseNumber = scanner.nextLine();
            if (licensePattern.matcher(licenseNumber).matches()) {
                System.out.println("License is valid, you are registered");
            } else {
                System.out.println("License is not valid, try again");
            }} catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}