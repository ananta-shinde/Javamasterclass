package package1.swingdemos;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JFrame f;

    Login(){
        JPanel mainPanel = new JPanel();
        JLabel usernameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");
        JButton loginBtn = new JButton("Login");
        JTextField  usernameTextfield = new JTextField();
        JTextField  passwordTextfield = new JTextField();
        usernameTextfield.setBounds(200,100,200,50);
        passwordTextfield.setBounds(200,180,200,50);
        usernameLabel.setBounds(100,100,150,50);
        passwordLabel.setBounds(100,180,150,50);
        loginBtn.setBounds(200,260,100,50);

        setLayout(null);

        mainPanel.add(usernameLabel);
        mainPanel.add(usernameTextfield);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordTextfield);
        mainPanel.add(loginBtn);
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setBounds(200,100,500,500);
        mainPanel.setLayout(null);
        add(mainPanel);

        setBounds(500,500,1000,500);
        setVisible(true);
    }
}
