package Polymorphism;

public class PolymorphismCode
{
    public static void main(String[] argc)
    {
        Car car =  new Car();
        Boat boat = new Boat();
        Bycle bycle = new Bycle();


        Vahicle[] racers = {car, bycle, boat};

        for (Vahicle x  : racers)
        {
            x.go();
        }


    }
}
