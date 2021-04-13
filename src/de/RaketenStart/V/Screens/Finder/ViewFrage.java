package de.RaketenStart.V.Screens.Finder;

import de.RaketenStart.M.Finder.ModelFrage;
import de.RaketenStart.V.Listener.onHomeClick;

import javax.swing.*;

public class ViewFrage extends JPanel {
    private JPanel panel = new JPanel();
    private JLabel LabelFrage = new JLabel();

    private JButton antwort1 = new JButton();
    private JButton antwort2 = new JButton();
    private JButton antwort3 = new JButton();
    private JButton antwort4 = new JButton();

    private JButton back = new JButton();
    private JButton home = new JButton();

    public ViewFrage(ModelFrage frage) {
        home.addActionListener(new onHomeClick());
        home.setText("Hauptmenü");
        back.setText("Zurück");
        this.setText(frage);

        this.add(LabelFrage);
        this.add(antwort1);
        this.add(antwort2);
        this.add(antwort3);
        this.add(antwort4);
        // this.add(back);
        this.add(home);
    }

    void setText(ModelFrage frage) {
        this.setFrage(frage.Frage);
        this.setAntwort1(frage.Antwort_1);
        this.setAntwort2(frage.Antwort_2);
        this.setAntwort3(frage.Antwort_3);
        this.setAntwort4(frage.Antwort_4);
    }

    void setFrage(String text) {
        LabelFrage.setText(text);
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
