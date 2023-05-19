package flowcontrol.random;

import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {
        Random rng = new Random();
        boolean flip = rng.nextBoolean();

        System.out.println("Ready, Set, Flip....!!");
        if(flip) {
            System.out.println("You got TAILS!");
        } else {
            System.out.println("You got HEADS!");
        }
    }
}
