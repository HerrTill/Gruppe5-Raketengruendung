package Raketengruendung.Rechtsformenfinder.Fragen;

import javax.swing.*;
import java.awt.*;

public class FragenView extends JPanel {
    private Frage[] answers = new Frage[3];
    private JLabel question = new JLabel();

    private JPanel answerPanel = new JPanel();
    private JButton antwort1 = new JButton();
    private JButton antwort2 = new JButton();
    private JButton antwort3 = new JButton();
    public FragenView() {
        this.setLayout(new GridLayout(2,1));
        this.add(question);

        answerPanel.add(antwort1);
        answerPanel.add(antwort2);
        if (!antwort3.getText().equals("")) {
            answerPanel.add(antwort3);
            answerPanel.setLayout(new GridLayout(1, 3));
        } else {
            answerPanel.setLayout(new GridLayout(1,2));
        }


        this.add(answerPanel);

    }

    void setText(Frage frage) {
        this.clearAnswers();
        this.question.setText(frage.Frage);
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

    public JLabel getLabelFrage() {
        return question;
    }

    public void setLabelFrage(JLabel labelFrage) {
        question = labelFrage;
    }

    public JButton getAntwort1() {
        return antwort1;
    }

    public void setAntwort1(JButton antwort1) {
        this.antwort1 = antwort1;
    }

    public JButton getAntwort2() {
        return antwort2;
    }

    public void setAntwort2(JButton antwort2) {
        this.antwort2 = antwort2;
    }

    public JButton getAntwort3() {
        return antwort3;
    }

    public void setAntwort3(JButton antwort3) {
        this.antwort3 = antwort3;
    }

    public Frage[] getAnswers() {
        return answers;
    }

    public void setAnswers(Frage[] answers) {
        this.answers = answers;
    }
}
