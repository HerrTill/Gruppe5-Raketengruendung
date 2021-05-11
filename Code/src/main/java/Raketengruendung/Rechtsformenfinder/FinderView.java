package Raketengruendung.Rechtsformenfinder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ResourceBundle;

public class FinderView extends JPanel {

    private JButton start = new JButton();
    private JButton home = new JButton();
    private JLabel welcome = new JLabel();

    public FinderView() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        //willkommen auf der Seite
        welcome.setFont(new Font("Tahoma", Font.PLAIN, 27));
        welcome.setBounds(520, 13, 460, 93);
        welcome.setBackground(new Color(60,139,182));
        welcome.setForeground(new Color(253, 253, 254));
        this.add(welcome);

        //Button start
        start.setFont(new Font("Tahoma", Font.PLAIN, 21));
        start.setBounds(580, 200, 340, 80);
        start.setBackground(new Color(17,9,48));
        start.setForeground(new Color(253, 253, 254));
        start.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        this.add(start);

        //Button zurück zum Hauptmenü
        home.setFont(new Font("Tahoma", Font.PLAIN, 21));
        home.setBounds(580, 300, 340, 80);
        home.setBackground(new Color(17,9,48));
        home.setForeground(new Color(253, 253, 254));
        home.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        this.add(home);


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

    public JLabel getWelcome() {
        return welcome;
    }

    public void setWelcome(JLabel welcome) {
        this.welcome = welcome;
    }
}
