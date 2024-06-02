package swing;

import java.awt.* ;

import javax.swing.JFrame; 


class MyCanvas extends Canvas 
{
    public MyCanvas()
    {
        setBackground(Color.yellow);
        setSize(500 , 500 );
    }

    @Override
    public void paint(Graphics g)
    {
        g.drawOval(70, 80, 150, 150);

        g.setColor(Color.black);

        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        g.drawArc(130, 180, 50, 25, 180, 180);
    }
}




public class drawingface {

    public static void main(String[] args)
    {
        JFrame f = new JFrame("Create Canvas") ; 
        MyCanvas obj = new MyCanvas() ; 

        f.add(obj);
        f.setSize(500 , 400 );
        f.setLayout(null);
        f.setVisible(true);
        




    }
    
}
