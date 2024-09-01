public class OverloadedConstructor
{
    public static void main(String[] args) {
        Bhel bhel = new Bhel("chirmure");
        Bhel bhel1 = new Bhel("chirmure","tomato");
        Bhel bhel2 = new Bhel("chirmure","Tomato","Kanda0","Spicy");

        System.out.println(bhel2.toString());

    }
}
