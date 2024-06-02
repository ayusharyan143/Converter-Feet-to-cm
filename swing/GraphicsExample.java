package swing;

import javax.swing.*;
import java.awt.*;

public class GraphicsExample extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw a rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 50); // x, y, width, height
        
        // Draw an oval
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 80, 80); // x, y, width, height
        
        // Draw a line
        g.setColor(Color.GREEN);
        g.drawLine(50, 150, 250, 150); // x1, y1, x2, y2
        
        // Draw text
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Hello, Graphics!", 50, 200); // text, x, y
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Graphics Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new GraphicsExample());
        frame.setVisible(true);
    }
}
