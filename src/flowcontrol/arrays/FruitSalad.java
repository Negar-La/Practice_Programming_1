package flowcontrol.arrays;
import java.util.Arrays;
public class FruitSalad {
    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato",
                "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange",
                "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango",
                "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];

        // Code Recipe for fruit salad should go here!


        int numOfApples = 0;
        int numOfOranges = 0;
        int numOfFruits = 0; //defined this new index for new array fruitSalad.

        for (int i=0; i<fruit.length; i++) {
            String fruitName = fruit[i];
            if (fruitName.contains("berry") && numOfFruits < 12) { //As many berries as possible No more than twelve kinds of fruit
                fruitSalad[numOfFruits] = fruitName;
                numOfFruits++;
            } else if (fruitName.contains("Apple") && numOfFruits < 12) {
                if (numOfApples < 3) { //No more than three kinds of apples
                    numOfApples++;
                    fruitSalad[numOfFruits] = fruitName;
                    numOfFruits++;
                }
            } else if (fruitName.contains("Orange") && numOfFruits < 12) {
                if (numOfOranges < 2) { //No more than two kinds of orange
                    numOfOranges++;
                    fruitSalad[numOfFruits] = fruitName;
                    numOfFruits++;
                }
            } else if (!fruitName.contains("Tomato") && numOfFruits < 12) { //Definitely no tomatoes
                fruitSalad[numOfFruits] = fruitName;
                numOfFruits++;
            }
        }

        for (int i=0; i < fruitSalad.length; i++) {
            System.out.println((i+1) + ". " + fruitSalad[i]);
        }

        }
    }

