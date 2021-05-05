package Raketengruendung.Rechtsformenfinder.Fragen;

import javax.swing.*;
import java.awt.*;

public class FragenView extends JPanel {
    private Frage[] answers = new Frage[3];
    private JLabel question = new JLabel();

    private JButton antwort1 = new JButton();
    private JButton antwort2 = new JButton();
    private JButton antwort3 = new JButton();
    private JButton mainMenu = new JButton();
    private JButton back = new JButton();

    public FragenView() {
        this.setLayout(null);

        //JLabel Frage oben
        question.setBounds(700, 150, 193, 52);
        this.add(question);

        //Hauptmenü Button
        mainMenu.setBounds(700, 300, 160, 30);
        this.add(mainMenu);

        //"Zurück Button
        back.setBounds(700, 350, 160, 30);
        this.add(back);

        //Alle Buttons für Antworten hinzufügen
        this.addButtons();
    }

    public void addButtons() {
        if (!antwort3.getText().equals("")) {
            //Button 1
            antwort1.setBounds(700, 200, 190, 50);
            this.add(antwort1);

            //Button2
            antwort2.setBounds(700, 250, 190, 50);
            this.add(antwort2);

            //Button 3
            this.add(antwort3);
        } else {
            //Button 1
            antwort1.setBounds(700, 200, 190, 50);
            this.add(antwort1);

            //Button2
            antwort2.setBounds(700, 250, 190, 50);
            this.add(antwort2);
        }
    }

    void setText(Frage frage) {
        this.clearAnswers();
        this.question.setText(frage.question);
        for (int i = 0; i < frage.getChildren().length; i++) {
            if (frage.getChildren()[i] != null) {
                answers[i] = frage.getChildren()[i];
            }
        }
        this.antwort1.setText(answers[0].getAnswer());
        this.antwort2.setText(answers[1].getAnswer());
        if (answers[2] != null) {
            this.antwort3.setText(answers[2].getAnswer());
        }
        addButtons();
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
