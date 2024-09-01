import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{

            System.out.println("Enter a number to be divided : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter a number to be devided by : ");
            int num2 = scanner.nextInt();

            int resul = num1/num2;
                System.out.println(resul);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Do not Enter 0 you dumb motherfucker");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter only number please");
        }

        finally {
            System.out.println("This is the block which is gonna excute no matter catch block is executed or not");
        }

    }
}
