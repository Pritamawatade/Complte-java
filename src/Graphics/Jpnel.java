package Graphics;
import javax.swing.*;
import java.awt.*;

public class Jpnel {
    public static void main(String[] args) {
// JPanel = A GUI component that used to hold the other component
        ImageIcon icon = new ImageIcon("D:\\java\\first_code\\src\\Graphics\\Screenshot_20231024_205720_MX Player.png");

        JLabel label = new JLabel();
        label.setText("hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.RIGHT);

        JLabel label2 = new JLabel();
        label2.setText("OREw");
        label2.setIcon(icon);
        label2.setVerticalAlignment(JLabel.BOTTOM);
        label2.setHorizontalTextPosition(JLabel.RIGHT);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250, 250);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        redpanel.add(label);
        bluePanel.add(label2);
        frame.add(redpanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

//        bluePanel.add(label);
//        greenPanel.add(label);
    }
}
