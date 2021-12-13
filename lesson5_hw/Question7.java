package lesson5_hw;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        System.out.println("Enter an integer between 1 and 4 inclusive:");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        switch (input){
            case 1:
                System.out.println(Seasons.WINTER);
                break;
            case 2:
                System.out.println(Seasons.SPRING);
                break;
            case 3:
                System.out.println(Seasons.SUMMER);
                break;
            case 4:
                System.out.println(Seasons.FALL);
                break;
            default:
                System.out.println("Incorrect input");

        }
    }
}
