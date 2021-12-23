package class6_hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question4 {
    public static void main(String[] args) {

        String filePath = "Players.csv";
        String sLine = "";
        String delimiter = ",";
        String [] sPlayers;
        int iCount = 0;

        try {
            //Create the buffered reader using a file path
            BufferedReader bReader = new BufferedReader(new FileReader(filePath));

            //iterate through the file and read the next line at each iteration
            while ((sLine = bReader.readLine()) != null)
            {
                //Split the line using coma as delimiter and put it into the string array
                sPlayers = sLine.split(delimiter);
                //Print the elements of the array
                System.out.println(sPlayers [0] + "\t\t" + sPlayers[1]);

                //Separate the first line (header) from the following lines
                if (iCount == 0)
                    System.out.println("=======================");
                iCount ++;
            }
            }catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }
}
