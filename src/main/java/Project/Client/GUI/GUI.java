package Project.Client.GUI;

import java.io.IOException;

public class GUI {

    private static String[] getcards(String cards) {
        String[] result = cards.split(",");
        return result;
    }

    public static void printCards(String cards) {
        String[] cardsList = getcards(cards);
        String[] cardLines = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (String card : cardsList) {
                char face = card.charAt(1);
                char value = card.charAt(0);

                if (value == '1') {
                    String tenvalue = card.substring(0, 2);
                    face = card.charAt(2);
                    String[] lines = new String[7];
                    lines[0] = "┌─────────┐";
                    lines[1] = String.format("│ %-2s      │", tenvalue);
                    lines[2] = "│         │";
                    lines[3] = String.format("│    %s    │", face);
                    lines[4] = "│         │";
                    lines[5] = String.format("│      %-2s │", tenvalue);
                    lines[6] = "└─────────┘";

                    lineBuilder.append(lines[i]).append("");
                    cardLines[i] = lineBuilder.toString();
                }
                else {
                    String[] lines = new String[7];
                    lines[0] = "┌─────────┐";
                    lines[1] = String.format("│ %-2s      │", value);
                    lines[2] = "│         │";
                    lines[3] = String.format("│    %s    │", face);
                    lines[4] = "│         │";
                    lines[5] = String.format("│      %-2s │", value);
                    lines[6] = "└─────────┘";

                    lineBuilder.append(lines[i]).append("");
                    cardLines[i] = lineBuilder.toString();}
                if (cardsList.length == 1) {
                    String[] lines = new String[7];
                    lines[0] = "┌─────────┐";
                    lines[1] = String.format("│         │");
                    lines[2] = "│         │";
                    lines[3] = String.format("│         │");
                    lines[4] = "│         │";
                    lines[5] = String.format("│         │");
                    lines[6] = "└─────────┘";
                    lineBuilder.append(lines[i]).append("");
                    cardLines[i] = lineBuilder.toString();
                }
            }
        }
        for (String line : cardLines) {
            System.out.println(line);
        }
    }

    public static void printChips(int chips) {
        System.out.println("**********************");
        System.out.println("chips available: " + chips);
        System.out.println("**********************");
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {

                System.out.print("\033[H\033[2J");
                System.out.flush();

            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}