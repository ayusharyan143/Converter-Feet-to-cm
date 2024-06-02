package EventHandaling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class LoginForm extends JFrame implements ActionListener {
    // Components of the form
    private Container container;
    private JLabel userLabel;
    private JTextField userTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton resetButton;
    private JLabel resultLabel;
 
    // Constructor to setup the GUI components and event handling
    public LoginForm() {
        // Set the title of the frame
        setTitle("Login Form");
 
        // Set the size of the frame
        setSize(400, 300);
 
        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Get the content pane
        container = getContentPane();
        container.setLayout(null);
 
        // Create user label and text field
        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        container.add(userLabel);
 
        userTextField = new JTextField();
        userTextField.setBounds(150, 50, 150, 30);
        container.add(userTextField);
 
        // Create password label and password field
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        container.add(passwordLabel);
 
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        container.add(passwordField);
 
        // Create login button and add action listener
        loginButton = new JButton("Login");
        loginButton.setBounds(50, 150, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);
 
        // Create reset button and add action listener
        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 150, 100, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);
 
        // Create result label to display login status
        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 200, 300, 30);
        container.add(resultLabel);
 
        // Make the frame visible
        setVisible(true);
    }
 
    // Override the actionPerformed method to handle button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());
 
            // Dummy validation logic (replace with actual validation)
            if (username.equals("user") && password.equals("pass")) {
                resultLabel.setText("Login successful!");
            } else {
                resultLabel.setText("Invalid username or password.");
            }
        } else if (e.getSource() == resetButton) {
            // Clear the text fields
            userTextField.setText("");
            passwordField.setText("");
            resultLabel.setText("");
        }
    }
 
    // Main method to launch the application
    public static void main(String[] args) {
        // Create an instance of the LoginForm
        new LoginForm();
    }
} 
    

