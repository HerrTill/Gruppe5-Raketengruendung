package Raketengruendung.Homescreen;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class HomescreenView extends JPanel {
    private  ResourceBundle resourceBundle = ResourceBundle.getBundle("HOME");

    private JButton but1;
    private JButton but2;
    private JButton but3;
    private JButton but4;

    public HomescreenView() {
        but1 = new JButton();
        but1.setText(resourceBundle.getString("finder"));
        this.add(but1);

        but2 = new JButton();
        but2.setText(resourceBundle.getString("new_founding"));
        this.add(but2);

        but3 = new JButton();
        but3.setText(resourceBundle.getString("current_foundings"));
        this.add(but3);

        but4 = new JButton();
        but4.setText(resourceBundle.getString("current_foundings"));
        this.add(but4);

        this.setLayout(new GridLayout(4, 1));

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
