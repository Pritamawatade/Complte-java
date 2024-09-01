//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Array
 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        int []a = new int[5];
        a[0] = 12;
        a[1] = 11;
        a[2] = 10;
        a[3] = 9;
        a[4] = 8;
        System.out.println(a.length);
          for (int i = 0; i <= a.length; i++)
                System.out.println(a[i]);
        
    }
}