package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishToPigLatin {
    public static String pigLatin(String input) {
        StringBuilder result = new StringBuilder();
        result.append(input, 1, input.length() - 1);
        result.append(input, 0, 1);
        result.append("ay");
        return result.toString();
    }

    public static void writeLineToFile(List phrases, String output) {
        File file = new File(output);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Object phrase : phrases) {
                bw.write(phrase.toString());
            }
            bw.write(phrases.toString());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();
        List<String> phrasesList = new ArrayList<>();
        try {
            File english = new File("src/main/java/Test/English.txt");
            List<String> lines = Files.readAllLines(english.toPath());
            for (String line : lines) {
                String[] words = line.split(" ");
//                phrasesList.addAll(Arrays.asList(words));
                for (String word : words) {
                    phrasesList.add(pigLatin(word));
//                    wordsList.addAll(Arrays.asList(words));
//                    phrasesList.addAll(Arrays.asList(words));
                    //wordsList.addAll()
                }
                writeLineToFile(phrasesList, "src/main/java/Test/PigLatin.txt" );
//                for (String phrase : phrasesList) {
//                    writeLineToFile(phrasesList, );
//                }
                wordsList.addAll(phrasesList);
                System.out.println(wordsList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
