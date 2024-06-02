package EventHandaling ;

import java.awt.event.*;
import javax.swing.*;

public class EventHandlingDemo {

  public static void main(String[] args) {
    // Create a JFrame
    JFrame frame = new JFrame("Event Handling Demo");

    // Create a JButton
    JButton button = new JButton("Click Me");

    // Create a JTextField
    JTextField textField = new JTextField(20);

    // Add ActionListener to the button to handle ActionEvent
    button.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          textField.setText("Button Clicked");
        }
      }
    );

    // Add ItemListener to the checkbox to handle ItemEvent
    JCheckBox checkBox = new JCheckBox("Check Me");
    checkBox.addItemListener(
      new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED) textField.setText(
            "Checkbox Checked"
          ); else textField.setText("Checkbox Unchecked");
        }
      }
    );

    // Add KeyListener to the text field to handle KeyEvent
    textField.addKeyListener(
      new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
          textField.setText("Key Typed: " + e.getKeyChar());
        }
      }
    );

    // Add MouseListener to the text field to handle MouseEvent
    textField.addMouseListener(
      new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
          textField.setText("Mouse Entered");
        }

        public void mouseExited(MouseEvent e) {
          textField.setText("Mouse Exited");
        }
      }
    );

    // Add MouseWheelListener to the text field to handle MouseWheelEvent
    textField.addMouseWheelListener(
      new MouseWheelListener() {
        public void mouseWheelMoved(MouseWheelEvent e) {
          textField.setText("Mouse Wheel Rotated");
        }
      }
    );

    // Create a JPanel to hold components
    JPanel panel = new JPanel();
    panel.add(button);
    panel.add(checkBox);
    panel.add(textField);

    // Add the panel to the frame
    frame.add(panel);

    // Set frame properties
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
