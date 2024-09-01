package Filehandling;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        try{
            FileReader filereder = new FileReader("D:\\java\\first_code\\src\\Filehandling\\quotes.txt");
            int data = filereder.read();
            while(data != -1) {
                System.out.print((char)data);
                data = filereder.read();
            }
                filereder.close();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
