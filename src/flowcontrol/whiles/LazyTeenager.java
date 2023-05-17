package flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        Random myRandom = new Random();

        int noOfTimesTold = 0;
        double chanceOfCleaning = 0.0;
        double teenTolerance = myRandom.nextDouble(); //between 0.0 and 1.0: 0.3, 0.15, 0.8,...

        System.out.println("teenChanceTolerance is a random double number: " + teenTolerance);


        do {
            noOfTimesTold++;
            System.out.println("Clean your room!! (x" + noOfTimesTold + ")");
            chanceOfCleaning +=0.1;
//            System.out.println("chanceOfCleaning"+ chanceOfCleaning); // 0.1, 0.2, 0.3, 0.4, ...

            if (noOfTimesTold == 7) {  //By the 7th time, they're going to get grounded and have their Xbox confiscated.
                System.out.println("Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
            } else if (chanceOfCleaning > teenTolerance) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            }

        } while (chanceOfCleaning < teenTolerance && noOfTimesTold < 7); //we have two conditions at the same time, here
    }
}
