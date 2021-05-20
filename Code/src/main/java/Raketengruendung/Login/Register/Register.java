package Raketengruendung.Login.Register;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class Register extends JPanel implements RegisterView{

    private JLabel title = new JLabel();
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

    private onRegister onRegisterCallback;

    public Register(){
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

        /*
        WICHTIG:
        Username, password, etc Rechtsbündig!!!!!! (Register)
        Rechtschreibfehler im Homescreen

        Bilder hinzufügen
        Hauptmenü Logo rechts neben willkommen

        Überprüfen, ob überall Werte eingegeben wurden (Register)
        Überprüfen, ob die Passwörter übereinstimmen (Register)
         */

        title.setFont(new Font("Tahoma", Font.PLAIN, 42));
        title.setBounds(620, 13, 273, 93);
        title.setForeground(Color.WHITE);
        this.add(title);

        userText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        userText.setBounds(510, 120, 180, 52);
        userText.setForeground(new Color(60,139,182));
        userText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(userText);

        passwordText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordText.setBounds(510, 180, 180, 52);
        passwordText.setForeground(new Color(60,139,182));
        passwordText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(passwordText);

        passwordText2.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordText2.setBounds(510, 240, 180, 52);
        passwordText2.setForeground(new Color(60,139,182));
        passwordText2.setHorizontalAlignment(JLabel.RIGHT);
        this.add(passwordText2);

        emailText.setFont(new Font("Tahoma", Font.PLAIN, 21));
        emailText.setBounds(510, 300, 180, 52);
        emailText.setForeground(new Color(60,139,182));
        emailText.setHorizontalAlignment(JLabel.RIGHT);
        this.add(emailText);

        username.setFont(new Font("Tahoma", Font.PLAIN, 19));
        username.setBounds(700, 127, 180, 30);
        username.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        username.setForeground(new Color(130,130,130));
        username.setColumns(15);
        username.setOpaque(false);
        this.add(username);

        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 19));
        passwordField.setBounds(700, 187, 180, 30);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        passwordField.setForeground(new Color(130,130,130));
        passwordField.setOpaque(false);
        this.add(passwordField);

        passwordField2.setFont(new Font("Tahoma", Font.PLAIN, 19));
        passwordField2.setBounds(700, 247, 180, 30);
        passwordField2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        passwordField2.setForeground(new Color(130,130,130));
        passwordField2.setOpaque(false);
        this.add(passwordField2);

        email.setFont(new Font("Tahoma", Font.PLAIN, 19));
        email.setBounds(700, 307, 180, 30);
        email.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        email.setForeground(new Color(130,130,130));
        email.setColumns(10);
        email.setOpaque(false);
        this.add(email);

        registerButton.addActionListener(e->this.onRegisterCallback.execute());
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        registerButton.setBounds(650, 390, 173, 73);
        registerButton.setBorder(new RoundedBorders(30));
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
}

