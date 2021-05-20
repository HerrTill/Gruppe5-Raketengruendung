package Raketengruendung.Login;


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

        loginButton.addActionListener(e->this.onLoginCallback.execute());
        loginButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        loginButton.setBounds(640, 395, 162, 73);
        loginButton.setBorder(new RoundedBorders(30));
        loginButton.setBackground(new Color(17,9,48));
        loginButton.setForeground(new Color(60,139,182));
        this.add(loginButton);

        registerButton.addActionListener(e->this.onRegisterCallback.execute());
        registerButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        registerButton.setBounds(689, 335, 165, 20);
        registerButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(60,139,182)));
        registerButton.setBackground(new Color(17,9,48));
        registerButton.setForeground(new Color(60,139,182));
        this.add(registerButton);
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
