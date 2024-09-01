package Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JFrame implements ActionListener {
    JButton button;
    JLabel lable;

    Button() {

        ImageIcon icon = new ImageIcon("Screenshot_20231024_205720_MX Player.png");
        lable = new JLabel();
        lable.setIcon(icon);
        lable.setBounds(100,200,100,100);


        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setText("click me");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.ITALIC,25));
        button.setForeground(Color.cyan);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true) ; // False means the button is disable

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(lable);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
//            System.out.println("poo");
//            button.setEnabled(true) ; // False means the button is disable
            lable.setText("King of pirates");

            lable.setVisible(true);


        }

    }


}
