public class ObjectAsparameter
{
    public static void main(String[] argc)
    {
        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        car.carName = "landROver";
        car.whichCar(car);
        car1.whichCar(car);
        car2.whichCar(car);

        String x;
        String y;
        x = "FirstString";
        y = x;
        x = "changedString";
        System.out.println(x+y);
    }
}
