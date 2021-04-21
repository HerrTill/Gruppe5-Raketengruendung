package Raketengruendung.Homescreen;

import Raketengruendung.Initial.Window;
import Raketengruendung.RaketengruendungView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomescreenView extends JPanel {
    JButton but1;
    JButton but2;
    JButton but3;
    public HomescreenView(HomescreenModel init) {

     //   window.removeAll();
        but1 = new JButton();
        but2 = new JButton();
        but3 = new JButton();
        but1.setText(init.but1());
        but2.setText(init.but2());
        but3.setText(init.but3());
        but1.addActionListener(new ButtonListener());
        but2.addActionListener(new ButtonListener());
        but3.addActionListener(new ButtonListener());
        this.setLayout(new GridLayout(3, 1));
        this.add(but1);
        this.add(but2);
        this.add(but3);
    }

    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == but1) {
                System.out.println("But1");
                RaketengruendungView.loadRechtsformenfinder();
            }
            if (e.getSource() == but2) {
                System.out.println("But2");
            }
            if (e.getSource() == but3) {
                System.out.println("But3");
            }
        }
    }
}
