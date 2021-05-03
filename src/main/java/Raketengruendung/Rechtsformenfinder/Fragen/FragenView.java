package Raketengruendung.Rechtsformenfinder.Fragen;

import Raketengruendung.Initial.Window;
import Raketengruendung.Rechtsformenfinder.Rechtsform;
import Raketengruendung.Rechtsformenfinder.initial.FinderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FragenView extends JPanel {
    Frage[] answers = new Frage[3];
    FragenController controller;
    private JLabel LabelFrage = new JLabel();

    private JButton antwort1 = new JButton();
    private JButton antwort2 = new JButton();
    private JButton antwort3 = new JButton();
    public FragenView(FragenModel model, FragenController controller) {
        this.controller = controller;
        loadQuestion(model.getFrage());
    }

    public void loadQuestion(Frage frage) {
        this.removeAll();
        this.revalidate();
        if (frage.children[0] == null){
            FragenController.loadRechtsform(frage.Frage);
        } else {
            this.setText(frage);
            this.add(LabelFrage);
            this.setLayout(new GridLayout(2, 1));
            JPanel antworten = new JPanel();

            antwort1.addActionListener(e -> FragenController.nextQuestion(answers[0]));
            antworten.add(antwort1);

            antwort2.addActionListener(e -> FragenController.nextQuestion(answers[1]));
            antworten.add(antwort2);

            if (!antwort3.getText().equals("")) {
                antwort3.addActionListener(e -> FragenController.nextQuestion(answers[2]));
                antworten.add(antwort3);
                antworten.setLayout(new GridLayout(1, 3));
            } else {
                antworten.setLayout(new GridLayout(1, 2));
            }

            this.add(antworten);


            Window.update();

        }
    }

    public void loadRechtsform() {
        Rechtsform rechtsform = new Rechtsform();
        this.add(rechtsform);
        Window.update();
    }

    void setText(Frage frage) {
        this.clearAnswers();
        this.LabelFrage.setText(frage.Frage);
        for (int i = 0; i < frage.children.length; i++) {
            if (frage.children[i] != null) {
                answers[i] = frage.children[i];
            }
        }
        this.antwort1.setText(answers[0].getAnswer());
        this.antwort2.setText(answers[1].getAnswer());
        if (answers[2] != null) {
            this.antwort3.setText(answers[2].getAnswer());
        }

    }

    void clearAnswers() {
        this.answers[0] = null;
        this.answers[1] = null;
        this.answers[2] = null;
    }
}
