package EndPracticalTheory;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ConverterApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Converter Calculator");

        // Frame components
        JLabel label1 = new JLabel("cm to feet and feet to cm Converter");
        JLabel label2 = new JLabel("[1 cm = 0.0328 feet and 1 foot = 30.48 cm]");



        label1.setBounds(155, 20, 400, 20);
        label2.setBounds(150, 40, 400, 20);



        // Radio buttons
        JRadioButton rbFeetToCm = new JRadioButton("Feet to cm");
        JRadioButton rbCmToFeet = new JRadioButton("cm to Feet");

        rbFeetToCm.setBounds(255, 80, 100, 20);
        rbCmToFeet.setBounds(355, 80, 100, 20);

        ButtonGroup group = new ButtonGroup();
        group.add(rbFeetToCm);
        group.add(rbCmToFeet);

        
        
        // Text area for input
        JTextArea inputArea = new JTextArea();
        inputArea.setBounds(152, 82, 90, 20);
        inputArea.setBorder(new LineBorder(Color.BLACK));

        
        
        // Convert button
        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(255, 130, 80, 20);

        
        
        // Result label and text field
        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();

        resultLabel.setBounds(355, 130, 60, 20);
        resultField.setBounds(420, 130, 100, 20);

        
        
        // Add action listener to the "Convert" button
        convertButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    double inputValue = Double.parseDouble(inputArea.getText());
                    double result;

                    if (rbFeetToCm.isSelected()) 
                    {
                        // Convert feet to cm
                        result = inputValue * 30.48;
                    } 
                    else if (rbCmToFeet.isSelected()) 
                    {
                        // Convert cm to feet
                        result = inputValue * 0.0328084;
                    } 
                    else 
                    {
                        resultField.setText("Select a conversion type");
                        return;
                    }
                    resultField.setText(String.valueOf(result));
                } 
                catch (NumberFormatException ex)
                {
                    resultField.setText("Invalid input");
                }
            }
        });

        
        
        // Adding components to the frame
        frame.add(label1);
        frame.add(label2);
        frame.add(rbFeetToCm);
        frame.add(rbCmToFeet);
        frame.add(inputArea);
        frame.add(convertButton);
        frame.add(resultLabel);
        frame.add(resultField);
        

        // Frame settings
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
