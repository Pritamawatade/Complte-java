package Polymorphism;
import java.util.Scanner;


public class DynamicPolymorphism {

    public static void main(String[] argc)
    {
        // Dyanamic polymorphism :- Polimorphism at run time

        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What the fuck do want");
        System.out.println("1>> Dog \n 2>>Cat");

        int choice = scanner.nextInt();

        if (choice == 1 )
        {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            System.out.println("You have choosed the wroung the animal");
            animal = new Animal();
            animal.speak();
        }



    }
}
