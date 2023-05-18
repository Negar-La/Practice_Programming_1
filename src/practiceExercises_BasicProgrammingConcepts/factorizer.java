package practiceExercises_BasicProgrammingConcepts;

import java.util.Scanner;

public class factorizer {
    public static void main(String[] args) {
        //Declare variables:
        int number = 0;
        int numOfFactors = 0; //declare numOfFactors to use inside for loop to get number of divisors
        int sumOfFactors = 0; //declare sumOfFactors to use inside for loop to add divisors together


        Scanner myScanner = new Scanner(System.in);
        System.out.println("What number would you like to factor?");

        try { //wrap the whole code inside "try" block to catch the error if the input is not an integer.
            number = Integer.parseInt(myScanner.nextLine());
                System.out.println("The factors of " + number + " are:");

                //using a for loop to find all the divisors of the number:
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        System.out.print(i + " "); //i is the divisors of the number.
                        numOfFactors++;
                        sumOfFactors += i;
                    }
                }
                System.out.println("\n" + number + " has " + numOfFactors + " factors.");

                //perfect numbers are 6, 28, 496, 8128
                // print if number is a perfect number
                if (sumOfFactors - number == number) { //sumOfFactors includes the number itself, so we should subtract it, based on the definition of perfect number
                    System.out.println(number + " is a perfect number.");
                } else {
                    System.out.println(number + " is not a perfect number.");
                }

                // print if number is a prime number
                if (numOfFactors == 2) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
        } catch(NumberFormatException ex) {
            // Think of this kind of like an 'else' block for now. This is the code that will run
            // if the user doesn't enter a number.
            System.out.println("Input could not be parsed into an integer");
        }
    }
}
