class A{

    int x;
    void show()
    {
        System.out.println("The value of x = "+x);
    }
}

class   B extends A{
    int y;

    int x =20;
    void show(){
        super.x = 10;
        super.show();
        System.out.println("The value of y = "+y);
        System.out.println("The value of x = "+x);

    }
}

public class Super {
    public static void main(String args[]){
        B b = new B();
        b.x = 2;
        b.y=20;
        b.show();
    }
}