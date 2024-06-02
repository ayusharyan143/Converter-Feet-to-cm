package swing;

import java.awt.*;


class button
{
    button()
    {
        Frame f = new Frame() ;

        Button b1 = new Button("OK");
        b1.setBounds(100, 100, 50, 50);
        f.add(b1);

        

        Button b2 = new Button("click");
        b2.setBounds(120, 150, 100, 50);
        f.add(b2);

        

        Button b3 = new Button("submit");
        b3.setBounds(101, 101, 50, 50);
        f.add(b3);


        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);


        

    }
}




public class jbuttonExmp {

    public static void main(String[] args)
    {
         new button() ; 
        
    }
    
}
