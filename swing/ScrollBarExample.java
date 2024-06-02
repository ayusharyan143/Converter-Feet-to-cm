package swing;

import javax.swing.*;

public class ScrollBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scroll Bar Example");
        JScrollPane scrollPane = new JScrollPane();
        JTextArea textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        scrollPane.setBounds(50, 50, 300, 200); // x, y, width, height
        frame.add(scrollPane);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
