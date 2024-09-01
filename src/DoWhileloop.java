import java.util.Scanner;
public class DoWhileloop
{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String y = scanner.nextLine();
        int x =0;
        do {
            System.out.println("pritam");
            x++;
            if (y.isBlank())
            {
                System.out.println("You have not enterd a value");
            }
        }while(x < 10);
    }
}
