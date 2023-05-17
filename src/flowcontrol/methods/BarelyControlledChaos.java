package flowcontrol.methods;

import java.util.Random;

public class BarelyControlledChaos {
    public static void main(String[] args) {


        String color = colorMethod(); // call color method here
        String animal = animalMethod(); // call animal method again here
        String colorAgain = colorMethod(); // call color method again here
        int weight = numberMethod(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = numberMethod(10, 20); // call number method,
        // with a range between 10 - 20
        int number = numberMethod(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = numberMethod(2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }


    // Method 1 - Write a method that returns a randomly chosen color
    public static String colorMethod() {
        Random myRandom = new Random();
        String[] colors = {"red", "blue", "yellow", "green", "pink"};
        int randomIndex = myRandom.nextInt(colors.length);
        return (colors[randomIndex]);
    }

    // Method 2 - Write a method that returns a randomly chosen animal
    public static String animalMethod() {
        Random myRandom = new Random();
        String[] animals = {"lion", "bird", "turtle", "dog", "cow"};
        int randomIndex = myRandom.nextInt(animals.length);
        return (animals[randomIndex]);
    }

    // Method 3 - Write another method that returns a random integer chosen from a range
    public static int numberMethod(int a, int b) {
            Random myRandom = new Random();
            int randomNumber = myRandom.nextInt((b-a)+1)+a;
            return randomNumber;
    }
}


