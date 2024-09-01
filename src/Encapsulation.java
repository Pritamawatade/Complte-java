public class Encapsulation
{
    public static void main(String[] argc)
    {
        Car car = new Car("RangeRover", "white", 2027);
        Car car2 = new Car("new1","model1", 2006);

        car2.copy(car);

//        car.setMake("maruti suzuki");
//        car.setModel("alto");
//        car.setYear(2005);



        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

    }
}



/*
This is the code of the encapsulation it means warapping the data into the
secure layer of accesing modifyer private and making the appropriate methods to call on that,

 */
