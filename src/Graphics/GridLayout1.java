package Graphics;

import javax.swing.*;
import java.awt.*;

public class GridLayout1 {
    public static void main(String[] args) {
        // Layout manager :- define the natural layout for component within a container

        // Grid layout = places component in grid of cell. Each component takes all the available space within its cells.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JButton button1 = new JButton("1");
        frame.setLayout(new GridLayout(3,3,10,10)); // here 10 represent the horizontal and vertical space

        frame.add(button1);
        frame.add(new JButton("2")); // above syntax and this one both work
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setVisible(true);


    }
}