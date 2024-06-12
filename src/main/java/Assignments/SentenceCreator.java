package Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class SentenceCreator {
    private static final Map<String, String[]> CATEGORIES = new HashMap<>();

    static {
        CATEGORIES.put("article", new String[]{"the", "a", "one", "some", "any"});
        CATEGORIES.put("noun", new String[]{"boy", "girl", "dog", "town", "car", "Truck"});
        CATEGORIES.put("verb", new String[]{"drove", "jumped", "ran", "walked", "skipped"});
        CATEGORIES.put("preposition", new String[]{"to", "from", "over", "under", "on"});
    }

    private static String[] sentenceSequence = {"article","noun","verb","preposition","article","noun"};

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(generateScentence(random, CATEGORIES, sentenceSequence));
        }
    }

    public static String generateScentence(Random random, Map<String, String[]> wordList, String[] sequence) {
        StringBuilder scentence = new StringBuilder();
        for (String Wordtype : sequence) {
            scentence.append(wordList.get(Wordtype)[random.nextInt(wordList.get(Wordtype).length)])
                    .append(" ");
        }
        scentence.setCharAt(scentence.length() - 1, '.');
        scentence.setCharAt(0,Character.toUpperCase(scentence.charAt(0)));

        return scentence.toString();
    }
}
