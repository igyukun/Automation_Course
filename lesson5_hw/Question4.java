package lesson5_hw;

import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        //Initialize the string array
        for (int i = 0; i < 3; i++) {
            arr.add("Str" + (i + 1));
        }

        //Iterate through the string array and print the second member
        for (int i=0; i< arr.size(); i++){
            if (i == 1) System.out.println("The second array member is: " + arr.get(i));
        }
    }
}
