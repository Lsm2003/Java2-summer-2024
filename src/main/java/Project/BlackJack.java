package Project;

import java.util.ArrayList;

/**
 * Represents a game of Blackjack contains methods to hit and check the winner
 */
public class BlackJack {
    public Boolean gameState;
    public Hand dealerHand;
    public Hand playerHand;
    public Integer bet;

    /**
     * Created an instance of Blackjack
     * @param playerCards The initial 2 cards dealt to the player
     * @param dealerCards The initial 2 cards dealt to the dealer
     * @param bet The intial bet of the player needed to begin
     */
    public BlackJack(ArrayList<PlayingCard> playerCards , ArrayList<PlayingCard> dealerCards, Integer bet) {
        this.gameState = true;
        this.dealerHand = new Hand(dealerCards);
        this.playerHand = new Hand(playerCards);
        this.bet = bet;
    }

    /**
     * Adds a PlayingCard to one of the hands
     * @param card The PlayingCard being added to one of the hands
     * @param hand The Hand of this BackJack game to add the card parameter
     */
    public void hit(PlayingCard card, Hand hand) {
        hand.addCard(card);
        if (hand.getScore() > 21) {
            gameState = false;
        }
    }

    /**
     * Checks the winner
     * @return the Hand belonging to the winner.
     */
    public Hand checkWinner() {
        if (this.playerHand.getScore() > this.dealerHand.getScore() && this.playerHand.getScore() < 22 || this.dealerHand.getScore() > 21) {
            return this.playerHand;
        }
        else return this.dealerHand;
    }
}