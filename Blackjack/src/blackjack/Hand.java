package blackjack;

import cards.*;
import java.util.Collection;

/**
 * Developer:   Samuel H Wilson
 * Assignment:  Java II Final: Blackjack
 * Date:        05/01/2017
 * File:        Hand.java
 * Purpose:     Creates a basic template for all Hands. Hands are used to manage cards and bets for a round.
 */
public interface Hand {
    void dealCard(Card c);
    Collection<Card> getCards();
    Card getCard(int index);
    int getCardCount();
    int getHandValue();
    
    void setBet(double bet);
    void increaseBet(double toIncrease);
    double getBet();
    
    void setInsurance(double insurance);
    double getInsurance();
}
