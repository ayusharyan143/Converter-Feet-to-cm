package EventHandaling;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImplemEventDelegation {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Event Handling Example");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    frame.add(panel);
    placeComponents(panel);

    frame.setVisible(true);
  }

  private static void placeComponents(JPanel panel) {
    panel.setLayout(null);

    JButton button = new JButton("Click Me");
    button.setBounds(150, 100, 100, 50);
    panel.add(button);

    ActionListener buttonClickListener = new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Button was clicked!");
      }
    };

    button.addActionListener(buttonClickListener);
  }
}
