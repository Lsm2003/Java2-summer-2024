package Project;

import java.util.ArrayList;

public class BlackJack {
    public Boolean gameState;
    public Hand dealerHand;
    public Hand playerHand;
    public Integer bet;

    public BlackJack(ArrayList<PlayingCard> playerCards , ArrayList<PlayingCard> dealerCards, Integer bet) {
        this.gameState = true;
        this.dealerHand = new Hand(dealerCards);
        this.playerHand = new Hand(playerCards);
        this.bet = bet;
    }

    public void hit(PlayingCard card, Hand hand) {
        hand.addCard(card);
        if (hand.getScore() > 21) {
            gameState = false;
        }
    }

    public Hand checkWinner() {
        if (this.playerHand.getScore() > this.dealerHand.getScore() && this.playerHand.getScore() < 22 || this.dealerHand.getScore() > 21) {
            return this.playerHand;
        }
        else return this.dealerHand;
    }
}