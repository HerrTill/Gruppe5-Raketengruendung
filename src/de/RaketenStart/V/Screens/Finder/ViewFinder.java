package de.RaketenStart.V.Screens.Finder;

import de.RaketenStart.Controller;
import de.RaketenStart.V.Listener.onHomeClick;
import de.RaketenStart.V.Listener.onStartClick;

import javax.swing.*;

public class ViewFinder extends JPanel {
    private static ViewFinder[] createdViewFinder = new ViewFinder[1];

    public ViewFinder() {
        JLabel welcome = new JLabel();
        welcome.setText("Willkommen beim Rechtsformenfinder");
        JButton start = new JButton();
        start.setText("Starten");
        start.addActionListener(new onStartClick());
        JButton back = new JButton();
        back.setText("Hauptmenü");
        back.addActionListener(new onHomeClick());
        this.add(welcome);
        this.add(start);
        this.add(back);
        System.out.println("Finder geladen");
    }

    public static void start() {
        ViewFrage frage1 = new ViewFrage1();
        Controller.getView().setPanel(frage1);
    }

    public static ViewFinder factory() {
        if (createdViewFinder[0] == null) {
            createdViewFinder[0] = new ViewFinder();
        }
        return createdViewFinder[0];

    }

}
