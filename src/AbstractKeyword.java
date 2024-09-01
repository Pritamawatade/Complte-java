abstract class Origin{
    abstract void result();
}
abstract class Derived extends Origin{

    void show(){
        System.out.println("hi");
    }
}
//class Derivedtwo extends Derived{
//    void gap(){
//        result();
//    }
//
//}

class AbsttractKeyword{
    public static void main(String[] args) {
//      Derived d = new Derived();
//      d.show();
    }
}
