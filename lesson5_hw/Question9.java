package lesson5_hw;

import java.util.ArrayList;
import java.util.Random;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random randNum = new Random();

        try {
            //fill up the array with a random set of integers
            for (int i = 0; i < 5; i++) {
                arr.add(randNum.nextInt(100));
            }
            //add 67 at arbitrary index for debug purpose
            arr.add(10, 67);

            //Print the entire array contents
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("===================");
            System.out.println("Exception caught:");
            e.printStackTrace();
            System.exit (-1);
        }

        //Check whether 67 is present in the array, and print a corresponding message
        if (arr.indexOf(67) !=-1)
            System.out.println("67 exists in this array");
        else
            System.out.println("67 does not exist in this array");

    }
}
