package practiceExercises_BasicProgrammingConcepts;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        //Declare the variables:
        int totalSoFar = 0;
        int[] percentArray = new int[5];
        String[] dogs = {"St Bernard", "Labrador", "Husky","Poodle","Pug"};

        Scanner scrn = new Scanner(System.in);
        String name;
        System.out.println("What is your dog's name?");
        name = scrn.nextLine();
        System.out.println("Well then, I have this highly reliable report on "
                + name + "'s prestigious background right here.\n\n"
                + name + " is: \n");

    //Generates 5 random percents that sum up to 100
    Random rng = new Random();

    //Generate array to store the percents


    //Generate the first four percents by geting a random number between 1-- and totaal
        for(int i = 0; i< 4; i++) {
        int randomPercent = rng.nextInt(100 - totalSoFar);
        percentArray[i] = randomPercent;
            totalSoFar += randomPercent;
           // System.out.println(randomPercent); print out numbers to see the logic!
            //System.out.println(totalSoFar);
         }

        //Get final value in the array by subtracting the totalSoFar from 100, so all the percents add to 100.
         percentArray[4]=100-totalSoFar;
            //System.out.println(percentArray[4]);


        //Display final results:
        for(int i =0; i <5; i++) {
            System.out.println(percentArray[i] + "% " + dogs[i]);
        }
        System.out.println("\nWow, that's QUITE the dog!");

    }
}
