package chapter4.review;
import java.util.Random;

public class LotteryCard {
    
    // Data members
    
    // the largest number on a card
    private static final int MAX_NUMBER = 15;
    
    // the smallest number on card
    private static final int MIN_NUMBER = 10;
    
    // To represent a card before drawing
    private static final int NO_NUMBER = 0;
    
    // the 'largest' color for a card
    private static final int MAX_COLOR = 3;
    
    // the 'smallest' color for a card
    private static final int MIN_COLOR = 1;
    
    // to represent a card before drawing
    private static final int NO_COLOR = 0;
    
    private int number;
    private int color;
    private Random random;
    
    // Constructor
    public LotteryCard() {
        random = new Random();
        number = NO_NUMBER;
        color = NO_COLOR;
    }
    
    // Spin the card
    public void spin() {
        number = random.nextInt (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        color = random.nextInt (MAX_COLOR - MIN_COLOR + 1) + MIN_COLOR;
    }
    
    // Returns the number on the die
    public int getNumber() {
        return number;
    }
    
    public int getColor() {
        return color;
    }
}
