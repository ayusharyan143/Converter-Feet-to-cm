package swing;


import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class TextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Area Example");
        JTextArea textArea = new JTextArea();
        textArea.setBounds(100, 100, 50, 10); // x, y, width, height
        textArea.setBorder( new LineBorder(Color.BLACK) );
        frame.add(textArea);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

