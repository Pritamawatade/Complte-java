package Filehandling;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("D://java/first_code/src/Filehandling/text2.txt");
        System.out.println(file.createNewFile()); // it will createNewFile according to what path passed to the object constructor
        System.out.println("Can write ? " + file.canWrite());
        System.out.println("Can Read ? " + file.canRead());
        System.out.println("Can Execute ? " + file.canExecute());
        System.out.println("Is Absolute ? " + file.isAbsolute());
        System.out.println("Is Directory ? " + file.isDirectory());
        System.out.println("Is File ? " + file.isFile());
        System.out.println("Is Hidden ? " + file.isHidden());
        System.out.println("get name =  " + file.getName());
        System.out.println("get parent =  " + file.getParent());
        System.out.println("Path =  " + file.toPath());
        System.out.println("URl =  " + file.toURI());
        File[] fileNo = file.listFiles();

        try {
            for (File value : fileNo) {
                System.out.println(value.getName());

            }
        } catch (NullPointerException e) {
            System.out.println(" To see the list of files please :: Give the directory path which contain some files");
        }
    }
}
