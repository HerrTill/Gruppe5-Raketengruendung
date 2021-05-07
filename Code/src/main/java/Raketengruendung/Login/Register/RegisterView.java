package Raketengruendung.Login.Register;

import Raketengruendung.Login.LoginView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class RegisterView extends JPanel {
    private JLabel userText = new JLabel();
    private JLabel firstNameText = new JLabel();
    private JLabel lastNameText = new JLabel();
    private JLabel emailText = new JLabel();
    private JLabel mobileText = new JLabel();
    private JLabel passwordText = new JLabel();
    private JLabel passwordText2 = new JLabel();

    private JTextField firstname = new JTextField();
    private JTextField lastname = new JTextField();
    private JTextField email = new JTextField();
    private JTextField username = new JTextField();
    private JTextField mob = new JTextField();
    private JPasswordField passwordField = new JPasswordField();
    private JPasswordField passwordField2 = new JPasswordField();

    private JButton registerButton = new JButton();
    private JLabel title = new JLabel();

    public RegisterView(){
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        title.setText("Register");
        title.setFont(new Font("Tahoma", Font.PLAIN, 42));
        title.setBounds(670, 13, 273, 93);
        title.setForeground(Color.WHITE);
        this.add(title);


        userText.setText("Username");
        userText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        userText.setBounds(550, 120, 100, 52);
        userText.setForeground(new Color(60,139,182));
        this.add(userText);

        passwordText.setText("password");
        passwordText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordText.setBounds(550, 180, 100, 52);
        passwordText.setForeground(new Color(60,139,182));
        this.add(passwordText);

        passwordText2.setText("password");
        passwordText2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordText2.setBounds(550, 240, 100, 52);
        passwordText2.setForeground(new Color(60,139,182));
        this.add(passwordText2);

        username.setFont(new Font("Tahoma", Font.PLAIN, 21));
        username.setBounds(650, 125, 175, 30);
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        username.setForeground(new Color(100,100,100));
        username.setColumns(10);
        username.setOpaque(false);
        this.add(username);

        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordField.setBounds(650, 185, 175, 30);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        passwordField.setForeground(Color.WHITE);
        passwordField.setOpaque(false);
        this.add(passwordField);

        passwordField2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordField2.setBounds(650, 245, 175, 30);
        passwordField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        passwordField2.setForeground(Color.WHITE);
        passwordField2.setOpaque(false);
        this.add(passwordField2);

        registerButton.setText("register");
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        registerButton.setBounds(600, 500, 162, 73);
        //registerButton.setBorder(new LoginView.RoundedBorders(30));
        //loginButton.setContentAreaFilled(false);
        registerButton.setBackground(new Color(17,9,48));
        registerButton.setForeground(new Color(60,139,182));
        this.add(registerButton);
    }

    public JTextField getFirstname() {
        return firstname;
    }

    public void setFirstname(JTextField firstname) {
        this.firstname = firstname;
    }

    public JTextField getLastname() {
        return lastname;
    }

    public void setLastname(JTextField lastname) {
        this.lastname = lastname;
    }

    public JTextField getEmail() {
        return email;
    }

    public void setEmail(JTextField email) {
        this.email = email;
    }

    public JTextField getUsername() {
        return username;
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public JTextField getMob() {
        return mob;
    }

    public void setMob(JTextField mob) {
        this.mob = mob;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JButton getRegisterButton() { return registerButton; }

    public void setBtnNewButton(JButton registerButton) {
        this.registerButton = registerButton;
    }
}

