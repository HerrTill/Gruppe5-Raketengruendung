package Raketengruendung.Homescreen;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class HomescreenView extends JPanel {
/*    private static final String RESOURCE_BUNDLE_PATH = "i18n/homescreen/homescreen"; //NON-NLS
    private final ResourceBundle resourceBundle;*/
    
    private JButton but1;
    private JButton but2;
    private JButton but3;

    public HomescreenView() {
//        resourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_PATH);
        but1 = new JButton();
        but2 = new JButton();
        but3 = new JButton();
//        String but = resourceBundle.getString("finder");
    /*    but1.setText(but);
        but2.setText(resourceBundle.getString("neue") + " Gründung");
        but3.setText("Laufende Gründungen");*/
        this.setLayout(new GridLayout(3, 1));
        this.add(but1);
        this.add(but2);
        this.add(but3);

    }

    public JButton getBut1() {
        return but1;
    }

    public JButton getBut2() {
        return but2;
    }

    public JButton getBut3() {
        return but3;
    }

    public void setBut1(JButton but1) {
        this.but1 = but1;
    }

    public void setBut2(JButton but2) {
        this.but2 = but2;
    }

    public void setBut3(JButton but3) {
        this.but3 = but3;
    }
}
