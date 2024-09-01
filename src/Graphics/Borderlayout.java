package Graphics;

import javax.swing.*;
import java.awt.*;

public class Borderlayout
{
    // Layout Manger = Defines the natural layout for component within container

    // 3 common managers
    // BorderLayout = A BorderLayout places component is five areas: NORTH, SOUTH, WEST, EAST, CENTER
    //                  All extra space is placed in the center area.


    // You can also add the sub panel to the main panel use the
    // panel5.add() here panel 5 is act like a frame
    public static void main(String[] argc)
    {

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(new BorderLayout(10,10)); // 10 pixels of margin to panels

    frame.setVisible(true);

    JPanel  panel1 = new JPanel();
    JPanel  panel2 = new JPanel();
    JPanel  panel4 = new JPanel();
    JPanel  panel5 = new JPanel();
    JPanel  panel3 = new JPanel();

    panel1.setBackground(Color.red);
    panel2.setBackground(Color.green);
    panel3.setBackground(Color.blue);
    panel4.setBackground(Color.black);
    panel5.setBackground(Color.yellow);

    panel1.setPreferredSize(new Dimension(100,100));
    panel2.setPreferredSize(new Dimension(100,100));
    panel3.setPreferredSize(new Dimension(100,100));
    panel4.setPreferredSize(new Dimension(100,100));
    panel5.setPreferredSize(new Dimension(100,100));

    frame.add(panel1, BorderLayout.NORTH);
    frame.add(panel2, BorderLayout.WEST);
    frame.add(panel3, BorderLayout.EAST);
    frame.add(panel4, BorderLayout.SOUTH);
    frame.add(panel5, BorderLayout.CENTER);


    }

}
