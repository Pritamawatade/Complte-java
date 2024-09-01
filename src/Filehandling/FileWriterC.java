package Filehandling;

import java.io.IOException;
import java.io.FileWriter;

public class FileWriterC{
    public static void main(String[] args) {
        try
        {

            FileWriter writer = new FileWriter("D:\\java\\first_code\\src\\Filehandling\\quotes.txt");
            writer.write("As long as I am alive there are infinite possibilities\n");
            writer.append(" i a, gonna be the king of the pirates");
            writer.append(" I am going to be world's greatest swordsman");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
