package de.RaketenStart.V.Screens.Finder;

import de.RaketenStart.V.Listener.onHomeClick;

import javax.swing.*;

public class ViewFrage extends JPanel {
    private JPanel panel = new JPanel();
    private JLabel frage = new JLabel();

    private JButton antwort1 = new JButton();
    private JButton antwort2 = new JButton();
    private JButton antwort3 = new JButton();
    private JButton antwort4 = new JButton();

    private JButton back = new JButton();
    private JButton home = new JButton();

    public ViewFrage() {
        home.addActionListener(new onHomeClick());
        home.setText("Hauptmenü");
        back.setText("Zurück");

        this.add(frage);
        this.add(antwort1);
        this.add(antwort2);
        this.add(antwort3);
        this.add(antwort4);
        // this.add(back);
        this.add(home);
    }

    void setFrage(String text) {
        frage.setText(text);
    }

    void setAntwort1(String text) {
        antwort1.setText(text);
    }

    void setAntwort2(String text) {
        antwort2.setText(text);
    }

    void setAntwort3(String text) {
        antwort3.setText(text);
    }

    void setAntwort4(String text) {
        antwort4.setText(text);
    }
}
