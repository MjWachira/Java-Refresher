// Java allows reading and writing files using classes from the java.io and java.nio packages.
// FileWriter: write text to a file
// BufferedReader: read text line-by-line

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String filePath = "example.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello from Java!\n");
            writer.write("File handling is easy.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}


