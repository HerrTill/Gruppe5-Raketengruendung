package Raketengruendung.Rechtsformenfinder.initial;

import Raketengruendung.Rechtsformenfinder.FinderModel;
import Raketengruendung.Rechtsformenfinder.FinderView;

import javax.swing.*;
import java.awt.*;

public class FinderLayout extends JPanel {
    public FinderLayout() {
        JLabel titel = new JLabel("Rechtsformenfinder");
        this.add(titel);
//        this.setLayout(new GridLayout(2,1));
//        this.add(new FinderView(new FinderModel()));
    }
}
