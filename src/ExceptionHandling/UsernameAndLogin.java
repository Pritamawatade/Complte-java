package ExceptionHandling;
import java.util.Scanner;
public class UsernameAndLogin extends Exception{
    UsernameAndLogin(String msg)
    {
        super(msg);
    }
}


class Main1 {
    static void check(String username , String password)throws UsernameAndLogin {
        if(username.length() < 5 || password.length() < 5){
            throw new UsernameAndLogin("\n The credentials are not correct");
        }
        else{
            System.out.println("\nusername: " + username + " password : "+ password);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username and password : ");
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        try {
            check(username, password);
        } catch (UsernameAndLogin e) {
            System.out.println("\nCaught the exception =  "+e);
            System.out.println("\ne.getMessage = "+e.getMessage());
        }
    }
}
