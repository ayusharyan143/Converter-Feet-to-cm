package swing;

import javax.swing.*;

public class jlabelExam {

    public static void main(String[] args) {
        
        JFrame f  = new JFrame("Label Example");
        JLabel label = new JLabel("Hello, Swing!") ; 

        label.setBounds(50,50,200,30);

        f.add(label);

        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
