package EndPracticalTheory;

import javax.swing.*;
import java.awt.*;



class faceclass extends JPanel 
{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Drawing the face
        g2d.drawRect(50, 50, 200, 200);

        // Drawing the ears
        g2d.drawRect(30, 100, 20, 60);  // left ear
        g2d.drawRect(250, 100, 20, 60); // right ear

        // Drawing the eyes
        g2d.drawOval(90, 100, 40, 20);  // left eye
        g2d.drawOval(170, 100, 40, 20); // right eye

        // Drawing the pupils
        g2d.fillOval(105, 105, 10, 10); // left pupil
        g2d.fillOval(185, 105, 10, 10); // right pupil

        // Drawing the nose
        g2d.drawLine(150, 120, 150, 160);

        // Drawing the mouth
        g2d.drawOval(120, 180, 60, 20);
    }
}



public class swingFace {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Face Drawing Sqr");

        faceclass panel = new faceclass();
        frame.add(panel);
        
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    
}
