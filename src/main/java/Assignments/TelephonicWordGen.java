package Assignments;

import java.util.*;
import java.io.*;

public class TelephonicWordGen {

    public static void getWord(int phoneNumber, Map<Character, List<String>> correspondence, Formatter output) {
        List<String> result = new ArrayList<>();
        generateWords(phoneNumber, 0, "", correspondence, result);

        // Write each generated word to the output
        for (String word : result) {
            output.format("%s%n", word);
        }
    }

    private static void generateWords(int phoneNumber, int index, String currentWord, Map<Character, List<String>> correspondence, List<String> result) {
        if (index == String.valueOf(phoneNumber).length()) {
            result.add(currentWord);
            return;
        }

        char digit = String.valueOf(phoneNumber).charAt(index);


        List<String> letters = correspondence.getOrDefault(digit, new ArrayList<>());
        for (String letter : letters) {
            generateWords(phoneNumber, index + 1, currentWord + letter, correspondence, result);

        }
    }

    public static void main(String[] args) {
        Map<Character, List<String>> correspondence = new HashMap<>();

        correspondence.put('2', List.of("A", "B", "C"));
        correspondence.put('3', List.of("D", "E", "F"));
        correspondence.put('4', List.of("G", "H", "I"));
        correspondence.put('5', List.of("J", "K", "L"));
        correspondence.put('6', List.of("M", "N", "O"));
        correspondence.put('7', List.of("P", "R", "S"));
        correspondence.put('8', List.of("T", "U", "V"));
        correspondence.put('9', List.of("W", "X", "Y"));

        String filePath = "src/main/java/Assignments/logs/phonicword.txt";
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("enter a 7 digit phone number (without '-' or '()')");
            int phoneNumber = input.nextInt();
            if (String.valueOf(phoneNumber).length() != 7)
            {throw new IllegalArgumentException("number must be 7 digits");}
            try (Formatter output = new Formatter(filePath)) {
                getWord(phoneNumber, correspondence, output);
            }
            catch (Exception error) {
                System.out.println(error);
            }
        }
        catch (InputMismatchException error) {
            System.out.println("the number you entered either isnt a number or was an invalid format");
        }
        catch (Exception error) {
            System.out.println(error);
        }


    }
}
