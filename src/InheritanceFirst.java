public class InheritanceFirst
{
    //There are two classes Human and Car Human extends the Car class
    public static void main(String[] args) {

        Human human = new Human("pritam");
        human.carName = "landRover";

        human.drive();
        human.stop();
        System.out.println(human.carName);
    }
}
