package class6_hw;

/**
 * The CompressFile class can be used for compressing of a single file
 * using ZipOutputStream class.
 * It allows methods for getting a user input and printing the
 * target folder contents
 */

import java.io.*;
import java.nio.file.FileSystems;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressFile {

    private String filePath = "";       //Full path to the file to be archived
    private String fileName = "";       //File name
    private String archiveName = "";    //archive name
    private String fileDir = "";        //File directory
    private File origFile = null;       //File object

    //return the full path to the original file
    public String getFilePath() {
        return filePath;
    }

    //request a user to enter a full path to the original file
    private void requestFilePath() {
        this.filePath = promptUser("Enter the full path to the file to be compressed: ");
        parseFilePath();
    }

    public String getFileDir() {
        return fileDir;
    }

    //return an original file name without the path
    public String getFileName() {
        return fileName;
    }

    //getting the file path and the archive name from the user
    public void getUserInput(){
        requestFilePath();
        requestArchiveName();
    }

    //parse the full path and extract the file name and the directory path
    private void parseFilePath() {
        try {
            origFile = new File(filePath);
            this.fileName = origFile.getName();
            this.fileDir = origFile.getParent();
            if (this.fileDir == null)
                this.fileDir = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
        } catch (NullPointerException e){
            System.out.printf("The file path is empty. %s", e.getMessage());
        }
    }

    //return compressed archive name
    public String getArchiveFileName() {
        return archiveName;
    }

    //return a full path to the compressed archive
    public String getArchivePath(){
        return fileDir + "\\" + archiveName;
    }

    //request a user to provide a name of the compressed archive without a full path
    private void requestArchiveName() {
        this.archiveName = promptUser("Enter the archive name (will be stored in the same directory):");
    }

    //prompt with the message and get user input
    private String promptUser(String message){
        Scanner s = new Scanner(System.in);
        System.out.println(message);
        return s.next();
    }

    //compress file using ZipOutputStream class. Throw IOException to be handled by a calling class
    public void compressSingleFile() throws IOException{
        byte [] buffer = new byte [1024]; //file read buffer

        ZipOutputStream arch = new ZipOutputStream(new FileOutputStream(getArchivePath()));
        FileInputStream fis = new FileInputStream(origFile);

        //Open a new zip entry
        arch.putNextEntry(new ZipEntry(origFile.getName()));

        int length = 0; //the lenth of the buffer read from the file input stream

        //read from the file input stream in chunks of 1024 until EOF is reached.
        while ((length = fis.read(buffer)) > 0){
            arch.write(buffer,0,length);
        }
        //Close the current zip entry
        arch.closeEntry();

        //Close input and output streams and release all associated resources
        fis.close();
        arch.close();
    }

    //print the directory contents
    public void listTheFileDir() {
        try {
            //Get the list of the files in the directory
            File[] ls = new File(fileDir).listFiles();
            System.out.printf("Directory contents:%n");
            System.out.println("---------------------------");

            //check if the directory is not empty
            if (ls != null) {
                //print the list of files and directories in the current directory
                for (File f : ls) {
                    if (f.isFile())
                        System.out.printf("File: %s%n", f.getName());
                    else if (f.isDirectory())
                        System.out.printf("Directory: %s%n", f.getName());
                }
            } else System.out.printf("The directory %s is empty.%n", fileDir);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------");
    }
}
