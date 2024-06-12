package Assignments;

import java.util.Scanner;
public class SentenceReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a sentence to reverse:");
        String sentence = scanner.nextLine();
        System.out.println(reverseSentence(sentence));
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split("\\s");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1 ; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return String.valueOf(reversedSentence).trim();
    }
}
