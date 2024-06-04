package Assignments.A2FitnessProgram;

import javax.xml.bind.JAXB;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStream;
import java.nio.file.*;
import java.util.Scanner;

public class EricsFitnessProgram {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/Assignments/A2FitnessProgram/Settings.xml");
        Scanner input = new Scanner(System.in);
        int userChoice = 0;

        while (userChoice != 3) {
            System.out.println("Press 1 to display current settings");
            System.out.println("Press 2 to update current settings");
            System.out.println("Press 3 to exit");
            userChoice = input.nextInt();

            switch (userChoice) {
                case 1:
                    if (Files.exists(path)) {
                        try (BufferedReader reader = Files.newBufferedReader(path)) {
                            Settings settings = JAXB.unmarshal(reader, Settings.class);
                            System.out.println(settings.getName());
                            System.out.println(settings.getHeight());
                            System.out.println(settings.getWeight());
                            System.out.println(settings.getBirthday());
                            System.out.println(settings.getFTP());
                        }
                        catch (Exception error) {
                            System.out.println(error);
                        }
                    }
                    else {
                        System.out.println("No settings have been saved, update settings and save to view.");
                    }
                    break;
                case 2:
                    try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                        Settings settings = new Settings();
                        Scanner userInput = new Scanner(System.in);

                        System.out.println("Enter name: ");
                        settings.setName(userInput.next());

                        System.out.println("Enter height: ");
                        settings.setHeight(userInput.nextInt());

                        System.out.println("Enter weight: ");
                        settings.setWeight(userInput.nextInt());

                        System.out.println("Enter birthday: ");
                        settings.setBirthday(userInput.next());

                        System.out.println("Enter FTP: ");
                        settings.setFtp(userInput.nextInt());

                        JAXB.marshal(settings, writer);
                    }
                    catch (Exception e) {
                        System.out.println(e);
                    }
                case 3: continue;
                default:
                    System.out.println("input is invalid, please try again");
            }
        }
        input.close();

    }
}
