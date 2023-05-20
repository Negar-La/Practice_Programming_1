package flowcontrol.arrays;
import java.util.Random;
public class HiddenNuts {
    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";  // We have allocated a random index as "nut"
        System.out.println("The nut has been hidden ...");

//        int randomIndex = squirrel.nextInt(hidingSpots.length);


        for(int i = 0; i < hidingSpots.length; i++) {
            if (hidingSpots[i] == "Nut"){
                System.out.println("Found it! It's in spot# " + i); //or  System.out.println("Found it! It's at # " + squirrel.nextInt(hidingSpots.length));
            }
        }


    }
}
