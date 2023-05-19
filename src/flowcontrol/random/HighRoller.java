package flowcontrol.random;

import java.util.Random;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class HighRoller {
    public static void main(String[] args) {
        Random diceRoller = new Random();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Tell me the number of sides a single die has?");
        int numSides = Integer.parseInt(userInput.nextLine());

        int rollResult = diceRoller.nextInt(numSides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        } else if (rollResult == numSides) {
            System.out.println("You rolled a critical! Nice job!");
        }
    }
}
