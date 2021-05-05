package Raketengruendung.Login;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;



public class LoginView extends JPanel {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("LOGIN");

    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;

    public LoginView() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        //Hintergrund einfügen bei Anmeldeseiten
//        try {
//            BufferedImage myPicture = ImageIO.read(getClass().getResource("/main/resources/img/7.jpg"));
//            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
//            picLabel.setBounds(0, 0, 483, 580);
//            this.add(picLabel);
//        } catch (IOException ex) {
//            System.out.println("Das Bild wurde nicht gefunden");
//        }

        JLabel lblNewLabel = new JLabel(resourceBundle.getString("login"));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 36));
        lblNewLabel.setBounds(670, 13, 273, 93);
        this.add(lblNewLabel);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 21));
        textField.setBounds(700, 170, 160, 30);
        textField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        textField.setColumns(10);
        textField.setForeground(Color.WHITE);
        textField.setOpaque(false);
        this.add(textField);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 21));
        passwordField.setBounds(700, 286, 160, 30);
        passwordField.setOpaque(false);
        passwordField.setForeground(Color.WHITE);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(60,139,182)));
        this.add(passwordField);

        JLabel lblUsername = new JLabel(resourceBundle.getString("username"));
        lblUsername.setForeground(new Color(60,139,182));
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(560, 160, 193, 52);
        this.add(lblUsername);

        JLabel lblPassword = new JLabel(resourceBundle.getString("password"));
        lblPassword.setForeground(new Color(60,139,182));
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(585, 276, 193, 52);
        this.add(lblPassword);

        btnNewButton = new JButton(resourceBundle.getString("login"));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        btnNewButton.setBounds(640, 392, 162, 73);
        btnNewButton.setBorder(new RoundedBorders(30));
        btnNewButton.setContentAreaFilled(false);
        btnNewButton.setBackground(new Color(60,139,182));
        btnNewButton.setForeground(new Color(253, 253, 254));
        this.add(btnNewButton);

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

    public JButton getBtnNewButton() {
        return btnNewButton;
    }

    public void setBtnNewButton(JButton btnNewButton) {
        this.btnNewButton = btnNewButton;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
}
