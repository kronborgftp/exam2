package eight;

public class Card {
    private static final String[] SUITS = {"hearts", "diamonds", "clubs", "spades"};
    private static final int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    private String suit;
    private int value;

    public Card(String suit, int value) {
        if (isValidSuit(suit) && isValidValue(value)) {
            this.suit = suit;
            this.value = value;
        } else {
            throw new IllegalArgumentException("Invalid suit or value.");
        }
    }

    private boolean isValidSuit(String suit) {
        for( String validSuit : SUITS) {
            if (validSuit.equals(suit)) {
                return true;
            }
        }
        return false;
    }
    private boolean isValidValue(int value) {
        for(int validValue : VALUES) {
            if (validValue == value) {
                return true;
            }
        }
        return false;
    }

    public boolean beats(Card otherCard) {
        if(this.value > otherCard.value) {
            return true;
        } else if(this.value < otherCard.value) {
            return false;
        } else {
            // Values are equal, compare suits
            int thisSuitIndex = getSuitIndex(this.suit);
            int otherSuitIndex = getSuitIndex(otherCard.suit);
            return thisSuitIndex < otherSuitIndex;
        }
    }

    private int getSuitIndex(String suit) {
        for (int i = 0; i < SUITS.length; i++) {
            if(suit.equals(SUITS[i])) {
                return i;
            }
        }
        return -1; //invalid suit
    }
}


