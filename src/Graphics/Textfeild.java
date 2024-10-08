//package Graphics;
//import java.awt.*;
//import java.awt.event.*;
//
// class AWTExample extends Frame implements ActionListener {
//    TextField tf;
//    Label label;
//    Button button;
//
//    AWTExample() {
//        tf = new TextField();
//        tf.setBounds(50, 50, 200, 30);
//
//        label = new Label();
//        label.setBounds(50, 150, 250, 30);
//
//        // Import the correct Button class from java.awt package
//        button = new Button();
//        button.setBounds(50, 100, 100, 30);
//
//        // Registering the Button with ActionListener
//        button.addActionListener(this);
//
//        add(tf);
//        add(label);
//        add(button);
//
//        setSize(400, 400);
//        setLayout(null);
//        setVisible(true);
//
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                dispose();
//            }
//        });
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        String inputText = tf.getText();
//        label.setText("Entered Text: " + inputText);
//    }
//
//    public static void main(String[] args) {
//        new AWTExample();
//    }
//}