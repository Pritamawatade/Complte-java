package Graphics;

import javax.swing.*;
import java.awt.*;

class JLayerdPane1 {
    public static void main(String[] args) {
        // JLayerdPane = swing container that provides a third dimension for positioning components. ex. depth , z-index

        JLabel lable1 = new JLabel();
        lable1.setOpaque(true);
        lable1.setBackground(Color.red);
        lable1.setBounds(50, 50, 200, 200);

        JLabel lable2 = new JLabel();
        lable2.setOpaque(true);
        lable2.setBackground(Color.green);
        lable2.setBounds(100, 100, 200, 200);

        JLabel lable3 = new JLabel();
        lable3.setOpaque(true);
        lable3.setBackground(Color.blue);
        lable3.setBounds(150, 150, 200, 200);


        JLayeredPane layerdPane = new JLayeredPane();
        layerdPane.setBounds(0, 0, 500, 500);
        layerdPane.add(lable1, Integer.valueOf(1));
        layerdPane.add(lable2, Integer.valueOf(0));
        layerdPane.add(lable3, JLayeredPane.DRAG_LAYER); // there are these types of layers in java jframe what they do is they help us to define which layer is gonna show on which layer you can also use the number instead of layer name they use in wrapper class

        JFrame frame = new JFrame("JLayerdPane");
        frame.add(layerdPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);

    }

}