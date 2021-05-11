package Raketengruendung.Rechtsformenfinder.Rechstform;

import javax.swing.*;
import java.awt.*;

public class RechtsformView extends JPanel {
    private JLabel titel;
    private JLabel rechtsform = new JLabel("GmbH");
    private JLabel description = new JLabel("die GmbH ist eine Gesellschaft mit beschränkter Haftung. blablablalba-------------------------------------------------");
    private JButton back = new JButton("Back");;



    public RechtsformView() {
//        this.add(titel);
        this.setLayout(null);
        this.setBackground(new Color(17,9,48));

        rechtsform.setFont(new Font("Tahoma", Font.PLAIN, 50));
        rechtsform.setBounds(400, 50, 200, 70);
        rechtsform.setForeground(new Color(253, 253, 254));
        this.add(rechtsform);

        description.setFont(new Font("Tahoma", Font.PLAIN, 21));
        description.setBounds(200, 150, 600, 100);
        description.setForeground(new Color(150,150,150));
        this.add(description);

        back.setBounds(820, 30, 70, 30);
        back.setBackground(new Color(17,9,48));
        back.setForeground(new Color(253, 253, 254));
        back.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,139,182)));
        this.add(back);
    }

    public JLabel getTitel() {
        return titel;
    }

    public void setTitel(JLabel titel) {
        this.titel = titel;
    }

    public JButton getBack() {
        return back;
    }

    public void setBack(JButton back) {
        this.back = back;
    }
}
