package Raketengruendung.Rechtsformenfinder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ResourceBundle;

public class FinderView extends JPanel {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("FINDER");
    private JButton start = new JButton();
    private JButton home = new JButton();
    private JLabel welcome = new JLabel();

    public FinderView() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        //willkommen auf der Seite
        welcome.setText(resourceBundle.getString("welcome"));
        welcome.setFont(new Font("Tahoma", Font.PLAIN, 30));
        welcome.setBounds(250, 50, 700, 150);
        welcome.setBackground(new Color(60,139,182));
        welcome.setForeground(new Color(253, 253, 254));
        this.add(welcome);

        //Button start
        start.setText(resourceBundle.getString("start"));
        start.setFont(new Font("Tahoma", Font.PLAIN, 21));
        start.setBounds(100, 300, 375, 200);
        start.setBackground(new Color(60,139,182));
        start.setForeground(new Color(253, 253, 254));
        this.add(start);

        //Button zurück zum Hauptmenü
        home.setText(resourceBundle.getString("mainMenu"));
        home.setFont(new Font("Tahoma", Font.PLAIN, 21));
        home.setBounds(525, 300, 375, 200);
        home.setBackground(new Color(60,139,182));
        home.setForeground(new Color(253, 253, 254));
        this.add(home);

        home.setBorder(new RoundedBorders(30));
        start.setBorder(new RoundedBorders(30));


//        btnNewButton.setBorder(new RoundedBorders(30));
//        btnNewButton.setContentAreaFilled(false);
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

    public JButton getStart() {
        return start;
    }

    public void setStart(JButton start) {
        this.start = start;
    }

    public JButton getHome() {
        return home;
    }

    public void setHome(JButton home) {
        this.home = home;
    }
}
