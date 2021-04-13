package main.V.Screens.Finder;

import main.Controller;
import main.M.Finder.ModelFrage;
import main.Model;
import main.V.Listener.onHomeClick;
import main.V.Listener.onStartClick;

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
        Model model = Controller.getModel();
        ModelFrage Mfrage1 = model.getFinder().getFrage1();
        ViewFrage Vfrage1 = new ViewFrage(Mfrage1);
        Controller.getView().setPanel(Vfrage1);
    }

    public static ViewFinder factory() {
        if (createdViewFinder[0] == null) {
            createdViewFinder[0] = new ViewFinder();
        }
        return createdViewFinder[0];

    }

}
