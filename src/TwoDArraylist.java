import java.util.*;
public class TwoDArraylist
{
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> grocery = new  ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("Tel");
        bakeryList.add("Ata");

        ArrayList<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("coconut");

        ArrayList<String> vegis = new ArrayList();
        vegis.add("methi");
        vegis.add("shifu");
        vegis.add("tandusha");

        grocery.add(bakeryList);
        grocery.add(fruits);
        grocery.add(vegis);

        System.out.println(grocery.get(0).get(2));


    }
}
