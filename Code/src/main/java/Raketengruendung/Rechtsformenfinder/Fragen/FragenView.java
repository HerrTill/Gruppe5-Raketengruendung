package Raketengruendung.Rechtsformenfinder.Fragen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;
import java.util.ResourceBundle;

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
        this.setBackground(new Color(17,9,48));

        try {
            BufferedImage myPicture = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/7.jpg")));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            picLabel.setBounds(0, 0, 483, 580);
            this.add(picLabel);
        } catch (IOException ex) {
            System.out.println("Das Bild wurde nicht gefunden");
        }

        question.setFont(new Font("Tahoma", Font.PLAIN, 30));
        question.setBounds(500, 50, 500, 100);
        question.setBackground(new Color(60,139,182));
        question.setForeground(new Color(253, 253, 254));
        this.add(question);

        mainMenu.setBounds(866, 485, 110, 27);
        mainMenu.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        mainMenu.setBackground(new Color(17,9,48));
        mainMenu.setForeground(new Color(60,139,182));
        this.add(mainMenu);

        back.setBounds(866, 520, 110, 27);
        back.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        back.setBackground(new Color(17,9,48));
        back.setForeground(new Color(60,139,182));
        this.add(back);

        this.addButtons();
    }

    public void addButtons() {
        if (!antwort3.getText().equals("")) {

            antwort1.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort1.setBounds(490, 150, 460, 65);
            antwort1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort1.setBackground(new Color(17,9,48));
            antwort1.setForeground(new Color(253, 253, 254));
            this.add(antwort1);

            antwort2.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort2.setBounds(490, 225, 460, 65);
            antwort2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort2.setBackground(new Color(17,9,48));
            antwort2.setForeground(new Color(253, 253, 254));
            this.add(antwort2);

            antwort3.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort3.setBounds(490, 300, 460, 65);
            antwort3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort3.setBackground(new Color(17,9,48));
            antwort3.setForeground(new Color(253, 253, 254));
            this.add(antwort3);
        } else {

            antwort1.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort1.setBounds(490, 200, 460, 65);
            antwort1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort1.setBackground(new Color(17,9,48));
            antwort1.setForeground(new Color(253, 253, 254));
            this.add(antwort1);

            antwort2.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort2.setBounds(490, 275, 460, 65);
            antwort2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort2.setBackground(new Color(17,9,48));
            antwort2.setForeground(new Color(253, 253, 254));
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

    public JLabel getQuestion() {
        return question;
    }

    public void setQuestion(JLabel question) {
        this.question = question;
    }

    public JButton getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(JButton mainMenu) {
        this.mainMenu = mainMenu;
    }

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }
}
