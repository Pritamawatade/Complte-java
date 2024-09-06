package Filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) {
        String s = " This is the string";
        FileOutputStream File = null;
        try {
            File = new FileOutputStream("D:\\java\\first_code\\src\\Filehandling\\demo.txt");
        File.write(65); // Write A into the file
            byte[] b = s.getBytes(); // Write B into the file WHICH IS STRING
        File.write(b); // Write A into the file

            System.out.println("Write successfully");
        File.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
