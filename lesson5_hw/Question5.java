package lesson5_hw;
import java.util.Random;

public class Question5 {
    public static void main(String[] args) {
        int [] iArr = new int[6];
        int sum = 0;
        double avg = 0;

        Random r = new Random();
        //initialize the array with random integer values between 0 and 100
        for (int i: iArr) {
            iArr[i] = r.nextInt(100);
            System.out.print(iArr[i] + " ");
            sum += iArr[i];
        }
        System.out.println();

        //Calculate and display the average of the array
        avg = (double)sum/iArr.length;
        System.out.println("The average is: " + avg);








    }
}
