package audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        // Print the current working directory
        System.out.println("Current working directory: " + new File(".").getAbsolutePath());

        // Print all files in the current directory for verification
        File currentDir = new File(".");
        File[] filesList = currentDir.listFiles();
        System.out.println("Files in current directory:");
        if (filesList != null) {
            for (File f : filesList) {
                System.out.println(f.getName());
            }
        }

        // Define the file path
        String filePath = "D:\\java\\first_code\\src\\audio\\pirate_king.wav";

        // Check if the file exists
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File not found: " + file.getAbsolutePath());
            return;
        }

        // Print file information for debugging
        System.out.println("File path: " + file.getAbsolutePath());
        System.out.println("File exists: " + file.exists());
        System.out.println("File readable: " + file.canRead());

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();
        String response = scanner.next();
    }
}

