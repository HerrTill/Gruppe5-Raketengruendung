package Raketengruendung.LegalFormFinder.LegalForm;

import javax.swing.*;
import java.awt.*;

public class LegalFormPanel extends JPanel implements LegalFormView {

    private JLabel titel;
    private JLabel rechtsform = new JLabel();
    private JLabel description = new JLabel();
    private JButton back = new JButton();
    private onClickBack onClickBackCallback;

    public LegalFormPanel() {
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        this.rechtsform.setFont(new Font("Tahoma", Font.PLAIN, 50));
        this.rechtsform.setBounds(400, 50, 200, 70);
        this.rechtsform.setForeground(new Color(253, 253, 254));
        this.add(this.rechtsform);

        this.description.setFont(new Font("Tahoma", Font.PLAIN, 21));
        this.description.setBounds(200, 20, 700, 500);
        this.description.setForeground(new Color(150,150,150));
        this.add(this.description);

        this.back.addActionListener(e->this.onClickBackCallback.execute());
        this.back.setBounds(850, 30, 80, 30);
        this.back.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        this.back.setBackground(new Color(17,9,48));
        this.back.setForeground(new Color(253, 253, 254));
        this.add(this.back);
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
