package Raketengruendung.Homescreen;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class HomescreenView extends JPanel {
    private  ResourceBundle resourceBundle = ResourceBundle.getBundle("HOME");

    private JButton but1= new JButton();
    private JButton but2 = new JButton();
    private JButton but3 = new JButton();
    private JButton but4 = new JButton();
    private JButton language = new JButton();

    public HomescreenView() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        /*
        Hier werden Sachen ausgetestet, die noch nicht vollständig implementiert sind
        Das müsste letzendlich Till übernehmen (aber nur wenn es fertig ist)
        --> zB die Probleme mit setText und Maven
         */
        JLabel willkommen = new JLabel(resourceBundle.getString("welcome"));
        willkommen.setFont(new Font("Times New Roman", Font.BOLD + Font.ITALIC, 38));
        willkommen.setBounds(120, 50, 730, 150);
        willkommen.setBackground(new Color(60,139,182));
        willkommen.setForeground(new Color(253, 253, 254));
        this.add(willkommen);


        String text = resourceBundle.getString("finder-info") + resourceBundle.getString("finder");

        JLabel j1 = new JLabel("<html><div style='text-align: center;'>" + text + "</div></html>");
        j1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        j1.setBounds(50, 340, 200, 150);
        j1.setBackground(new Color(60,139,210));
        j1.setForeground(new Color(253, 253, 254));
        j1.setOpaque(true);
        this.add(j1);


        String text2 = resourceBundle.getString("new_founding-info") +  resourceBundle.getString("new_founding");

        JLabel f = new JLabel("<html><div style='text-align: center;'>" + text2 + "</div></html>");
        f.setFont(new Font("Tahoma", Font.PLAIN, 12));
        f.setBounds(275, 340, 200, 150);
        f.setBackground(new Color(60,139,210));
        f.setForeground(new Color(253, 253, 254));
        f.setOpaque(true);
        this.add(f);


        String text3 = resourceBundle.getString("current_foundings-info") +  resourceBundle.getString("current_foundings");

        JLabel r = new JLabel("<html><div style='text-align: center;'>" + text3 + "</div></html>");
        r.setFont(new Font("Tahoma", Font.PLAIN, 12));
        r.setBounds(500, 340, 200, 150);
        r.setBackground(new Color(60,139,210));
        r.setForeground(new Color(253, 253, 254));
        r.setOpaque(true);
        this.add(r);


        String text4 = resourceBundle.getString("finished_foundings-info") +  resourceBundle.getString("finished_foundings");

        JLabel v = new JLabel("<html><div style='text-align: center;'>" + text4 + "</div></html>");
        v.setFont(new Font("Tahoma", Font.PLAIN, 12));
        v.setBounds(725, 340, 200, 150);
        v.setBackground(new Color(60,139,210));
        v.setForeground(new Color(253, 253, 254));
        v.setOpaque(true);
        this.add(v);

        //language.setIcon(deutsche Flagge oder englische Flagge);
        language.setBounds(8, 8, 45, 25);
        this.add(language);

//-------------------------------------------------------------------------------------



        but1.setText(resourceBundle.getString("finder"));
        but1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but1.setBounds(50, 260, 200, 90);
        but1.setBackground(new Color(60,139,182));
        but1.setForeground(new Color(253, 253, 254));
        this.add(but1);

        but2.setText(resourceBundle.getString("new_founding"));
        but2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but2.setBounds(275, 260, 200, 90);
        but2.setBackground(new Color(60,139,182));
        but2.setForeground(new Color(253, 253, 254));
        this.add(but2);

        but3.setText(resourceBundle.getString("current_foundings"));
        but3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        but3.setBounds(500, 260, 200, 90);
        but3.setBackground(new Color(60,139,182));
        but3.setForeground(new Color(253, 253, 254));
        this.add(but3);

        but4.setText(resourceBundle.getString("finished_foundings"));
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
}
