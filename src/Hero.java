public class Hero extends Person
{
    String power;
    Hero( String name, int age ,String power)
    {
        super(name,age);
        this.power = power;
    }
    public String toString(){
        return super.toString()+this.power;
    }

    void go(){
        System.out.println("This is the method which is implemented by the child class");

    }
}
