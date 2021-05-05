package Raketengruendung.Rechtsformenfinder;

import javax.swing.*;
import java.util.ResourceBundle;

public class FinderView extends JPanel {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("FINDER");
    private JButton start;
    private JButton home;
    private JLabel welcome = new JLabel();

    public FinderView() {
        this.setLayout(null);

        //willkommen auf der Seite
        welcome.setText(resourceBundle.getString("welcome"));
        welcome.setBounds(670, 13, 273, 93);
        this.add(welcome);

        //Button start
        start = new JButton();
        start.setText(resourceBundle.getString("start"));
        start.setBounds(700, 200, 160, 30);
        this.add(start);

        //Button zurück zum Hauptmenü
        home = new JButton();
        home.setText(resourceBundle.getString("home"));
        home.setBounds(700, 300, 160, 30);
        this.add(home);
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
