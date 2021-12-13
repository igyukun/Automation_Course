package lesson5_hw;

public class Question2 {
    public static void main(String[] args) {
        //Init string array
        String [] strArr = {"Ann","John","Rob"};
        //Print string array
        printArray(strArr);

        //Change the second name
        strArr[1] = "Jack";
        //Print string array
        printArray(strArr);

        //Print the third name
        System.out.println("The third name is: " + strArr[2]);

    }

    /**
     * printArray function prints all members of a string array passed as an argument
     */
    static void printArray(String [] str){
        for (String s: str) System.out.print(s + ", ");
        System.out.println();
    }
}
