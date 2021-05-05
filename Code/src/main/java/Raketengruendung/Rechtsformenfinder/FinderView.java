package Raketengruendung.Rechtsformenfinder;

import javax.swing.*;
import java.util.ResourceBundle;

public class FinderView extends JPanel {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("FINDER");
    private JButton start;
    private JButton back;

    public FinderView() {
        this.add(Startscreen());
    }

    public JPanel Startscreen() {
        JPanel startscreen = new JPanel();
        JLabel welcome = new JLabel();
        welcome.setText(resourceBundle.getString("welcome"));
        start = new JButton();
        start.setText(resourceBundle.getString("start"));
        back = new JButton();
        back.setText(resourceBundle.getString("home"));
        startscreen.add(welcome);
        startscreen.add(start);
        startscreen.add(back);
        return startscreen;
    }

    public JButton getStart() {
        return start;
    }

    public void setStart(JButton start) {
        this.start = start;
    }

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }
}
