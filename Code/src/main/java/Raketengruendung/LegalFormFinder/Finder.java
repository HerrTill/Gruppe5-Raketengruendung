package Raketengruendung.LegalFormFinder;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Finder extends JPanel implements FinderView{

    private JButton startButton = new JButton();
    private JButton homeButton = new JButton();
    private JLabel welcomeLabel = new JLabel();
    private onClickStart onClickStartCallback;
    private onClickMainmenu onClickMainmenuCallback;

    public Finder() {
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

        this.welcomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
        this.welcomeLabel.setBounds(500, 20, 460, 93);
        this.welcomeLabel.setBackground(new Color(60,139,182));
        this.welcomeLabel.setForeground(new Color(253, 253, 254));
        this.add(this.welcomeLabel);

        this.startButton.addActionListener(e->this.onClickStartCallback.execute());
        this.startButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.startButton.setBounds(550, 200, 340, 80);
        this.startButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        this.startButton.setBackground(new Color(17,9,48));
        this.startButton.setForeground(new Color(253, 253, 254));
        this.add(this.startButton);

        this.homeButton.addActionListener(e->this.onClickMainmenuCallback.execute());
        this.homeButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.homeButton.setBounds(550, 300, 340, 80);
        this.homeButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        this.homeButton.setBackground(new Color(17,9,48));
        this.homeButton.setForeground(new Color(253, 253, 254));
        this.add(this.homeButton);
    }

    @Override
    public void setOnClickStart(onClickStart callback) {
        this.onClickStartCallback = callback;
    }

    @Override
    public void setOnClickMainmenu(onClickMainmenu callback) {
        this.onClickMainmenuCallback = callback;
    }

    @Override
    public void setTitleText(String titleText) {
        this.welcomeLabel.setText(titleText);
    }

    @Override
    public void setStartText(String startText) {
        this.startButton.setText(startText);
    }

    @Override
    public void setMainmenuText(String mainmenuText) {
        this.homeButton.setText(mainmenuText);
    }

}
