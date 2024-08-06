package Project;

public class PlayingCard {

    public int value;
    public Suit suit;

    public PlayingCard(int value, Suit suit) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("card value must be between 1 and 13");
        }

        if (suit == null) {
            throw new IllegalArgumentException("suit must be specified");
        }
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public enum Suit {DIAMONDS, HEARTS, SPADES, CLUBS}

    @Override
    public String toString() {
        String value;
        String face = "";
        value = switch (this.value) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(this.value);
        };
        if (null != this.suit) switch (this.suit) {
            case DIAMONDS -> face = "^";
            case HEARTS -> face = "&";
            case CLUBS -> face = "v";
            case SPADES -> face = "o";
            default -> {
            }
        }
        return String.format("%s%s", value, face);
    }

    public String generateAsciiCard() {
        String value;
        String face = "";
        value = switch (this.value) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(this.value);
        };
        if (null != this.suit) switch (this.suit) {
            case DIAMONDS -> face = "^";
            case HEARTS -> face = "&";
            case CLUBS -> face = "v";
            case SPADES -> face = "o";
            default -> {
            }
        }
        String topBottom = "┌─────────┐\n";
        String middle = "│         │\n";
        String rankLine = String.format("│ %-2s      │\n", value);
        String suitLine = String.format("│    %s    │\n", face);
        String rankLineBottom = String.format("│      %-2s │\n", value);

        return topBottom +
                rankLine +
                middle +
                suitLine +
                middle +
                rankLineBottom +
                topBottom.replace('┌', '└').replace('┐', '┘');
    }
}