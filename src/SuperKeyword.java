public class SuperKeyword
{
    public static void main(String[] argc)
    {
        // super = keyword refers to the superclass(parent) of an
        //  object similar to the "this" keywords

        Hero hero = new Hero("Batman", 45, "$$$");
        Hero hero2 = new Hero("Ironman", 45, "genius");

        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);

        System.out.println(hero2.toString());


    }
}
