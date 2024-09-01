import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] argc)
    {
        //ArrayList :- A resizable array. Elements can be added and removed after compilatiopn phase
                // stores reference datatype

        ArrayList<String> food = new ArrayList<String>();
        food.add("Edli");
        food.add("dosa");
        food.add("Bhendi");

        food.set(0,"potato");
        food.remove(1);
        food.clear();

        for (int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }
//        System.out.println(food.get(1));






    }
}
