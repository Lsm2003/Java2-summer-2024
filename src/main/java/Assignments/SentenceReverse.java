package Assignments;

public class SentenceReverse {
    public static String sentence = "You will never find a more wretched hive of scum and villainy - Obi Wan";

    public static void main(String[] args) {
        System.out.println(reverseScentence(sentence));
    }

    public static String reverseScentence(String scentence) {
        String[] words = scentence.split("\\s");
        StringBuilder reversedScentence = new StringBuilder();
        for (int i = words.length-1 ; i >= 0; i--) {
            reversedScentence.append(words[i]).append(" ");
        }
        return String.valueOf(reversedScentence);
    }
}
