package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new FlowLayout());

         textField = new JTextField();
         button = new JButton("Submit");
         button.addActionListener(this);
        textField.setPreferredSize(new Dimension(250,50));
        textField.setText("Enter your username..");
        textField.setEditable(true); // if false no one can change the value of the text field
        

        this.add(textField);
        this.add(button);

        this.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button){
            System.out.println("welcome " + textField.getText());
        }
    }
}
