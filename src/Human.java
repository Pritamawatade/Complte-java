public class Human extends Car
{
    String name;
    int age;
    double weight;
     Human(String name, int age, double weight)
     {
         this.name = name;
         this.age = age;
         this.weight = weight;

     }
     Human(String name)
     {
         this.name = name;
     }
     Human(){

     }

     @Override
     void stop (){
         System.out.println("overrding the stop method");
     }
}
