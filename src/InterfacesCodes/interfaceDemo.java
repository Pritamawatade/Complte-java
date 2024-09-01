package InterfacesCodes;

interface demo1{
    int g = 12;
    int z =0;
    void sum(int a, int b);

    class minus{
        void minus1(int a , int b){
            System.out.println(a-b);
        }
    }

    minus m = new minus();
}
 public class interfaceDemo implements demo1 {
    @Override
    public void sum(int a, int b) {
        System.out.println(a+b+"hi");

    }
//    minus m1 = new minus();
//        m.minus1();


}
class Main {
    public static void main(String[] args){
        interfaceDemo i = new interfaceDemo();
        i.sum(1212,2121);
        System.out.println(i.g);

//        minus m = new demo1.minus();
//        m.minus1();

    }
}
