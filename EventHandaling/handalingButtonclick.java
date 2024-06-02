package EventHandaling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class MyClick extends JFrame implements ActionListener
{
    JButton button = new JButton() ; 
    JLabel l1 ; 

    public MyClick()
    {
        setBounds( 100, 100, 300, 300 );;        
        setLayout( new FlowLayout() );
        

        // create button 

        JButton button = new JButton() ; 
        button.setSize(50, 60);
        add( button ) ;


        // create label 
        l1 = new JLabel() ; 
        add(l1) ;


        button.addActionListener(this);


        //frame visible 
        setVisible(true);


    }





    @Override
    public void actionPerformed( ActionEvent e )
    {
        l1.setText("Button Clicked!");
    }





}




public class handalingButtonclick {

    public static void main(String[] args)
    {
       new MyClick() ; 
    }
    
}
