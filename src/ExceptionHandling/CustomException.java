package ExceptionHandling;

import java.util.Objects;
import java.util.Scanner;

class NoNullValueException extends Exception{

    NoNullValueException(String s){
        System.out.println(s);
    }

}

class GreaterThanSixException extends Exception{
    GreaterThanSixException(String s){
        super(s);
    }
}

public class CustomException {
    public static void main(String[] args) throws NoNullValueException , GreaterThanSixException {
        Scanner sc = new Scanner(System.in);

        String username = null;
        int pass = 0;

        try{
            username = sc.nextLine();
            pass = sc.nextInt();
            if (pass < 6)
                throw new GreaterThanSixException("Please enter value more that 6");

            if (Objects.equals(username, "null")){
                throw new NoNullValueException("user name is required");
            }
        }catch(ArithmeticException e ){
            System.out.println("some numbers error ");
        }
        System.out.println("username  = "+ username + " " + "password "+ pass);
    }
}
