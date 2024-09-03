package ExceptionHandling;

public class NestedTryBlock {
    public static void main(String[] args) {

        int[] a = new int[4];
        a[0] = 1;
        try {
            try {
                try {
                    a[4] = 10;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("first catch is is executed");
                }
                a[1] = 50 / 2;
            } catch (ArithmeticException e) {
                System.out.println("second catch is executed ArithmeticException ");
            }

        } catch (Exception e) {
            System.out.println("third catch is executed which is generic catch block");
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(i+" = "+a[i]);
        }
    }
}
