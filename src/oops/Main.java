package oops;
class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();
    }
}
