package swing;

import javax.swing.*;

public class TextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field Example");
        JTextField textField = new JTextField();
        textField.setBounds(100, 100, 120, 30); // x, y, width, height
        frame.add(textField);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
