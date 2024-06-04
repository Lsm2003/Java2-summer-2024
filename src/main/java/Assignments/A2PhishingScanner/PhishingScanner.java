package Assignments.A2PhishingScanner;
import java.nio.file.*;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;


public class PhishingScanner {
    public static void main(String[] args) {

        Map<String, Integer> phisingWords = new HashMap<>();

        Path PhisingWords = Paths.get("src/main/java/Assignments/A2PhishingScanner/PhishingWords.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/Assignments/A2PhishingScanner/logs/SecurityScore.txt"))) {
            writer.write("Word\tAppearences\tScore\n");
            int emailSecurityScore = 0;

            List<String> allLines = Files.readAllLines(PhisingWords);
            for (String line : allLines) {
                String[] parts = line.split("\\s+");
                phisingWords.put(parts[0], Integer.valueOf(parts[1]));
            }

            List<String> emailContent = readEmail();

            for (Entry<String, Integer> word : phisingWords.entrySet()) {
                int appearances = countAppearances(emailContent, word);
                if (appearances != 0) {
                    int securityScore = appearances * word.getValue();
                    emailSecurityScore += securityScore;
                    String formattedString = String.format("%s\t%d\t\t\t%d%n", word.getKey(), appearances, securityScore);
                    writer.write(formattedString);
                }
            }
            String formattedString = String.format("security score:\t%d", emailSecurityScore);
            writer.write(formattedString);
        }

        catch (Exception error) {
            System.out.println(error);
        }}

    private static int countAppearances(List<String> content, Map.Entry<String, Integer> badWord) {
        int appearences = 0;
        for (String word: content) {
            if (word.equals(badWord.getKey())) {
                appearences ++;
            }
        }
        return appearences;
    }

    private static List<String> readEmail() {
        List<String> words = new ArrayList<>();
        Path path = Paths.get("src/main/java/Assignments/A2PhishingScanner/PhishingEmailExample2.txt");
        try {
            List<String> allLines = Files.readAllLines(path);
            for (String line : allLines) {
                String[] parts = line.split("[^a-zA-z']|\n");
                for (String part : parts) {
                    if (!part.isEmpty()) {
                        words.add(part);
                    }}}
            return words;

        } catch (Exception error) {
            System.out.println(error);
        }
        return words;


    }

}
