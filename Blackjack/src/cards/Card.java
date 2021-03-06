package cards;

/**
 * Developer:   Samuel H Wilson
 * Assignment:  Java II Final: Blackjack
 * Date:        05/01/2017
 * File:        Card.java
 * Purpose:     Provides basic card functionality and data storage. 
 */
public class Card {
    private static String[] RANK_STRINGS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] SUIT_STRINGS = {"H", "D", "C", "S"};
    
    private int rank;
    private int suit;
    private int cardNo;
    
    //Constructs a card from it's numeric representation
    public Card(int cardNo) {
        //Check legal cardNo
        if (cardNo < 0 || cardNo > 51) {
            throw new IllegalArgumentException("Card constructed with illegal cardNo. cardNo should be within range (0 <= x <= 51). Got " + cardNo + " instead.");
        }
        
        rank = cardNo % 13;
        suit = cardNo / 13;
        this.cardNo = cardNo;
    }
    
    //Getters
    public int getRank() {
        return rank;
    }
    
    public String rankString() {
        return RANK_STRINGS[rank];
    }
    
    public int getSuit() {
        return suit;
    }
    
    public String suitString() {
        return SUIT_STRINGS[suit];
    }
    
    public int getCardNo() {
        return cardNo;
    }
    
    //Util
    @Override
    public String toString() {
        return rankString() + "|" + suitString();
    }
}
