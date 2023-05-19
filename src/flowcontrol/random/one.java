package flowcontrol.random;

import java.util.Random;
import java.util.Scanner;
public class one {
    public static void main(String[] args) {



        int[] myArray = {5, 4, 3, 2, 1};

        for(int i = 0; i <myArray.length; i++) { //number of rows
            for (int j =0; j<myArray[i]; j++) { //number of stars in each line
                System.out.print("*");
            }
            System.out.println("");
        }


        int[] myArray2 = {10, 14, 30, 2, 11};

        for(int i = 0; i <myArray.length; i++) { //number of rows
            for (int j =0; j<myArray2[i]; j++) { //number of stars in each line
                System.out.print("*");
            }
            System.out.println("");
        }



//        int[] numbers = new int[6];
//        int[] nums = {12, 4, 5, 23, 1, 10, 8, 66};
//        int temp;
//        int min = nums[0];
//        int max = nums[0];
//
//        for(int i = 0; i< nums.length; i++) {
//            for(int j =0; j< nums.length-1; j++) {
//               if (nums[j] > nums[j+1]) {
//                   temp = nums[j];
//                   nums[j] = nums[j+1];
//                   nums[j+1] = temp;
//               }
//            }
//        }
//        System.out.println(nums[nums.length-1]);
//
//        for(int i = 0; i< nums.length; i++) {
//            if (min > nums[i]) {
//                min = nums[i];
//            }
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//
//        }
//        System.out.println("min : "+ min);
//        System.out.println("max : "+ max);

    }




}
