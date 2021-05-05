package Raketengruendung.Login;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ResourceBundle;

public class LoginView extends JPanel {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("LOGIN");

    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;

    public LoginView() {
        this.setLayout(null);
        JLabel lblNewLabel = new JLabel(resourceBundle.getString("login"));
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 273, 93);
        this.add(lblNewLabel);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        textField.setBounds(481, 170, 281, 68);
        this.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(481, 286, 281, 68);
        this.add(passwordField);

        JLabel lblUsername = new JLabel(resourceBundle.getString("username"));
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblUsername.setBounds(250, 166, 193, 52);
        this.add(lblUsername);

        JLabel lblPassword = new JLabel(resourceBundle.getString("password"));
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword.setBounds(250, 286, 193, 52);
        this.add(lblPassword);

        btnNewButton = new JButton(resourceBundle.getString("login"));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 392, 162, 73);

        this.add(btnNewButton);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        this.add(label);
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
