import java.util.Random;
public class RandomClass
{
    public static void main(String[] argc)
    {
        Random random = new Random();
        int x = random.nextInt(7);
        boolean y = random.nextBoolean();
        double z = random.nextDouble();
        //You can also write this type of data types
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
