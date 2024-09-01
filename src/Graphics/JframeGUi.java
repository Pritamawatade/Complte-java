package Graphics;

import javax.swing.*;

public class JframeGUi {
    public static void main(String[] args) {

        JLabel lable =  new JLabel();
        lable.setText("king");
        lable.setHorizontalTextPosition(JLabel.RIGHT);
        JFrame frame = new JFrame();// Create a frame
        frame.setTitle("Jframe title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the application when the x button is pressed
//        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        frame.setSize(420, 420);
        frame.setResizable(false); // prevent from resizing by the user
        frame.setVisible(true);
        frame.add(lable);
    }
}
