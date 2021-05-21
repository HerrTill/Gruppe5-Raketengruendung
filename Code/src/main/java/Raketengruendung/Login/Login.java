package Raketengruendung.Login;


import Raketengruendung.Master.Design.RoundedBorders;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Login extends JPanel implements LoginView{

    private JLabel title = new JLabel();
    private JLabel lblUsername = new JLabel();
    private JLabel lblPassword = new JLabel();
    private JTextField textField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JButton loginButton = new JButton();
    private JButton registerButton = new JButton();

    private onLogin onLoginCallback;
    private onRegister onRegisterCallback;

    public Login() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        try {
           BufferedImage myPicture = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/7.jpg")));
           JLabel picLabel = new JLabel(new ImageIcon(myPicture));
           picLabel.setBounds(0, 0, 483, 580);
           this.add(picLabel);
        } catch (IOException ex) {
           System.out.println("Das Bild wurde nicht gefunden");
        }


        this.title.setForeground(Color.WHITE);
        this.title.setFont(new Font("Tahoma", Font.PLAIN, 42));
        this.title.setBounds(670, 13, 273, 93);
        this.add(title);

        this.textField.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.textField.setBounds(601, 200, 250, 30);
        this.textField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.textField.setColumns(10);
        this.textField.setForeground(new Color(100,100,100));
        this.textField.setOpaque(false);
        this.add(this.textField);

        this.passwordField.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.passwordField.setBounds(601, 300, 250, 30);
        this.passwordField.setOpaque(false);
        this.passwordField.setForeground(Color.WHITE);
        this.passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.add(this.passwordField);


        this.lblUsername.setForeground(new Color(60,139,182));
        this.lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.lblUsername.setBounds(600, 150, 193, 52);
        this.add(this.lblUsername);


        this.lblPassword.setForeground(new Color(60,139,182));
        this.lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.lblPassword.setBounds(600, 250, 193, 52);
        this.add(this.lblPassword);

        this.loginButton.addActionListener(e->this.onLoginCallback.execute());
        this.loginButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.loginButton.setBounds(640, 395, 162, 73);
        this.loginButton.setBorder(new RoundedBorders(30));
        this.loginButton.setBackground(new Color(17,9,48));
        this.loginButton.setForeground(new Color(60,139,182));
        this.add(this.loginButton);

        this.registerButton.addActionListener(e->this.onRegisterCallback.execute());
        this.registerButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        this.registerButton.setBounds(689, 335, 165, 20);
        this.registerButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(60,139,182)));
        this.registerButton.setBackground(new Color(17,9,48));
        this.registerButton.setForeground(new Color(60,139,182));
        this.add(this.registerButton);
    }

    @Override
    public void setTitleText(String title) {
        this.title.setText(title);
    }

    @Override
    public void setUsernameText(String username) {
        this.lblUsername.setText(username);
    }

    @Override
    public void setPasswordText(String password) {
        this.lblPassword.setText(password);
    }

    @Override
    public void setRegisterText(String register) {
        this.registerButton.setText(register);
    }

    @Override
    public void setLoginText(String login) {
        this.loginButton.setText(login);
    }

    @Override
    public void setOnLogin(onLogin callback) {
        onLoginCallback = callback;
    }

    @Override
    public void setOnRegister(onRegister callback) {
        onRegisterCallback = callback;
    }

}