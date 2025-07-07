/* William Stearns
 * 7-7-25
 * CSD402
 * This program creates or appends to a file named "data.file",
 * writes 10 random integers separated by spaces,then reads and displays the file contents.
 */

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class DataFile {
    public static void main(String[] args) {
        String filename = "data.file";
        File file = new File(filename);
        Random rand = new Random();

        try {
            // Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + filename);
            } else {
                System.out.println("File already exists. Appending to it.");
            }

            // Append 10 random integers to the file
            FileWriter writer = new FileWriter(file, true); // 'true' enables append mode
            for (int i = 0; i < 10; i++) {
                int randomNumber = rand.nextInt(100); // Generates number 0–99
                writer.write(randomNumber + " ");
            }
            writer.write("\n"); // Add a newline after 10 numbers
            writer.close();
            System.out.println("10 random numbers written to file.");

            // Reopen the file and read its contents
            Scanner fileReader = new Scanner(file);
            System.out.println("\nContents of '" + filename + "':");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
    }
}
