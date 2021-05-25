package Raketengruendung.Homescreen;

import javax.swing.*;
import java.awt.*;

public class Homescreen extends JPanel implements HomescreenView{

    private JButton finderButton = new JButton();
    private JButton newFoundingButton = new JButton();
    private JButton currentFoundingsButton = new JButton();
    private JButton finshedFoundingsButton = new JButton();
    private JButton languageButton = new JButton();

    private JLabel welcomeLabel = new JLabel();
    private JLabel finderLabel = new JLabel();
    private JLabel newFoundingLabel = new JLabel();
    private JLabel currentFoundingLabel = new JLabel();
    private JLabel finishedFoundingsLabel = new JLabel();

    private onLanguage onLanguageCallback;
    private onClickFinder onClickFinderCallback;
    private onClickNewFoundings onClickNewFoundingCallback;
    private onClickCurrentFoundings onClickCurrentFoundingsCallback;
    private onClickFinishedFoundings onClickFinishedFoundingsCallback;

    public Homescreen() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        this.welcomeLabel.setFont(new Font("Helvetica", Font.BOLD + Font.ITALIC, 38));
        this.welcomeLabel.setBounds(100, 50, 800, 150);
        this.welcomeLabel.setBackground(new Color(60,139,182));
        this.welcomeLabel.setForeground(new Color(253, 253, 254));
        this.add(this.welcomeLabel);

        this.finderLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        this.finderLabel.setBounds(50, 340, 200, 150);
        this.finderLabel.setBackground(new Color(60,139,210));
        this.finderLabel.setForeground(new Color(253, 253, 254));
        this.finderLabel.setOpaque(true);
        this.add(this.finderLabel);

        this.newFoundingLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        this.newFoundingLabel.setBounds(275, 340, 200, 150);
        this.newFoundingLabel.setBackground(new Color(60,139,210));
        this.newFoundingLabel.setForeground(new Color(253, 253, 254));
        this.newFoundingLabel.setOpaque(true);
        this.add(this.newFoundingLabel);

        this.currentFoundingLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        this.currentFoundingLabel.setBounds(500, 340, 200, 150);
        this.currentFoundingLabel.setBackground(new Color(60,139,210));
        this.currentFoundingLabel.setForeground(new Color(253, 253, 254));
        this.currentFoundingLabel.setOpaque(true);
        this.add(this.currentFoundingLabel);

        this.finishedFoundingsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        this.finishedFoundingsLabel.setBounds(725, 340, 200, 150);
        this.finishedFoundingsLabel.setBackground(new Color(60,139,210));
        this.finishedFoundingsLabel.setForeground(new Color(253, 253, 254));
        this.finishedFoundingsLabel.setOpaque(true);
        this.add(this.finishedFoundingsLabel);

        this.languageButton.addActionListener(e->this.onLanguageCallback.execute());
        this.languageButton.setBounds(8, 8, 90, 25);
        this.languageButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        this.languageButton.setBackground(new Color(17,9,48));
        this.languageButton.setForeground(new Color(253, 253, 254));
        this.add(this.languageButton);

        this.finderButton.addActionListener(e->this.onClickFinderCallback.execute());
        this.finderButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        this.finderButton.setBounds(50, 260, 200, 90);
        this.finderButton.setBackground(new Color(60,139,182));
        this.finderButton.setForeground(new Color(253, 253, 254));
        this.add(this.finderButton);

        this.newFoundingButton.addActionListener(e->this.onClickNewFoundingCallback.execute());
        this.newFoundingButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        this.newFoundingButton.setBounds(275, 260, 200, 90);
        this.newFoundingButton.setBackground(new Color(60,139,182));
        this.newFoundingButton.setForeground(new Color(253, 253, 254));
        this.add(this.newFoundingButton);

        this.currentFoundingsButton.addActionListener(e->this.onClickCurrentFoundingsCallback.execute());
        this.currentFoundingsButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        this.currentFoundingsButton.setBounds(500, 260, 200, 90);
        this.currentFoundingsButton.setBackground(new Color(60,139,182));
        this.currentFoundingsButton.setForeground(new Color(253, 253, 254));
        this.add(this.currentFoundingsButton);

        this.finshedFoundingsButton.addActionListener(e->this.onClickFinishedFoundingsCallback.execute());
        this.finshedFoundingsButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        this.finshedFoundingsButton.setBounds(725, 260, 200, 90);
        this.finshedFoundingsButton.setBackground(new Color(60,139,182));
        this.finshedFoundingsButton.setForeground(new Color(253, 253, 254));
        this.add(this.finshedFoundingsButton);
    }

    @Override
    public void setOnLanguageSwitch(onLanguage callback) {
        this.onLanguageCallback = callback;
    }

    @Override
    public void setOnClickFinder(onClickFinder callback) {
        this.onClickFinderCallback = callback;
    }

    @Override
    public void setOnClickNewFounding(onClickNewFoundings callback) {
        this.onClickNewFoundingCallback = callback;
    }

    @Override
    public void setOnClickCurrentFoundings(onClickCurrentFoundings callback) {
        this.onClickCurrentFoundingsCallback = callback;
    }

    @Override
    public void setOnClickFinishedFoundings(onClickFinishedFoundings callback) {
        this.onClickFinishedFoundingsCallback = callback;
    }

    @Override
    public void setWelcomeText(String welcomeText) {
        this.welcomeLabel.setText(welcomeText);
    }

    @Override
    public void setFinderInformationText(String finderInformationText) {
        this.finderLabel.setText(finderInformationText);
    }

    @Override
    public void setFinderText(String finderButtonText) {
        this.finderButton.setText(finderButtonText);
    }

    @Override
    public void setNewFoundingInformationText(String newFoundingInformationText) {
        this.newFoundingLabel.setText(newFoundingInformationText);
    }

    @Override
    public void setNewFoundingText(String newFoundingText) {
        this.newFoundingButton.setText(newFoundingText);
    }

    @Override
    public void setCurrentFoundingInformationText(String currentFoundingInformationText) {
        this.currentFoundingLabel.setText(currentFoundingInformationText);
    }

    @Override
    public void setCurrentFoundingText(String currentFoundingText) {
        this.currentFoundingsButton.setText(currentFoundingText);
    }

    @Override
    public void setFinishedFoundingInformationText(String finishedFoundingInformationText) {
        this.finishedFoundingsLabel.setText(finishedFoundingInformationText);
    }

    @Override
    public void setFinishedFoundingText(String finishedFoundingText) {
        this.finshedFoundingsButton.setText(finishedFoundingText);
    }

    @Override
    public void setLanguageSwitchText(String languageSwitchText) {
        this.languageButton.setText(languageSwitchText);
    }
}
