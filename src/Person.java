public abstract class Person
{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;

    }
 Person(){}
    public String toString(){
        return this.name+"\n"+this.age+"\n";

    }
    abstract void go();
}
