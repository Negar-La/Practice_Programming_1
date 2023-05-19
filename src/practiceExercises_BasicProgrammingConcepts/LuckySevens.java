package practiceExercises_BasicProgrammingConcepts;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args) {
        int rolls = 0;
        int maxMoney = 0;
        int maXMoneyRolls = 0;

        Scanner userInput = new Scanner(System.in);
        Random myRandom = new Random();

        System.out.println("How many dollars do you have?");
        int money = Integer.parseInt(userInput.nextLine());


        // roll the dice until player has no money left
        while (money > 0){
            int dice1 = myRandom.nextInt(6)+1;  // 1-6
            int dice2 = myRandom.nextInt(6)+1;  // 1-6

            if(dice1 + dice2 == 7) {
                money = money + 4;
                rolls++;
            } else {
                money = money -1;
                rolls++;
            }

            if(money > maxMoney) {
                maxMoney = money;
                maXMoneyRolls = rolls;

            }
            //  System.out.println("Money "+ money);
            //  System.out.println("maxMoney "+ maxMoney);
        }
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + maXMoneyRolls + " rolls when you had " + maxMoney + ".");







    }
}
