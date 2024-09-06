/*
 * The above program is run on the command line.
 * It doesn't run in the IDE because the console is not available in the IDE.
 */
package Filehandling;
import java.io.Console;
class ReadStringTest{
    public static void main(String args[]){
        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine("Enter your name: ");
        System.out.println("Welcome "+n);
    }
}