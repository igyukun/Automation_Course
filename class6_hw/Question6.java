package class6_hw;

import java.io.IOException;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        CompressFile cFile = new CompressFile();
        cFile.getUserInput();

        if (cFile.getFileName().isEmpty()) {
            System.out.println("The original file name is empty.");
        } else {
            try {
                //Print the target directory contents before archiving
                System.out.print("Before compressing:");
                cFile.listTheFileDir();

                //call the compression method
                System.out.printf("%nCompressing the file: %s in the directory %s%n", cFile.getFileName(), cFile.getFileDir());
                cFile.compressSingleFile();
                System.out.printf("%nCompression has been completed. The archive name is: %s%n%n", cFile.getArchivePath());

                //Print the target directory contents after archiving
                System.out.print("After the compressing:");
                cFile.listTheFileDir();

            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
    }
}