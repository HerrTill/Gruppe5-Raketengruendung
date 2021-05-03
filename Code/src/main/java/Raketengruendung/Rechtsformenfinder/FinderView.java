package Raketengruendung.Rechtsformenfinder;

import Raketengruendung.Initial.Window;
import Raketengruendung.Rechtsformenfinder.Fragen.FragenController;
import Raketengruendung.Rechtsformenfinder.initial.FinderLayout;
import Raketengruendung.Rechtsformenfinder.initial.Startscreen;

import javax.swing.*;
import java.awt.*;

public class FinderView extends JPanel {
    static FinderView[] views = new FinderView[1];
    private FinderModel model;

    public FinderView(FinderModel model) {
        this.model = model;
        this.add(new Startscreen());
    }

    public static void startFinder() {
        FinderLayout layout = new FinderLayout();
        views[0].removeAll();
        views[0].setLayout(new GridLayout(2,1));
        views[0].add(layout);

        views[0].add(FragenController.getView());
        Window.update();
    }

    public static FinderView factory() {
        if (views[0] == null) {
            views[0] = new FinderView(FinderController.getModel());
        }
        return views[0];
    }

}
