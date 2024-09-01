public class StringMethods
{
    public static void main(String[] args) {
        String name = "luffy";
        boolean result = name.equals("luffy");//it is case sensitive
        result = name.equalsIgnoreCase("Luffy");//insensitive
        int length = name.length();
        char value = name.charAt(2);
        int val = name.indexOf('l');
        /*
        *  Just like this there are below methods too that exixt in java
        * name.isEmpty()
        * name.toUppecase();
        * name.toLowercase();
        * name.trim();//to trim the spaces
        * name.replace('l','z'); // to replace one charchter with one another
        *
        * */

        System.out.println(result);
    }
}
