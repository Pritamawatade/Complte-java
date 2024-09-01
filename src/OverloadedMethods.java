public class OverloadedMethods
{
    public static void main(String[] argc)
    {
       final int X = add(10,10,22,2);
        System.out.println(X);

    }

    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }


}
