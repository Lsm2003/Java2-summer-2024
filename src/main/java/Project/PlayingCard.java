package Project;

/**
 * represents a playing card
 * Each card has a value and belongs to one of four suits
 */
public class PlayingCard {

    public int value;
    public Suit suit;

    /**
     * Creates an instance of a playing card with value and suit
     *
     * @param value The integer representing the card's value (1 to 13).
     * @param suit  The suit of the playing card
     * @throws IllegalArgumentException If the provided value is not between 1 and 13 or if the suit is null
     */
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

    /**
     * gets value of the playing card
     *
     * @return the value of the playing card (1 to 13).
     */
    public int getValue() {
        return value;
    }

    /**
     * gets suit of the playing card
     *
     * @return the suit of the playing card
     */
    public Suit getSuit() {
        return suit;
    }

    public enum Suit {DIAMONDS, HEARTS, SPADES, CLUBS}

    /**
     * Returns a string representation of the playing card
     * The string includes the face value and the suit
     *
     * @return A string representation of the playing card.
     */
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

    /**
     * Generates an ascii art representation of this card
     * @return String: a ascii art representation of this card
     */
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