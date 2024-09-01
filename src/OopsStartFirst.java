public class OopsStartFirst
{
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.price);
        System.out.println(myCar.carName);
        System.out.println(myCar.color);

        myCar.drive();
        myCar.stop();
    }
}
