package chapter4.review;

import java.util.ArrayList;
import java.util.List;

public class RoomWinner {
    
    public static void main(String[] args) {
        LotteryCard one = new LotteryCard();
        LotteryCard two = new LotteryCard();
        LotteryCard three = new LotteryCard();
        
        one.spin();
        two.spin();
        three.spin();
       
        System.out.println(one.getNumber() + " , " + one.getColor() + " , " + two.getNumber() + " , " + two.getColor() + " , " + three.getNumber() + " , " + three.getColor());
    }
}
