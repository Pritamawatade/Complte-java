//package Graphics;
//import java.awt.*;
//import java.awt.event.*;
//
//// Creating a class that extends Frame and implements ActionListener to handle button events
// class AWTExample extends Frame implements ActionListener {
//
//    // Declare the components
//    TextField tf;
//    Label label;
//    Button button;
//
//    // Constructor to set up the UI
//    AWTExample() {
//        // Create a TextField with 20 columns
//        tf = new TextField();
//        tf.setBounds(50, 50, 200, 30);  // Positioning the TextField on the frame
//
//        // Create a Label to display the result
//        label = new Label();
//        label.setBounds(50, 150, 250, 30);  // Positioning the Label on the frame
//
//        // Create a Button that will trigger an action
//        button = new Button("Show Text");
//        button.setBounds(50, 100, 100, 30);  // Positioning the Button on the frame
//
//        // Registering the Button with ActionListener
//        button.addActionListener(this);
//
//        // Add the components to the Frame
//        add(tf);
//        add(label);
//        add(button);
//
//        // Set properties of the Frame
//        setSize(400, 400);  // Set the size of the Frame
//        setLayout(null);  // Using no layout manager
//        setVisible(true);  // Make the Frame visible
//
//        // Close the Frame when the window is closed
//        addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                dispose();
//            }
//        });
//    }
//
//    // Action performed when button is clicked
//    public void actionPerformed(ActionEvent e) {
//        // Get the text entered in the TextField
//        String inputText = tf.getText();
//
//        // Set the text of the Label to display the entered text
//        label.setText("Entered Text: " + inputText);
//    }
//
//    // Main method to start the program
//    public static void main(String[] args) {
//        new AWTExample();  // Create an instance of AWTExample
//    }
//}
//
