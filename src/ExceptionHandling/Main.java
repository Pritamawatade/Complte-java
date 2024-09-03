package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class Main {


    public static void main(String[] args) {
        String s = null;
        System.out.println("this is the example of the null pointer exception");
    // example of null pointer exception
        try{
            s.toLowerCase();

        }
        catch (NullPointerException e){
            System.out.print("Null thing can't be casted");
        }
        // FileNotFoundException
        try{
            var reader = new FileReader("User_defined.java");
            int data = (char) reader.read();
            while(data != -1){

            System.out.println((char)data);
            data = reader.read();
            }

        }
        catch(FileNotFoundException ex ){
            System.out.println("File is not exist");
        }
        catch(IOException | ArithmeticException ex ){  // mulitple exception if one of them is true
            System.out.println("We get an error in the second catch block");
        }

        finally {
            System.out.println("This is the finally block which will always get executed even if above blocks are not");

        }
    }

}

// JAVA provide the following mechanism to handle the exception they are :=
//      1>try
//      2>catch
//      3> throw
//      4> throws
//      5> finally

//    try and catch is used to handle the errors by our side means we catch the error and handle it
//    throw and throws are used to give the handling part to the jvm
//      finally is used to execute all the time even if other blocks are executed are not

// Types of Exception : 1> checked :- one which we developer write the code to check handle
//                        2> unchecked : These are the runtime exception which are checked by the JVM
//                      3> Error :- The error can happen becouse of the some external reason.

// Types of runtime exception :
//          1> NullPointerException : -When the value is null.
//          2> ArithmeticException :- When there is arithmetic mismatch
//          3>IllegalArugumenException :- As the name suggest
//          4>IndexOutOfBoundsExcception :- When there is more value than the size of the element
//          5> IllegalStateOperation :- When the underline object is not in the correct state.
