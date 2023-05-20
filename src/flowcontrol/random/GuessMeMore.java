package flowcontrol.random;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class GuessMeMore {
    public static void main(String[] args) {
        Random rnx = new Random();
        //Make the number chosen, a random number between -100 and 100
        //.nextInt((max - min) + 1) + min  =>  (100-(-100)+1)=(201)+min = (201)-100
        // 201: (range 0 to 200) -100 = range -100 to 100
        int myNumber = rnx.nextInt (201)-100;
        int userNumber = 0;
        System.out.println(myNumber);

        Scanner userInput = new Scanner(System.in);
        System.out.println("I've chosen a number. Bet can't guess it!");


        while(myNumber != userNumber){
            System.out.println("Please pick a number!");
            userNumber = Integer.parseInt(userInput.nextLine());
            if (userNumber < myNumber) {
                System.out.println(userNumber + "? Ha, nice try - too low!");
            } else if (userNumber > myNumber){
                System.out.println(userNumber + "? Too bad, way too high.");
            } else {
                System.out.println("Wow, nice guess! That was it! "+ myNumber);
            }
        }
    }
}
