package swing;

import javax.swing.*;

public class chekbox {

    public static void main(String[] args) {
        
        JFrame f = new JFrame("check box"); 

        JLabel l1 = new JLabel("Select known Languages");
        f.add(l1);

        JCheckBox cb0 = new JCheckBox("Java");
        cb0.setBounds(100, 50, 120, 80);
        f.add(cb0);

        JCheckBox cb1 = new JCheckBox("Java");
        cb1.setBounds(100, 150, 50, 50);
        f.add(cb1);

        JCheckBox cb2 = new JCheckBox("Hindi");
        cb2.setBounds(100, 200, 80, 500);
        f.add(cb2);

        JCheckBox cb3 = new JCheckBox("CSE");
        cb3.setBounds(100, 250, 80, 50);
        f.add(cb3);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
