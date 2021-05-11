package Raketengruendung.Login;


import Raketengruendung.Main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.ResourceBundle;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;


public class LoginView extends JPanel implements test{

    private JLabel title = new JLabel();
    private JLabel lblUsername = new JLabel();
    private JLabel lblPassword = new JLabel();
    private JTextField textField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JButton loginButton = new JButton();
    private JButton registerButton = new JButton();
    private JLabel label;

    public LoginView() {
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

        title.setFont(new Font("Tahoma", Font.PLAIN, 42));
        title.setBounds(670, 13, 273, 93);
        title.setForeground(Color.WHITE);
        this.add(title);

        textField.setFont(new Font("Tahoma", Font.PLAIN, 21));
        textField.setBounds(601, 200, 250, 30);
        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        textField.setColumns(10);
        textField.setForeground(new Color(130,130,130));
        textField.setOpaque(false);
        this.add(textField);

        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordField.setBounds(601, 300, 250, 30);
        passwordField.setOpaque(false);
        passwordField.setForeground(new Color(130,130,130));
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.add(passwordField);

        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(600, 150, 193, 52);
        lblUsername.setForeground(new Color(60,139,182));
        this.add(lblUsername);

        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(600, 250, 193, 52);
        lblPassword.setForeground(new Color(60,139,182));
        this.add(lblPassword);

//        loginButton.addActionListener(e->logInAfterClick());
        loginButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        loginButton.setBounds(640, 395, 162, 73);
        loginButton.setBorder(new RoundedBorders(30));
        loginButton.setBackground(new Color(17,9,48));
        loginButton.setForeground(new Color(60,139,182));
        this.add(loginButton);

        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        registerButton.setBounds(689, 335, 165, 20);
        registerButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(60,139,182)));
        registerButton.setBackground(new Color(17,9,48));
        registerButton.setForeground(new Color(60,139,182));
        this.add(registerButton);
    }

    public void logInAfterClick() {

    }

    class RoundedBorders implements Border {

        private int radius;


        RoundedBorders(int radius) {
            this.radius = radius;
        }


        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }


        public boolean isBorderOpaque() {
            return true;
        }


        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }



    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(JButton registerButton) {
        this.registerButton = registerButton;
    }

    public JLabel getTitle() {
        return title;
    }

    public void setTitle(JLabel title) {
        this.title = title;
    }

    public JLabel getLblUsername() {
        return lblUsername;
    }

    public void setLblUsername(JLabel lblUsername) {
        this.lblUsername = lblUsername;
    }

    public JLabel getLblPassword() {
        return lblPassword;
    }

    public void setLblPassword(JLabel lblPassword) {
        this.lblPassword = lblPassword;
    }
}
