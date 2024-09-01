import  javax.swing.JOptionPane;

public class Gui1
{
    public static void main(String[] argc){
        String name = JOptionPane.showInputDialog("Enter you name ");
        JOptionPane.showMessageDialog(null,"Your name is "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null,"your age is "+age);
    }
}
