package Filehandling;

import java.io.File;

 class FileHandling {

    public static void main(String[] args) {
            File file = new File("D:\\java\\first_code\\src\\Filehandling\\pirate_king.wav");
        try {


                System.out.println("The file exists :0!");
                System.out.println(file.getPath());
            if (file.exists()) {

                System.out.println(file.getAbsoluteFile());

                System.out.println(file.isFile());
            } else {
                System.out.println("File is not exist in the reality");
            }
        }
        catch(SecurityException e){
            System.out.println("Security exception is throw");
        }
        System.out.println(file.isFile());

    }


}
