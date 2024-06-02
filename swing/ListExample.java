package swing;

import javax.swing.*;

public class ListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Example");
        DefaultListModel<String> listModel = new DefaultListModel<>();
       
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
       
        JList<String> list = new JList<>(listModel);
       
        list.setBounds(100, 100, 100, 70); // x, y, width, height
       
        frame.add(list);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
