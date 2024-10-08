package Filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

 class CopyFile {
    public static void main(String[] args) {
        // Define source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            // Open the source file for reading
            inputStream = new FileInputStream(sourceFile);
            // Open the destination file for writing
            outputStream = new FileOutputStream(destinationFile);

            // Buffer to hold bytes during file copy
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read bytes from the source file and write them to the destination file
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the streams to release resources
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }
    }
}

