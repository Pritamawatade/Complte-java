package ExceptionHandling;

import java.util.Scanner;

public class User_defined extends Exception {
    public User_defined(String s) {
        throw new RuntimeException(s);
    }
}

class sum extends User_defined {
    public sum(String s) {
        super(s);
    }

    public void sum1() {
        System.out.println("Enter two numbers : \n");
        Scanner sc = new Scanner(System.in);
        try {

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class User_defined_Exception {
    public static void main(String[] args) {
        String msg = "";

        sum s = new sum(msg);
        s.sum1();

    }

}







