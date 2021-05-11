package Raketengruendung.Login.Register;

import java.awt.*;
import javax.swing.*;

public class Register extends JPanel implements RegisterView{
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


        title.setFont(new Font("Tahoma", Font.PLAIN, 42));
        title.setBounds(670, 13, 273, 93);
        title.setForeground(Color.WHITE);
        this.add(title);


        userText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        userText.setBounds(540, 120, 110, 52);
        userText.setForeground(new Color(60,139,182));
        userText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(userText);


        passwordText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordText.setBounds(540, 180, 110, 52);
        passwordText.setForeground(new Color(60,139,182));
        passwordText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(passwordText);


        passwordText2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordText2.setBounds(540, 240, 110, 52);
        passwordText2.setForeground(new Color(60,139,182));
        passwordText2.setHorizontalAlignment(JLabel.RIGHT);
        this.add(passwordText2);


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

        registerButton.addActionListener(e->this.onRegisterCallback.execute());
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        registerButton.setBounds(650, 450, 162, 73);
        //registerButton.setBorder(new LoginView.RoundedBorders(30));
        //loginButton.setContentAreaFilled(false);
        registerButton.setBackground(new Color(17,9,48));
        registerButton.setForeground(new Color(60,139,182));
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
        this.passwordText2.setText(password);
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

