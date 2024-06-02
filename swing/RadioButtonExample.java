package swing;

import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");
        
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        
        radioButton1.setBounds(100, 100, 100, 30); // x, y, width, height
        radioButton2.setBounds(100, 150, 100, 30);
        
        ButtonGroup group = new ButtonGroup();
        
        group.add(radioButton1);
        group.add(radioButton2);
        
        frame.add(radioButton1);
        frame.add(radioButton2);
       
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

