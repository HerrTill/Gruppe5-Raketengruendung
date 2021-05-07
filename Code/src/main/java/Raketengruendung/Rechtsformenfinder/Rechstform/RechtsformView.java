package Raketengruendung.Rechtsformenfinder.Rechstform;

import javax.swing.*;

public class RechtsformView extends JPanel {
    private JLabel titel;
    private JButton back;


    public RechtsformView() {
//        this.add(titel);
        back = new JButton("Back");
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
