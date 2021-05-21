package Raketengruendung.LegalFormFinder.Questions;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class QuestionsPanel extends JPanel implements QuestionView {


    private JLabel questionLabel = new JLabel();

    private JButton answer1Button = new JButton();
    private JButton answer2Button = new JButton();
    private JButton answer3Button = new JButton();
    private JButton mainMenuButton = new JButton();
    private JButton backButton = new JButton();

    private onClickAnswerOne onClickAnswerOneCallback;
    private onClickAnswerTwo onClickAnswerTwoCallback;
    private onClickAnswerThree onClickAnswerThreeCallback;
    private onClickBack onClickBackCallback;
    private onClickMainmenu onClickMainmenuCallback;

    public QuestionsPanel() {
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

        this.questionLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        this.questionLabel.setBounds(500, 50, 500, 100);
        this.questionLabel.setBackground(new Color(60,139,182));
        this.questionLabel.setForeground(new Color(253, 253, 254));
        this.add(this.questionLabel);

        for (ActionListener al : this.mainMenuButton.getActionListeners()) {
            this.mainMenuButton.removeActionListener(al);
        }
        this.mainMenuButton.addActionListener(e->this.onClickMainmenuCallback.execute());
        this.mainMenuButton.setBounds(866, 485, 110, 27);
        this.mainMenuButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        this.mainMenuButton.setBackground(new Color(17,9,48));
        this.mainMenuButton.setForeground(new Color(60,139,182));
        this.add(this.mainMenuButton);

        for (ActionListener al : this.backButton.getActionListeners()) {
            this.backButton.removeActionListener(al);
        }
        this.backButton.addActionListener(e->this.onClickBackCallback.execute());
        this.backButton.setBounds(866, 520, 110, 27);
        this.backButton.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        this.backButton.setBackground(new Color(17,9,48));
        this.backButton.setForeground(new Color(60,139,182));
        this.add(this.backButton);
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
            for (ActionListener al : this.answer1Button.getActionListeners()) {
                this.answer1Button.removeActionListener(al);
            }
            this.answer1Button.addActionListener(e->this.onClickAnswerOneCallback.execute());
            this.answer1Button.setFont(new Font("Tahoma", Font.PLAIN, 21));
            this.answer1Button.setBounds(490, 150, 460, 65);
            this.answer1Button.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            this.answer1Button.setBackground(new Color(17,9,48));
            this.answer1Button.setForeground(new Color(253, 253, 254));
            this.add(this.answer1Button);

            for (ActionListener al : this.answer2Button.getActionListeners()) {
                this.answer2Button.removeActionListener(al);
            }
            this.answer2Button.addActionListener(e->this.onClickAnswerTwoCallback.execute());
            this.answer2Button.setFont(new Font("Tahoma", Font.PLAIN, 21));
            this.answer2Button.setBounds(490, 225, 460, 65);
            this.answer2Button.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            this.answer2Button.setBackground(new Color(17,9,48));
            this.answer2Button.setForeground(new Color(253, 253, 254));
            this.add(this.answer2Button);

            for (ActionListener al : this.answer3Button.getActionListeners()) {
                this.answer3Button.removeActionListener(al);
            }
            this.answer3Button.addActionListener(e->this.onClickAnswerTwoCallback.execute());
            this.answer3Button.setFont(new Font("Tahoma", Font.PLAIN, 21));
            this.answer3Button.setBounds(490, 300, 460, 65);
            this.answer3Button.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            this.answer3Button.setBackground(new Color(17,9,48));
            this.answer3Button.setForeground(new Color(253, 253, 254));
            this.add(this.answer3Button);
        } else {
            for (ActionListener al : this.answer1Button.getActionListeners()) {
                this.answer1Button.removeActionListener(al);
            }
            this.answer1Button.addActionListener(e->this.onClickAnswerOneCallback.execute());
            this.answer1Button.setFont(new Font("Tahoma", Font.PLAIN, 21));
            this.answer1Button.setBounds(490, 200, 460, 65);
            this.answer1Button.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            this.answer1Button.setBackground(new Color(17,9,48));
            this.answer1Button.setForeground(new Color(253, 253, 254));
            this.add(this.answer1Button);

            for (ActionListener al : this.answer2Button.getActionListeners()) {
                this.answer2Button.removeActionListener(al);
            }
            this.answer2Button.addActionListener(e->this.onClickAnswerTwoCallback.execute());
            this.answer2Button.setFont(new Font("Tahoma", Font.PLAIN, 21));
            this.answer2Button.setBounds(490, 275, 460, 65);
            this.answer2Button.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
            this.answer2Button.setBackground(new Color(17,9,48));
            this.answer2Button.setForeground(new Color(253, 253, 254));
            this.add(this.answer2Button);
        }
    }

    @Override
    public void setBackText(String backText) {
        this.backButton.setText(backText);
    }

    @Override
    public void setMainmenuText(String mainmenuText) {
        this.mainMenuButton.setText(mainmenuText);
    }

    @Override
    public void setQuestionText(String questionText) {
        this.questionLabel.setText(questionText);
    }

    @Override
    public void setAnswerOneText(String answerOneText) {
        this.answer1Button.setText(answerOneText);
    }

    @Override
    public void setAnswerTwoText(String answerTwoText) {
        this.answer2Button.setText(answerTwoText);
    }

    @Override
    public void setAnswerThreeText(String answerThreeText) {
        this.answer3Button.setText(answerThreeText);
    }


}
