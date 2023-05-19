package flowcontrol.random;

import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args) {
        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));

    }

    /*
    What happens if you change randomizer.Next(101) to randomizer.Next(51) + 50? (Answer in a comment.)
        - it will produce random numbers above 50 (range: 50-100)

    Can you include random numbers in a math statement? (Answer in a comment.)
        - yes:
        int num1 = randomizer.nextInt(10);
        int num2 = randomizer.nextInt(20);
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " +  result);

    Experiment with different number types to see what the outcomes look like. (Record results in comments.)
     */
}
