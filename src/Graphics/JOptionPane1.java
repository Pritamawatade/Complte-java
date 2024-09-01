package Graphics;

import javax.swing.*;

public class JOptionPane1 {
    public static void main(String[] args) {
//        JOptionPane := pop up a standard dialog box that will prompts to user for a value or used to show the info
//
//        JOptionPane.showMessageDialog(null, "This is the useless info " , "Pritam ", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is the useless info " , "Pritam ", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is the useless info " , "Pritam ", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is the useless info " , "Pritam ", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is the useless info " , "Pritam ", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showConfirmDialog(null, "Are you sure ?", "Bro", JOptionPane.YES_NO_CANCEL_OPTION);
        // it returns 0 for no, 1 for yes and -1 for cancel;

        // to take the input from the user
        String name = JOptionPane.showInputDialog("Are you awake..?");
        System.out.println(name);

        JOptionPane.showOptionDialog(null, "who am i? ", "everything", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null, 0);

        // for more information you can also set the value of icon(ImageIcon class)  and option(array) and pass it in there function


    }
}

