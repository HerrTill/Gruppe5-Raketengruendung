package Raketengruendung.Homescreen;

import javax.swing.*;
import java.awt.*;

public class Homescreen extends JPanel implements HomescreenView{

    private JButton but1= new JButton();
    private JButton but2 = new JButton();
    private JButton but3 = new JButton();
    private JButton but4 = new JButton();
    private JButton language = new JButton();

    private JLabel welcome = new JLabel();
    private JLabel finderL = new JLabel();
    private JLabel new_foundingL = new JLabel();
    private JLabel current_foundingL = new JLabel();
    private JLabel finished_foundingsL = new JLabel();

    private onLanguage onLanguageCallback;
    private onClickFinder onClickFinderCallback;
    private onClickNewFoundings onClickNewFoundingsCallback;
    private onClickCurrentFoundings onClickCurrentFoundingsCallback;
    private onClickFinishedFoundings onClickFinishedFoundingsCallback;

    public Homescreen() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        welcome.setFont(new Font("Helvetica", Font.BOLD + Font.ITALIC, 38));
        welcome.setBounds(100, 50, 800, 150);
        welcome.setBackground(new Color(60,139,182));
        welcome.setForeground(new Color(253, 253, 254));
        this.add(welcome);

        finderL.setFont(new Font("Tahoma", Font.PLAIN, 12));
        finderL.setBounds(50, 340, 200, 150);
        finderL.setBackground(new Color(60,139,210));
        finderL.setForeground(new Color(253, 253, 254));
        finderL.setOpaque(true);
        this.add(finderL);

        new_foundingL.setFont(new Font("Tahoma", Font.PLAIN, 12));
        new_foundingL.setBounds(275, 340, 200, 150);
        new_foundingL.setBackground(new Color(60,139,210));
        new_foundingL.setForeground(new Color(253, 253, 254));
        new_foundingL.setOpaque(true);
        this.add(new_foundingL);

        current_foundingL.setFont(new Font("Tahoma", Font.PLAIN, 12));
        current_foundingL.setBounds(500, 340, 200, 150);
        current_foundingL.setBackground(new Color(60,139,210));
        current_foundingL.setForeground(new Color(253, 253, 254));
        current_foundingL.setOpaque(true);
        this.add(current_foundingL);

        finished_foundingsL.setFont(new Font("Tahoma", Font.PLAIN, 12));
        finished_foundingsL.setBounds(725, 340, 200, 150);
        finished_foundingsL.setBackground(new Color(60,139,210));
        finished_foundingsL.setForeground(new Color(253, 253, 254));
        finished_foundingsL.setOpaque(true);
        this.add(finished_foundingsL);

        //language.setIcon(deutsche Flagge oder englische Flagge);
        language.addActionListener(e->this.onLanguageCallback.execute());
        language.setBounds(8, 8, 45, 25);
        this.add(language);

        but1.addActionListener(e->this.onClickFinderCallback.execute());
        but1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but1.setBounds(50, 260, 200, 90);
        but1.setBackground(new Color(60,139,182));
        but1.setForeground(new Color(253, 253, 254));
        this.add(but1);

        but2.addActionListener(e->this.onClickNewFoundingsCallback.execute());
        but2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but2.setBounds(275, 260, 200, 90);
        but2.setBackground(new Color(60,139,182));
        but2.setForeground(new Color(253, 253, 254));
        this.add(but2);

        but3.addActionListener(e->this.onClickCurrentFoundingsCallback.execute());
        but3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but3.setBounds(500, 260, 200, 90);
        but3.setBackground(new Color(60,139,182));
        but3.setForeground(new Color(253, 253, 254));
        this.add(but3);

        but4.addActionListener(e->this.onClickFinishedFoundingsCallback.execute());
        but4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but4.setBounds(725, 260, 200, 90);
        but4.setBackground(new Color(60,139,182));
        but4.setForeground(new Color(253, 253, 254));
        this.add(but4);
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
    public void setOnClickNewFoundings(onClickNewFoundings callback) {
        this.onClickNewFoundingsCallback = callback;
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
        this.welcome.setText(welcomeText);
    }

    @Override
    public void setFinderInformationText(String finderInformationText) {
        this.finderL.setText(finderInformationText);
    }

    @Override
    public void setFinderText(String finderButtonText) {
        this.but1.setText(finderButtonText);
    }

    @Override
    public void setNewFoundingInformationText(String newFoundingInformationText) {
        this.new_foundingL.setText(newFoundingInformationText);
    }

    @Override
    public void setNewFoundingText(String newFoundingText) {
        this.but2.setText(newFoundingText);
    }

    @Override
    public void setCurrentFoundingInformationText(String currentFoundingInformationText) {
        this.current_foundingL.setText(currentFoundingInformationText);
    }

    @Override
    public void setCurrentFoundingText(String currentFoundingText) {
        this.but3.setText(currentFoundingText);
    }

    @Override
    public void setFinishedFoundingInformationText(String finishedFoundingInformationText) {
        this.finished_foundingsL.setText(finishedFoundingInformationText);
    }

    @Override
    public void setFinishedFoundingText(String finishedFoundingText) {
        this.but4.setText(finishedFoundingText);
    }
}
