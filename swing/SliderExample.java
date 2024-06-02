package swing;

import javax.swing.*;

public class SliderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Slider Example");
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBounds(50, 50, 300, 50); // x, y, width, height
        frame.add(slider);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
