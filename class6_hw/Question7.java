package class6_hw;

/**
 * This program reads a web page by provided URL, stores it into a local file and opens with a default system browser.
 * The workflows were learned from the following web resources:
 *    https://stackoverflow.com/questions/5867975/reading-websites-contents-into-string
 *    https://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
 */

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Question7 {

    public static void main(String[] args) {

        String pageURL = "https://www.scd.co.il/";  //web page URL
        String outputFilePath = "readURL.html";     //output file path to write the web page contents into

        try {
            //Connecting the requested URL and creating BufferedReader for getting an input stream
            URL uri = new URL(pageURL);
            BufferedReader bReader = new BufferedReader(new InputStreamReader(uri.openStream(), StandardCharsets.UTF_8));

            //Read the data from the input stream line-by-line using the StringBuffer class
            System.out.printf("Reading the web page by the URL: %s%n", pageURL);
            String bufferStr = "";
            StringBuilder sBld = new StringBuilder();
            while ((bufferStr = bReader.readLine()) != null) {
                sBld.append(bufferStr);
            }
            System.out.printf("%d characters has been read.%n", sBld.length());
            bReader.close();

            //Write the collected data into the output file
            System.out.printf("Writing the data into a local file: %s.%n", outputFilePath);
            Files.writeString(Paths.get(outputFilePath), sBld.toString());

            //Open created file with a default web browser (for Windows only)
            System.out.printf("Attempting to open the file with the default web browser...%n");
            if (Desktop.isDesktopSupported())
                Desktop.getDesktop().browse(new URI(outputFilePath));
            else
                System.out.printf("Could not open %s file with the default WEB browser.%n", outputFilePath);

        }catch (URISyntaxException | IOException e){
            e.printStackTrace();
        }

    }
}
