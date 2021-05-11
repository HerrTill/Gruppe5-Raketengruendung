package Raketengruendung.Rechtsformenfinder;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import java.util.ResourceBundle;

public class FinderView extends JPanel {

    private JButton start = new JButton();
    private JButton home = new JButton();
    private JLabel welcome = new JLabel();

    public FinderView() {
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

        welcome.setFont(new Font("Tahoma", Font.PLAIN, 27));
        welcome.setBounds(500, 20, 460, 93);
        welcome.setBackground(new Color(60,139,182));
        welcome.setForeground(new Color(253, 253, 254));
        this.add(welcome);

        start.setFont(new Font("Tahoma", Font.PLAIN, 21));
        start.setBounds(550, 200, 340, 80);
        start.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        start.setBackground(new Color(17,9,48));
        start.setForeground(new Color(253, 253, 254));
        this.add(start);

        home.setFont(new Font("Tahoma", Font.PLAIN, 21));
        home.setBounds(550, 300, 340, 80);
        home.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        home.setBackground(new Color(17,9,48));
        home.setForeground(new Color(253, 253, 254));
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
