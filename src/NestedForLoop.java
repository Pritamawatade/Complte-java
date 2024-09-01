import java.util.Scanner;
public class NestedForLoop
{
    public static void main(String[] argc)
    {
        int x,y;
        String symbol;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter number of rows");
        x = scanner.nextInt();
        System.out.println("Enter number of columns");
        y = scanner.nextInt();
        System.out.println("Enter symbol");
        symbol = scanner.next();

        //nested for loop
        for (int i = 1; i<=x; i++)
        {
            System.out.println();
            for (int j =1; j<=y; j++){
                System.out.print(symbol);
            }
        }
    }
}
