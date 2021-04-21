package Raketengruendung.Rechtsformenfinder.Fragen;

import Raketengruendung.Initial.Window;
import Raketengruendung.Rechtsformenfinder.initial.FinderLayout;

import javax.swing.*;
import java.awt.*;

public class FragenView extends JPanel {
    private JLabel LabelFrage = new JLabel();

    private JButton antwort1 = new JButton();
    private JButton antwort2 = new JButton();
    private JButton antwort3 = new JButton();
    private JButton antwort4 = new JButton();
    public FragenView(FragenModel fragenModel) {
        this.setText(fragenModel);

        this.add(LabelFrage);
        this.setLayout(new GridLayout(2,1));
        JPanel antworten = new JPanel();

        antworten.setLayout(new GridLayout(2,2));
        antworten.add(antwort1);
        antworten.add(antwort2);
        antworten.add(antwort3);
        antworten.add(antwort4);
        this.add(antworten);

        Window.update();

    }
    void setText(FragenModel fragenModel) {
        this.LabelFrage.setText(fragenModel.Frage);
        this.antwort1.setText(fragenModel.Antwort_1);
        this.antwort2.setText(fragenModel.Antwort_2);
        this.antwort3.setText(fragenModel.Antwort_3);
        this.antwort4.setText(fragenModel.Antwort_4);

    }
}
