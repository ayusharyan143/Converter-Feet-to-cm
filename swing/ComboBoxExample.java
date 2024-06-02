package swing;

import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo Box Example");
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(100, 100, 100, 30); // x, y, width, height
        frame.add(comboBox);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
