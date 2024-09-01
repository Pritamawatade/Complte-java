import java.util.Scanner;
public class userInput
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What's your name ? ");
    String name = scanner.nextLine();
    System.out.println("Whats you age");
    int age  = scanner.nextInt();
    scanner.nextLine();
    System.out.println("What is your favourite food");
    String food = scanner.nextLine();
    System.out.println("your name is "+ name);
        System.out.println("your age is "+ age);
        System.out.println("Your favourite food is "+ food);

        scanner.close();

    }
}
