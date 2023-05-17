package practiceExercises_BasicProgrammingConcepts;

import java.util.Scanner;

public class factorizer {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What number would you like to factor?");
        int number = Integer.parseInt(myScanner.nextLine());
        System.out.println("The factors of " + number+ " are:");
    }
}
