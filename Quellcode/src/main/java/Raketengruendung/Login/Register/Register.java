package Raketengruendung.Login.Register;

import Raketengruendung.Master.Design.RoundedBorders;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Register extends JPanel implements RegisterView{
    private JLabel userText = new JLabel();
    private JLabel firstNameText = new JLabel();
    private JLabel lastNameText = new JLabel();
    private JLabel emailText = new JLabel();
    private JLabel mobileText = new JLabel();
    private JLabel passwordText = new JLabel();
    private JLabel passwordRepText = new JLabel();

    private JTextField firstname = new JTextField();
    private JTextField lastname = new JTextField();
    private JTextField emailField = new JTextField();
    private JTextField username = new JTextField();
    private JTextField mob = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JPasswordField passwordRepField = new JPasswordField();

    private JButton registerButton = new JButton();
    private JLabel title = new JLabel();

    private onRegister onRegisterCallback;

    public Register(){
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        try {
            BufferedImage myPicture = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/Theme.jpg")));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            picLabel.setBounds(0, 0, 483, 580);
            this.add(picLabel);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        this.title.setFont(new Font("Tahoma", Font.PLAIN, 42));
        this.title.setBounds(620, 13, 273, 93);
        this.title.setForeground(Color.WHITE);
        this.add(this.title);

        this.userText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.userText.setBounds(510, 120, 180, 52);
        this.userText.setForeground(new Color(60,139,182));
        this.userText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(this.userText);

        this.passwordText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.passwordText.setBounds(510, 180, 180, 52);
        this.passwordText.setForeground(new Color(60,139,182));
        this.passwordText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(this.passwordText);

        this.passwordRepText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.passwordRepText.setBounds(510, 240, 180, 52);
        this.passwordRepText.setForeground(new Color(60,139,182));
        this.passwordRepText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(this.passwordRepText);

        this.emailText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.emailText.setBounds(510, 300, 180, 52);
        this.emailText.setForeground(new Color(60,139,182));
        this.emailText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(this.emailText);

        this.username.setFont(new Font("Tahoma", Font.PLAIN, 19));
        this.username.setBounds(700, 127, 180, 30);
        this.username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.username.setForeground(new Color(130,130,130));
        this.username.setColumns(10);
        this.username.setOpaque(false);
        this.add(this.username);

        this.passwordField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        this.passwordField.setBounds(700, 187, 180, 30);
        this.passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.passwordField.setForeground(new Color(130,130,130));
        this.passwordField.setOpaque(false);
        this.add(this.passwordField);

        this.passwordRepField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        this.passwordRepField.setBounds(700, 247, 180, 30);
        this.passwordRepField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.passwordRepField.setForeground(new Color(130,130,130));
        this.passwordRepField.setOpaque(false);
        this.add(this.passwordRepField);

        this.emailField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        this.emailField.setBounds(700, 307, 180, 30);
        this.emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.emailField.setForeground(new Color(130,130,130));
        this.emailField.setColumns(10);
        this.emailField.setOpaque(false);
        this.add(this.emailField);

        this.registerButton.addActionListener(e->this.onRegisterCallback.execute());
        this.registerButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.registerButton.setBounds(650, 390, 173, 73);
        this.registerButton.setBorder(new RoundedBorders(30));
        this.registerButton.setBackground(new Color(17,9,48));
        this.registerButton.setForeground(new Color(60,139,182));
        this.add(registerButton);
    }

    @Override
    public void setOnRegister(onRegister callback) {
        onRegisterCallback = callback;
    }

    @Override
    public void setTitleText(String title) {
        this.title.setText(title);
    }

    @Override
    public void setUsernameText(String username) {
        this.userText.setText(username);
    }

    @Override
    public void setPasswordText(String password) {
        this.passwordText.setText(password);
    }

    @Override
    public void setPasswordReppText(String password) {
        this.passwordRepText.setText(password);
    }

    @Override
    public void setRegisterText(String register) {
        this.registerButton.setText(register);
    }

    @Override
    public void setEMailText(String email) {
        this.emailText.setText(email);
    }


}

