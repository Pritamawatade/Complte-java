public class ArrayOfObjects
{
    public static void main(String[] argc)
    {
          Human human1 = new Human("Luffy");
          Human human2 = new Human("zoro");
          Human human3 = new Human("sanji");

          Human[] crew = {human1, human2, human3};
        // you can also do this
        //Human[0] = human1;
        System.out.println(crew[0].name);
        System.out.println(crew[1].name);
        System.out.println(crew[2].name);
    }
}
