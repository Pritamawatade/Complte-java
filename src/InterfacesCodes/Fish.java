package InterfacesCodes;

public class Fish implements Prey, Predator{

    @Override
  public void flee(){
        System.out.println("This fish is smaller fish ");
    }

    public void hunt(){
        System.out.println("This is the big fish so it's hunting ");

    }


     void Demo(){
        System.out.println("h");
    }
     void femo(){
        System.out.println("f");
    }
}
