package package1;
import package2.*;

public class A  extends B{

    // There are 3 access modifier public , private , protected, (default is there of you do not specify it)
    // public gives you access to variable all over the project
    //private only gives access only within the class itself
    // protected gives access only if the the class is the subclass of the class in which the variable is declared

    public static void main(String[] argc)
    {
        C c  = new C();
        B b = new B();
        System.out.println(b.protectedMassage);

        System.out.println(c.publicMassage);
    }
}
