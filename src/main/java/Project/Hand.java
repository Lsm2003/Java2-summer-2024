package Project;

import java.util.ArrayList;

public class Hand {
    public ArrayList<PlayingCard> cards;

    public Hand(ArrayList<PlayingCard> cards) {
        this.cards = cards;

    }

    public void addCard(PlayingCard card){
        this.cards.add(card);
    }

    public int getScore() {
        int score = 0;
        int aceCount = 0;
        for (PlayingCard card: this.cards) {
            if (card.getValue() > 10) {
                score += 10;
            }
            else if (card.getValue() == 1) {
                aceCount += 1;
            }
            else {
                score += card.getValue();
            }
        }
        for (int i = aceCount; i > 0; i--) {
            score += 11;
            if (score > 21) {
                score -= 10;
            }
        }
        return score;
    }

    @Override
    public String toString() {
        StringBuilder cardsasString = new StringBuilder();
        for (PlayingCard card : this.cards) {
            cardsasString.append(card.toString());
            cardsasString.append(",");
        }
        return cardsasString.toString();
    }

}