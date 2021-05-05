package Raketengruendung.Rechtsformenfinder;

import javax.swing.*;
import java.util.ResourceBundle;

public class FinderView extends JPanel {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("FINDER");
    private JButton start;
    private JButton back;

    public FinderView() {
        JLabel welcome = new JLabel();
        welcome.setText(resourceBundle.getString("welcome"));
        start = new JButton();
        start.setText(resourceBundle.getString("start"));
        back = new JButton();
        back.setText(resourceBundle.getString("home"));
        this.add(welcome);
        this.add(start);
        this.add(back);
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
