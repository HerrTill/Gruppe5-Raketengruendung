package Raketengruendung;


import Raketengruendung.Homescreen.HomescreenController;
import Raketengruendung.Homescreen.HomescreenView;
import Raketengruendung.Initial.Window;
import Raketengruendung.Rechtsformenfinder.FinderView;

import javax.swing.*;

public class RaketengruendungView {
    private JPanel panel;
    private RaketengruendungModel raketengruendungModel;
    public static Window window;
    public static HomescreenView home;
    private static FinderView finder;

    public RaketengruendungView(RaketengruendungModel raketengruendungModel) {
        loadHomescreen();
    }

    public static void loadHomescreen() {
        window = Window.factory();
        window.getContentPane().removeAll();

        window.setTitle("Raketengründung");
        window.setSize(500, 500);

        HomescreenController homescreenController = HomescreenController.factory();
        home = homescreenController.getView();
        window.add(home);

        Window.update();
    }

    public static void loadRechtsformenfinder() {
        window = Window.factory();
        window.remove(home);

        window.setTitle("Raketengründung - Rechtsformenfinder");
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);

        finder = FinderView.factory();
        window.add(finder);

        Window.update();
    }
}
