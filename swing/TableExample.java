package swing;

import javax.swing.*;

public class TableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Example");
        String[][] data = {{"1", "John", "Doe"}, {"2", "Jane", "Smith"}};
        String[] columns = {"ID", "First Name", "Last Name"};
        JTable table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 50, 300, 200); // x, y, width, height
        frame.add(scrollPane);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
