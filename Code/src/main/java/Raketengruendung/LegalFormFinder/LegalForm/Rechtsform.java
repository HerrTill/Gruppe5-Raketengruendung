package Raketengruendung.LegalFormFinder.LegalForm;

import javax.swing.*;
import java.awt.*;

public class Rechtsform extends JPanel implements RechtsformView {

    private JLabel titel;
    private JLabel rechtsform = new JLabel();
    private JLabel description = new JLabel();
    private JButton back = new JButton();
    private onClickBack onClickBackCallback;

    public Rechtsform() {
//        this.add(titel);
        //lol
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        this.rechtsform.setFont(new Font("Tahoma", Font.PLAIN, 50));
        this.rechtsform.setBounds(400, 50, 200, 70);
        this.rechtsform.setForeground(new Color(253, 253, 254));
        this.add(this.rechtsform);

        description.setFont(new Font("Tahoma", Font.PLAIN, 21));
        description.setBounds(200, 150, 600, 100);
        //description.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        description.setForeground(new Color(150,150,150));
        this.add(description);

        back.addActionListener(e->this.onClickBackCallback.execute());
        back.setBounds(850, 30, 80, 30);
        back.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        back.setBackground(new Color(17,9,48));
        back.setForeground(new Color(253, 253, 254));
        this.add(back);
    }

    @Override
    public void setOnClickBack(onClickBack callback) {
        this.onClickBackCallback = callback;
    }

    @Override
    public void setTitleText(String titleText) {
        this.rechtsform.setText(titleText);
    }

    @Override
    public void setDescriptionText(String descriptionText) {
        this.description.setText(descriptionText);
    }

    @Override
    public void setBackText(String backText) {
        this.back.setText(backText);
    }
}
