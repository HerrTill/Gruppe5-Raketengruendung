package Raketengruendung.Rechtsformenfinder.Fragen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Fragen extends JPanel implements FragenView{


    private JLabel question = new JLabel();

    private JButton antwort1 = new JButton();
    private JButton antwort2 = new JButton();
    private JButton antwort3 = new JButton();
    private JButton mainMenu = new JButton();
    private JButton back = new JButton();
    private onClickAnswerOne onClickAnswerOneCallback;
    private onClickAnswerTwo onClickAnswerTwoCallback;
    private onClickAnswerThree onClickAnswerThreeCallback;
    private onClickBack onClickBackCallback;
    private onClickMainmenu onClickMainmenuCallback;

    public Fragen() {
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

        for (ActionListener al : mainMenu.getActionListeners()) {
            mainMenu.removeActionListener(al);
        }
        mainMenu.addActionListener(e->this.onClickMainmenuCallback.execute());
        mainMenu.setBounds(866, 485, 110, 27);
        mainMenu.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        mainMenu.setBackground(new Color(17,9,48));
        mainMenu.setForeground(new Color(60,139,182));
        this.add(mainMenu);

        for (ActionListener al : back.getActionListeners()) {
            back.removeActionListener(al);
        }
        back.addActionListener(e->this.onClickBackCallback.execute());
        back.setBounds(866, 520, 110, 27);
        back.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        back.setBackground(new Color(17,9,48));
        back.setForeground(new Color(60,139,182));
        this.add(back);
    }

    @Override
    public void setOnClickAnswerOne(onClickAnswerOne callback) {
        this.onClickAnswerOneCallback = callback;
    }

    @Override
    public void setOnClickAnswerTwo(onClickAnswerTwo callback) {
        this.onClickAnswerTwoCallback = callback;
    }

    @Override
    public void setOnClickAnswerThree(onClickAnswerThree callback) {
        this.onClickAnswerThreeCallback = callback;
    }

    @Override
    public void setOnClickBack(onClickBack callback) {
        this.onClickBackCallback = callback;
    }

    @Override
    public void setOnClickMainmenu(onClickMainmenu callback) {
        this.onClickMainmenuCallback = callback;
    }

    @Override
    public void setThreeQuestions(boolean isThereAThirdQuestion) {
        if (isThereAThirdQuestion) {
            for (ActionListener al : antwort1.getActionListeners()) {
                antwort1.removeActionListener(al);
            }
            antwort1.addActionListener(e->this.onClickAnswerOneCallback.execute());
            antwort1.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort1.setBounds(490, 150, 460, 65);
            antwort1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort1.setBackground(new Color(17,9,48));
            antwort1.setForeground(new Color(253, 253, 254));
            this.add(antwort1);

            for (ActionListener al : antwort2.getActionListeners()) {
                antwort2.removeActionListener(al);
            }
            antwort2.addActionListener(e->this.onClickAnswerTwoCallback.execute());
            antwort2.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort2.setBounds(490, 225, 460, 65);
            antwort2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort2.setBackground(new Color(17,9,48));
            antwort2.setForeground(new Color(253, 253, 254));
            this.add(antwort2);

            for (ActionListener al : antwort3.getActionListeners()) {
                antwort3.removeActionListener(al);
            }
            antwort3.addActionListener(e->this.onClickAnswerTwoCallback.execute());
            antwort3.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort3.setBounds(490, 300, 460, 65);
            antwort3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort3.setBackground(new Color(17,9,48));
            antwort3.setForeground(new Color(253, 253, 254));
            this.add(antwort3);
        } else {
            for (ActionListener al : antwort1.getActionListeners()) {
                antwort1.removeActionListener(al);
            }
            antwort1.addActionListener(e->this.onClickAnswerOneCallback.execute());
            antwort1.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort1.setBounds(490, 200, 460, 65);
            antwort1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort1.setBackground(new Color(17,9,48));
            antwort1.setForeground(new Color(253, 253, 254));
            this.add(antwort1);

            for (ActionListener al : antwort2.getActionListeners()) {
                antwort2.removeActionListener(al);
            }
            antwort2.addActionListener(e->this.onClickAnswerTwoCallback.execute());
            antwort2.setFont(new Font("Tahoma", Font.PLAIN, 21));
            antwort2.setBounds(490, 275, 460, 65);
            antwort2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            antwort2.setBackground(new Color(17,9,48));
            antwort2.setForeground(new Color(253, 253, 254));
            this.add(antwort2);
        }
    }

    @Override
    public void setBackText(String backText) {
        this.back.setText(backText);
    }

    @Override
    public void setMainmenuText(String mainmenuText) {
        this.mainMenu.setText(mainmenuText);
    }

    @Override
    public void setQuestionText(String questionText) {
        this.question.setText(questionText);
    }

    @Override
    public void setAnswerOneText(String answerOneText) {
        this.antwort1.setText(answerOneText);
    }

    @Override
    public void setAnswerTwoText(String answerTwoText) {
        this.antwort2.setText(answerTwoText);
    }

    @Override
    public void setAnswerThreeText(String answerThreeText) {
        this.antwort3.setText(answerThreeText);
    }


}
