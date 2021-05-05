package Raketengruendung.Rechtsformenfinder;

import javax.swing.*;

public class FinderView extends JPanel {
    private JButton start;
    private JButton back;

    public FinderView() {
        this.add(Startscreen());
    }

    public JPanel Startscreen() {
        JPanel startscreen = new JPanel();
        JLabel welcome = new JLabel();
        welcome.setText("Willkommen beim Rechtsformenfinder");
        start = new JButton();
        start.setText("Starten");
        back = new JButton();
        back.setText("Hauptmenü");
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
