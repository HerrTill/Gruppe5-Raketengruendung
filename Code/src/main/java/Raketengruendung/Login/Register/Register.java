package Raketengruendung.Login.Register;

import Raketengruendung.Master.Design.RoundedBorders;

import java.awt.*;
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
        "Willkommen beim Rechtsformfinder" untereinander schreiben

        ALLES AN BILDERN DESIGNEN UND IMPLEMENTIEREN
         */


        this.title.setFont(new Font("Tahoma", Font.PLAIN, 42));
        this.title.setBounds(670, 13, 273, 93);
        this.title.setForeground(Color.WHITE);
        this.add(this.title);


        this.userText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.userText.setBounds(540, 120, 110, 52);
        this.userText.setForeground(new Color(60,139,182));
        this.userText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(this.userText);


        this.passwordText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.passwordText.setBounds(540, 180, 110, 52);
        this.passwordText.setForeground(new Color(60,139,182));
        this.passwordText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(this.passwordText);


        this.passwordRepText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.passwordRepText.setBounds(540, 240, 110, 52);
        this.passwordRepText.setForeground(new Color(60,139,182));
        this.passwordRepText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(this.passwordRepText);


        this.emailText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.emailText.setBounds(540, 300, 110, 52);
        this.emailText.setForeground(new Color(60,139,182));
        this.emailText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(this.emailText);

        this.username.setFont(new Font("Tahoma", Font.PLAIN, 19));
        this.username.setBounds(660, 127, 175, 30);
        this.username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.username.setForeground(new Color(100,100,100));
        this.username.setColumns(10);
        this.username.setOpaque(false);
        this.add(this.username);

        this.passwordField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        this.passwordField.setBounds(660, 187, 175, 30);
        this.passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.passwordField.setForeground(new Color(100,100,100));
        this.passwordField.setOpaque(false);
        this.add(this.passwordField);

        this.passwordRepField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        this.passwordRepField.setBounds(660, 247, 175, 30);
        this.passwordRepField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.passwordRepField.setForeground(new Color(100,100,100));
        this.passwordRepField.setOpaque(false);
        this.add(this.passwordRepField);

        this.emailField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        this.emailField.setBounds(660, 307, 175, 30);
        this.emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.emailField.setForeground(new Color(100,100,100));
        this.emailField.setColumns(10);
        this.emailField.setOpaque(false);
        this.add(this.emailField);

        this.registerButton.addActionListener(e->this.onRegisterCallback.execute());
        this.registerButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.registerButton.setBounds(650, 450, 162, 73);
        this.registerButton.setBorder(new RoundedBorders(30));
        this.registerButton.setBackground(new Color(17,9,48));
        this.registerButton.setForeground(new Color(60,139,182));
        this.add(this.registerButton);
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

