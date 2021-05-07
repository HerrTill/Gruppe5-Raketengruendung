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

        /*
        WICHTIG:
        Hier noch ein Checkfield, dass man die Datenschutzbedingungen akzeptiert?
        LanguageButton auch schon bei Anmeldung und Registrierung!
        Überprüfen, ob überall Werte eingegeben wurden (Register)
        Überprüfen, ob die Passwörter übereinstimmen (Register)
        Username, password, etc Rechtsbündig!!!!!! (Register)
        RegisterButton noch implementieren --> führt einen zum Homescreen
        "Neues Unternehmen gründen" noch implementieren
        Rechtschreibfehler im Homescreen
        Bilder hinzufügen!!!!!!!!
        kein Account? Registriere hier --> rechtsbündig und breiter machen weil duetsch länger ist
        Hauptmenü Logo rechts neben willkommen
        evtl logoutbutton mainscreen
        Button Border mit drüberhovern !!!!!!!!!!!!!!!!!!!!!!!!!! bei drüberhovern soll das auf Button angezeigt werden
        Buttondesign bei Fragen sieht eig gut aaus
        bei FragenView selbes Design wie bei LoginView mit Raketengründung links
        "Neues Unternehmen gründen" noch ausprogrammieren

        ALLES AN BILDERN DESIGNEN UND IMPLEMENTIEREN
         */

        title.setText("Register");
        title.setFont(new Font("Tahoma", Font.PLAIN, 42));
        title.setBounds(670, 13, 273, 93);
        title.setForeground(Color.WHITE);
        this.add(title);

        userText.setText("Username");
        userText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        userText.setBounds(540, 120, 110, 52);
        userText.setForeground(new Color(60,139,182));
        userText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(userText);

        passwordText.setText("password");
        passwordText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordText.setBounds(540, 180, 110, 52);
        passwordText.setForeground(new Color(60,139,182));
        passwordText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(passwordText);

        passwordText2.setText("password");
        passwordText2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordText2.setBounds(540, 240, 110, 52);
        passwordText2.setForeground(new Color(60,139,182));
        passwordText2.setHorizontalAlignment(JLabel.RIGHT);
        this.add(passwordText2);

        emailText.setText("email");
        emailText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        emailText.setBounds(540, 300, 110, 52);
        emailText.setForeground(new Color(60,139,182));
        emailText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(emailText);




        username.setFont(new Font("Tahoma", Font.PLAIN, 19));
        username.setBounds(660, 127, 175, 30);
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        username.setForeground(new Color(100,100,100));
        username.setColumns(10);
        username.setOpaque(false);
        this.add(username);

        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        passwordField.setBounds(660, 187, 175, 30);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        passwordField.setForeground(new Color(100,100,100));
        passwordField.setOpaque(false);
        this.add(passwordField);

        passwordField2.setFont(new Font("Tahoma", Font.PLAIN, 19));
        passwordField2.setBounds(660, 247, 175, 30);
        passwordField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        passwordField2.setForeground(new Color(100,100,100));
        passwordField2.setOpaque(false);
        this.add(passwordField2);

        email.setFont(new Font("Tahoma", Font.PLAIN, 19));
        email.setBounds(660, 307, 175, 30);
        email.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        email.setForeground(new Color(100,100,100));
        email.setColumns(10);
        email.setOpaque(false);
        this.add(email);

        registerButton.setText("register");
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        registerButton.setBounds(650, 450, 162, 73);
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

