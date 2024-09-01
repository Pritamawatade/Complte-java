public class Car {

    String carName = "range rover";
    int price = 8000000;
    String color = "white";

    private String make;
    private String model;
    private int year;

    Car(){}
    Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void drive(){
        System.out.println("you are driving the car");

    }
    void stop(){
        System.out.println("You are now hit the break");
    }
    void whichCar(Car car)
    {
        System.out.println("I have "+car.carName+" car in my house");
    }


public String getMake(){
    return make;
}

public String getModel(){
    return model;
}

public int getYear(){
    return year;
}
public void setMake(String make){
    this.make = make;
}

public void setModel(String model){
        this.model = model;
}

public void setYear(int year){
        this.year = year;
}

public void copy(Car x){
    this.setMake(x.getMake());
    this.setModel(x.getModel());
    this.setYear(x.getYear());



}

}



//static = A single copy of value is shared between the all the members
// of the class


