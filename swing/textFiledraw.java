package swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

class Textfields extends Frame implements ActionListener
{

  TextField t1, t2, t3;
  Button b1, b2;

  public Textfields() {
    setLayout(new FlowLayout());

    t1 = new TextField("Enter First Number: ", 15);
    t2 = new TextField("Enter Second Number: ", 15);
    t3 = new TextField(10);

    b1 = new Button("SUM");
    b1.setBackground(Color.lightGray);
    
    b2 = new Button("SUBTRACTION");
    b2.setBackground(Color.GREEN);

    add(t1);
    add(t2);
    add(t3);
    add(b1);
    add(b2);

    b1.addActionListener(this);
    b2.addActionListener(this);

    setSize(400, 400);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e )
  {
    int a = Integer.parseInt(t1.getText());
    int b = Integer.parseInt(t2.getText());

    if (e.getSource() == b1)
    {
      t3.setText(String.valueOf(a + b));
    }
    else
    {
      t3.setText(String.valueOf(a - b));
    }

  }

}

public class textFiledraw {

  public static void main(String[] args)
  {
        JFrame f = new JFrame() ; 
        Textfields obj = new Textfields() ; 

        f.add(obj) ;
        f.setSize(500 , 400 );
        f.setLayout(null);
        f.setVisible(true);
    }
}
