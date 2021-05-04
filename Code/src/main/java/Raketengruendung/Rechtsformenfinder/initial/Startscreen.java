package Raketengruendung.Rechtsformenfinder.initial;

import Raketengruendung.Master.MasterView;
import Raketengruendung.Rechtsformenfinder.FinderView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Startscreen extends JPanel {
    JButton start;
    JButton back;
    public Startscreen() {
        JLabel welcome = new JLabel();
        welcome.setText("Willkommen beim Rechtsformenfinder");
        start = new JButton();
        start.setText("Starten");
        start.addActionListener(new ButtonListener());
        back = new JButton();
        back.setText("Hauptmenü");
        back.addActionListener(new ButtonListener());
        this.add(welcome);
        this.add(start);
        this.add(back);
    }
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == start) {
                System.out.println("start");
                FinderView.startFinder();
            }
            if (e.getSource() == back) {
                System.out.println("back");
//                MasterView.loadHomescreen();
            }
        }
    }
}
