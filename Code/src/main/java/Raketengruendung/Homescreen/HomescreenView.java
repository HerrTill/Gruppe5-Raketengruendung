package Raketengruendung.Homescreen;

import javax.swing.*;
import java.awt.*;

public class HomescreenView extends JPanel {


    private JButton but1= new JButton();
    private JButton but2 = new JButton();
    private JButton but3 = new JButton();
    private JButton but4 = new JButton();
    private JButton language = new JButton();

    private JButton test = new JButton();

    private JLabel welcome = new JLabel();
    private JLabel finderL = new JLabel();
    private JLabel new_foundingL = new JLabel();
    private JLabel current_foundingL = new JLabel();
    private JLabel finished_foundingsL = new JLabel();

    private String finder;
    private String new_founding;
    private String current_founding;
    private String finished_foundings;


    public HomescreenView() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        /*
        Hier werden Sachen ausgetestet, die noch nicht vollständig implementiert sind
        Das müsste letzendlich Till übernehmen (aber nur wenn es fertig ist)
        --> zB die Probleme mit setText und Maven
         */
        test.setBounds(0, 0, 50, 50);
        this.add(test);


        welcome.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 38));
        welcome.setBounds(120, 50, 730, 150);
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
        language.setBounds(8, 8, 45, 25);
        this.add(language);

//-------------------------------------------------------------------------------------

        but1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but1.setBounds(50, 260, 200, 90);
        but1.setBackground(new Color(60,139,182));
        but1.setForeground(new Color(253, 253, 254));
        this.add(but1);

        but2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but2.setBounds(275, 260, 200, 90);
        but2.setBackground(new Color(60,139,182));
        but2.setForeground(new Color(253, 253, 254));
        this.add(but2);

        but3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but3.setBounds(500, 260, 200, 90);
        but3.setBackground(new Color(60,139,182));
        but3.setForeground(new Color(253, 253, 254));
        this.add(but3);

        but4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but4.setBounds(725, 260, 200, 90);
        but4.setBackground(new Color(60,139,182));
        but4.setForeground(new Color(253, 253, 254));
        this.add(but4);
    }

    public JButton getBut1() {
        return but1;
    }

    public JButton getBut2() {
        return but2;
    }

    public JButton getBut3() {
        return but3;
    }

    public void setBut1(JButton but1) {
        this.but1 = but1;
    }

    public void setBut2(JButton but2) {
        this.but2 = but2;
    }

    public void setBut3(JButton but3) {
        this.but3 = but3;
    }

    public JButton getBut4() {
        return but4;
    }

    public void setBut4(JButton but4) {
        this.but4 = but4;
    }

    public JLabel getWelcome() {
        return welcome;
    }

    public void setWelcome(JLabel welcome) {
        this.welcome = welcome;
    }

    public JLabel getFinderL() {
        return finderL;
    }

    public void setFinderL(JLabel finderL) {
        this.finderL = finderL;
    }

    public JLabel getNew_foundingL() {
        return new_foundingL;
    }

    public void setNew_foundingL(JLabel new_foundingL) {
        this.new_foundingL = new_foundingL;
    }

    public JLabel getCurrent_foundingL() {
        return current_foundingL;
    }

    public void setCurrent_foundingL(JLabel current_foundingL) {
        this.current_foundingL = current_foundingL;
    }

    public JLabel getFinished_foundingsL() {
        return finished_foundingsL;
    }

    public void setFinished_foundingsL(JLabel finished_foundingsL) {
        this.finished_foundingsL = finished_foundingsL;
    }

    public String getFinder() {
        return finder;
    }

    public void setFinder(String finder) {
        this.finder = finder;
    }

    public String getNew_founding() {
        return new_founding;
    }

    public void setNew_founding(String new_founding) {
        this.new_founding = new_founding;
    }

    public String getCurrent_founding() {
        return current_founding;
    }

    public void setCurrent_founding(String current_founding) {
        this.current_founding = current_founding;
    }

    public String getFinished_foundings() {
        return finished_foundings;
    }

    public void setFinished_foundings(String finished_foundings) {
        this.finished_foundings = finished_foundings;
    }

    public JButton getTest() {
        return test;
    }

    public void setTest(JButton test) {
        this.test = test;
    }
}
